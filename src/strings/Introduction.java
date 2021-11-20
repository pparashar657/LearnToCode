package strings;

public class Introduction {

	public static void main(String[] args) {
//		String str1 = "Pawan";
//		
//		System.out.println(str1);
//		System.out.println(str1.length());
//		
//		System.out.println(str1.charAt(0) +" " + str1.charAt(2));
//		
//		String str2 = "Pawan";
//		
////		str2 += " is ok";
////		
//		System.out.println(str2);
//		
//		
//		System.out.println(str1 == str2);
//		
//		String str3 = new String("Pawan");
//		String str4 = new String("Pawan");
//		
//		String str5 = str3;
//		
//		System.out.println(str3 == str5);
//		
//		System.out.println(str3 == str4);
//		
//		System.out.println(str3 == str1);
//		
//		// To check values
//		
//		System.out.println(str1.equals(str3));
//		System.out.println(str4.equals(str3));
//		
//		
//		int n = 100000;
//		
//		long start = System.currentTimeMillis();
//		
//		int count = 0;
//		for (int i=0;i<n;i++) {
//			count += 1;
//		}
//		
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
////		
//		long start = System.currentTimeMillis();
//		
//		
//		String str = "";
//		
//		for (int i=0;i<n;i++) {
//			str += ".";
//		}
//		
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		
		// Important Functions in Strings
		
//		String str = "This is string";
//		System.out.println(str.length());
//		
//		String st = "a";
//		st += 'v';
//		
//		System.out.println(str.charAt(0));
//		
//		// Search
//		System.out.println(str.indexOf("."));
//		System.out.println(str.lastIndexOf("i"));
//		
//		System.out.println(str.contains("i "));
//		
//		// Comparing
//		
//		System.out.println("THis".compareTo("THit"));
//		System.out.println("THis".compareToIgnoreCase("THiS"));
//		
//		
//		System.out.println("a".equals("A"));
//		
//		System.out.println("a".equalsIgnoreCase("A"));
//		
//		// Replacing 
//		
//		String name = "Pawan";
//		
//		System.out.println(name.replace("aw", "z"));
//		System.out.println(name.replaceFirst("aw", "z"));
//		
//		System.out.println(name.toLowerCase());
//		System.out.println(name);
//		System.out.println(name.toUpperCase());
//		System.out.println(name);
//				
//		
//		// Substring
//		String str2 = "My name is khan";
//		System.out.println(str2.substring(3));
//		System.out.println(str2.substring(3, 6));
//		
//		System.out.println(str2.subSequence(3, 6));
//		
//		System.out.println("".isEmpty());
//		System.out.println("a".isEmpty());
//		
//		System.out.println("".isBlank());
//		System.out.println(" ".isBlank());
//		System.out.println("a".isBlank());
//		
		// Split function
		
		String str3 = "This is new String";
		String[] words = str3.split(" ");
		for (String word: words) {
			System.out.println(word);
		}
		
		String str = "   Thi is Pawan     ";
		
		System.out.println(str.trim());
		System.out.println(str);
		
		int a = 100;
		
		String numA = String.valueOf(a);
		System.out.println(numA);
		
		String num = "100";
		int nu = Integer.valueOf(num);
		
		System.out.println(nu/2);
		
		String str4 = "Pawan";
		
		char[] charArr = str4.toCharArray();
		
		charArr[0] = 'a';
		
		System.out.println(charArr);
		
		String str5 = String.valueOf(charArr);
		
		System.out.println(str5);
		
	}

}
