package map;

public class MyMap {

	static int MAX_LIMIT = 97;
	static int[] myMap = new int[MAX_LIMIT];
	
	public static void main(String[] args) {
		
		
		storePrice("Pawan", 10);
		storePrice("Chirag", 15);
		storePrice("Ankit", 20);
		storePrice("Pawan", 100);
		
		
		System.out.println(getPrice("Pawan"));
		System.out.println(getPrice("Ankit"));
		System.out.println(getPrice("ankit"));
		
	}
	
	private static int getPrice(String key) {
		int hashIndex = getHash(key);
		if (myMap[hashIndex] == 0) {
			return -1;
		}
		return myMap[hashIndex];
	}

	private static void storePrice(String key, int value) {
		int hashIndex = getHash(key);
		myMap[hashIndex] = value;
	}

	static int getHash(String key) {
		int hash = 0;
		for(int i=1; i<= key.length(); i++) {
			hash += (i*key.charAt(i-1));
		}
		return hash%MAX_LIMIT;
	}

}
