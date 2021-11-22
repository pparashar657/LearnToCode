package strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Pawan");
		System.out.println(sb);
		
		// Functions in StringBuilder
		String name = sb.toString();
		System.out.println(name);
		
		sb.append(" is okay");
		System.out.println(sb);
		
		// Update
		sb.setCharAt(0, 'A');
		System.out.println(sb);
		
		// Get
		System.out.println(sb.charAt(1));
		
		// remove Character
		
		sb.deleteCharAt(1);
		System.out.println(sb);
	}

}
