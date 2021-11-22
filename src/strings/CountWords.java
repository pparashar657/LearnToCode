package strings;

public class CountWords {

	public static void main(String[] args) {
		System.out.println((int)'z');
		System.out.println(countWords("a\nhjpfo   \n\n\n"));
	}
	
	static int countWords(String s) 
    { 
		int count = 0;
        for (int i=1;i<s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            
            if ((curr == ' ' || curr == '\n' || curr == '\t') && (prev >= 97 && prev <= 122)) {
                count++;
            }
        }
        char curr = s.charAt(s.length() - 1);
        if ((curr == ' ' || curr == '\n' || curr == '\t'))
            count--;
        
        return count + 1;
    }

}
