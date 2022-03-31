public int lengthOfLongestSubstring(String s) {
    Integer [] chars = new Integer[128]; //integer table
    int left = 0; //left sliding window
    int right = 0; //right sliding window
        
    int result = 0; //value of size of largest substring
    while (right < s.length()) {
        char r = s.charAt(right); //index of right window
            
        Integer index = chars[r];
        //index has been visited or repeated character, move left to close up window and not repeat visiting duplicate characters
        if (index != null && index >= left && index < right) left = index + 1;
            
        result = Math.max(result, right - left + 1);
            
        chars[r] = right;
        right++;
    }
        
    return result;
}

/*
public int lengthOfLongestSubstring(String s) {
    int [] chars = new int[128];
        
    int left = 0;
    int right = 0;
        
    int result = 0;
        
    while (right < s.length()) {
        char r = s.charAt(right);
        chars[r]++;
            
        while (chars[r] > 1) {
            char l = s.charAt(left);
            chars[l]--;
            left++;
        }
        
        result = Math.max(result, right - left + 1);
        right++;
    }
    return result;
}
with hash map
public int lengthOfLongestSubstring(String s) {
    int n = s.length(), result = 0;
    Map<Character, Integer> map = new HashMap<>(); //index of current character
    for (int i = 0, j = 0; j < n; j++) {
        if (map.containsKey(s.charAt(j))) {
            i = Math.max(map.get(s.charAt(j)), i);
        }
        result = Math.max(result, j - i + 1);
        map.put(s.charAt(j), j + 1);
    }
    return result;
}
*/
