class Solution {
    public int firstUniqChar(String s) {
        // ArrayList<Character>al=new ArrayList<>();
        // for(int i=0;i<s.length();i++){
        //     al.add(s.charAt(i));
        // }
        // int res=-1;
        // for(int i=0;i<s.length();i++){
        //     if(Collections.frequency(al,s.charAt(i))==1){
        //         res= i;
        //         break;
        //     }
        // }
        // return res;


        HashMap<Character, Integer> charCount = new HashMap<>();
    
    // Count the occurrences of each character
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    
    // Find the first unique character
    for (int i = 0; i < s.length(); i++) {
        if (charCount.get(s.charAt(i)) == 1) {
            return i;
        }
    }
    
    return -1; // No unique character found
    }
}