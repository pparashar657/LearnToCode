package classes;

import java.util.Stack;

public class MainStack {
	
	public static void main(String[] args) {
//		MyStackAsArray stack = new MyStackAsArray();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.print();
//		stack.pop();
//		stack.pop();
//		System.out.println(stack.peek());
//		if (stack.isEmpty()) {
//			System.out.println("stack is empty");
//		}else {
//			System.out.println("stack is not empty");
//		}
//		stack.print();
		
//		MyStackAsLL stack = new MyStackAsLL();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.print();
//		stack.pop();
//		stack.pop();
//		System.out.println(stack.peek());
//		if (stack.isEmpty()) {
//			System.out.println("stack is empty");
//		}else {
//			System.out.println("stack is not empty");
//		}
//		stack.print();
		
//		String str = "My name is khan and I am not a terrorist";
//		revereWords(str);
		
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		print(stack);
//		
//		reverse(stack);
//		System.out.println("==================");
//		print(stack);
		
//		String exp = "234^*82/-";
//		String exp2 = "-*2^34/82";
//		System.out.println(evalPostfix(exp));
//		System.out.println(evalPrefix(exp2));
//		
		
		
//		String exp = "((a^b/c)*(d-e*f))";
//		System.out.println(prefix(exp));
//		
		
		
//		String str = "2+(3*5-4^2)";
//		System.out.println(eval(str));
		
		
//		String str = "+2*35";
//		String str2 = "235*+";
//		System.out.println(preToIn(str));
//		
//		System.out.println(postToIn(str2));
		
		StackUSingQueues2 stack = new StackUSingQueues2();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	

	private static String postToIn(String str) {
		Stack<String> stack = new Stack<String>();
		
		for (int i=0;i<str.length();i++) {
			char curr = str.charAt(i);
			if (curr == '^' || curr == '*' || curr == '/' ||curr == '+' ||curr == '-') {
				String op2 = stack.pop();
				String op1 = stack.pop();
				String ans = '('+op1+curr+op2+')';
				stack.push(ans);
			} else {
				stack.push(curr+"");
			}
		}
		return stack.peek();
	}


	private static String preToIn(String str) {
		Stack<String> stack = new Stack<String>();
		
		for (int i=str.length()-1; i>=0; i--) {
			char curr = str.charAt(i);
			if (curr == '^' || curr == '*' || curr == '/' ||curr == '+' ||curr == '-') {
				String op1 = stack.pop();
				String op2 = stack.pop();
				String ans = '('+op1+curr+op2+')';
				stack.push(ans);
			} else {
				stack.push(curr+"");
			}
		}
		return stack.peek();
	}


	private static int eval(String str) {
		Stack<Integer> nums = new Stack<>();
		Stack<Character> ops = new Stack<>();
		
		for (int i=0;i<str.length();i++) {
			char curr = str.charAt(i);
			
			if (curr >= '0' && curr <= '9') {
				nums.push(curr-'0');
			} else if (curr == '(') {
				ops.push(curr);
			} else if (curr == ')') {
				while (!ops.isEmpty() && ops.peek() != '(') {
					performOperation(nums, ops);
				}
				ops.pop();
			} else {
				while (!ops.isEmpty() && prec(curr) <= prec(ops.peek())) {
					performOperation(nums, ops);
				}
				ops.push(curr);
			}
		}
		while(!ops.isEmpty()) {
			performOperation(nums, ops);
		}
		return nums.peek();
	}


	private static void performOperation(Stack<Integer> nums, Stack<Character> ops) {
		int op2 = nums.pop();
		int op1 = nums.pop();
		char operator = ops.pop();
		nums.push(operation(op1,op2,operator));
	}
	
	private static int operation(int op1, int op2, char operator) {
		switch(operator) {
			case '^':  return (int)Math.pow(op1, op2);
			case '*': return op1*op2;
			case '/': return op1/op2;
			case '+': return op1+op2;
			case '-': return op1-op2;
			default: return 0;
		}
	}
	
	static int prec(char op) {
        switch(op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default: return 0;
        }
    }


	private static String prefix(String exp) {
		String newExp = "";
		for (int i=0;i<exp.length();i++) {
			if (exp.charAt(i) == '(') {
				newExp = ')'+newExp;
			}else if (exp.charAt(i) == ')') {
				newExp = '('+newExp;
			}else {
				newExp = exp.charAt(i) + newExp;
			}
		}
		 String tempAns = infixToPostfix(newExp);
		 String ans = "";
		 for (int i=0;i<tempAns.length();i++) {
			 ans = tempAns.charAt(i) + ans;
		 }
		 return ans;
	}

    
	public static String infixToPostfix(String exp) {
	    String ans = "";
	    Stack<Character> stack = new Stack<>();
	    for (int i=0;i<exp.length();i++) {
	        if ((exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z') || (exp.charAt(i) >= 'A' && exp.charAt(i) <= 'Z')) {
	            ans += exp.charAt(i);
	        } else if (exp.charAt(i) == '(') {
	            stack.push(exp.charAt(i));
	        } else if (exp.charAt(i) == ')') {
	            while(!stack.isEmpty() && stack.peek() != '(') {
	                ans += stack.pop();
	            }
	            stack.pop();
	        } else {
	            while (!stack.isEmpty() && prec(stack.peek()) >= prec(exp.charAt(i))) {
	                ans += stack.pop();
	            }
	            stack.push(exp.charAt(i));
	        }
	    }
	    while(!stack.isEmpty()) {
	        ans += stack.pop();
	    }
	    return ans;
	} 
	
	static int eval(int op1, int op2, char operator) {
		switch (operator) {
			case '^': return (int)Math.pow(op1, op2);
			case '*': return op1*op2;
			case '/': return op1/op2;
			case '+': return op1+op2;
			case '-': return op1-op2;
			default: return -1;
		}
	}
	
	private static int evalPrefix(String exp) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = exp.length()-1; i>=0;i--) {
			if (exp.charAt(i) >= '0' && exp.charAt(i) <= '9') {
				stack.push(exp.charAt(i)-'0');
			} else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(eval(op1,op2,exp.charAt(i)));
			}
		}
		return stack.peek();
	}

	private static int evalPostfix(String exp) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i<exp.length();i++) {
			if (exp.charAt(i) >= '0' && exp.charAt(i) <= '9') {
				stack.push(exp.charAt(i)-'0');
			} else {
				int op2 = stack.pop();
				int op1 = stack.pop();
				stack.push(eval(op1,op2,exp.charAt(i)));
			}
		}
		return stack.peek();
	}

	private static void reverse(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int ele = stack.pop();
			reverse(stack);
			iab(stack,ele);
		}
	}

	private static void iab(Stack<Integer> stack, int ele) {
		if(stack.isEmpty()) {
			stack.push(ele);
			return;
		}
		int num = stack.pop();
		iab(stack,ele);
		stack.push(num);
	}

	private static void print(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int ele = stack.pop();
			System.out.println(ele);
			print(stack);
			stack.push(ele);
		}
	}

	private static void revereWords(String str) {
		String words[] = str.split(" ");
		Stack<String> stack = new Stack<>();
		for (String word: words) {
			stack.push(word);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() +" ");
		}
	}
	
	public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op: ops) {
            if (op == "+") {
                int first = stack.pop();
                int second = stack.pop();
                int sum = first + second;
                stack.push(second);
                stack.push(first);
                stack.push(sum);
            }
            else if (op.equals("D")) {
                stack.push(2*stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            }else {
                int num = Integer.valueOf(op);
                stack.push(num);
            }
            System.out.println(stack.peek());
            
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

}
