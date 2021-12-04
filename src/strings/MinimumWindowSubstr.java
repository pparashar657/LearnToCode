package strings;

public class MinimumWindowSubstr {

	public static void main(String[] args) {
		
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
		
		
	}
	
	public static String minWindow(String s, String t) {
        int[] t1Map = stringToMap(t);
        
        int currStart = 0;
        int currLength = 0;
        
        int ansStart = -1;
        int ansLength = Integer.MAX_VALUE;
        
        int[] currMap = new int[128];
        
        StringBuilder curr = new StringBuilder();
        
        while(currStart + currLength <= s.length()) {
        	
        	if (presentAll(t1Map, currMap)) {
        		if (curr.length() < ansLength) {
        			ansLength = curr.length();
        			ansStart = currStart;
        		}
        		curr.deleteCharAt(0);
        		currMap[s.charAt(currStart)]--;
        		currStart++;
        		currLength--;
        	} else {
        		currLength++;
        		if (currStart + currLength <= s.length()) {
        			currMap[s.charAt(currStart + currLength - 1)]++;
        			curr.append(s.charAt(currStart + currLength - 1));
        		}
        	}
        }
        if (ansStart == -1) return "";
        return s.substring(ansStart, ansStart + ansLength);
        
    }
	
	private static boolean presentAll(int[] t1Map, int[] currMap) {
		for (int i = 0; i< t1Map.length; i++) {
			if (t1Map[i] > 0 && currMap[i] < t1Map[i]) {
				return false;
			}
		}
		return true;
	}

	private static int[] stringToMap(String str) {
		int[] map = new int[128];
        for (char ch: str.toCharArray()) {
        	map[ch]++;
        }
        return map;
	}

}
