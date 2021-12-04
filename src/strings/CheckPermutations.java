package strings;

public class CheckPermutations {

	public static void main(String[] args) {
		System.out.println(checkInclusion("adc", "dcda"));

	}
	
	public static boolean checkInclusion(String s1, String s2) {
        int[] s1Map = stringToMap(s1);
        int n = s1.length();
        String curr = s2.substring(0, n);
    	System.out.println(curr);
    	
    	int[] currMap = stringToMap(curr);
    	if(isEqualMap(s1Map, currMap)) {
    		return true;
    	}
        for (int i = 1; i + n <= s2.length(); i++) {
        	currMap[s2.charAt(i-1)]--;
        	currMap[s2.charAt(i+n-1)]++;
//        	System.out.println("s1map = " + getStr(s1Map));
//        	System.out.println("currMap = " + getStr(currMap));
        	
        	if(isEqualMap(s1Map, currMap)) {
        		return true;
        	}
    
        }
        return false;
        
    }

	static String getStr(int[] map) {
		
		int[] temp = map.clone();
		
		String str = "";
		for (int i=0; i< temp.length;) {
			if(temp[i] > 0) {
				str += (char)i;
				temp[i]--;
			} else {
				i++;
			}
		}
		return str;
	}
	
	private static boolean isEqualMap(int[] map1, int[] map2) {
		for (int i = 0; i< map1.length; i++) {
			if (map1[i] != map2[i]) return false;
		}
		return true;
	}

	private static int[] stringToMap(String str) {
		int[] map = new int[127];
        for (char ch: str.toCharArray()) {
        	map[ch]++;
        }
        return map;
	}

}
