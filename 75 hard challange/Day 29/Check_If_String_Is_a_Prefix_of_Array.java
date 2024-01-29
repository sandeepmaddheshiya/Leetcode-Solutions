class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String s1="";
        for(int i=0;i<words.length;i++){
            s1=s1+words[i];
            if(s1.equals(s)) return true;
        }
        return false;
    }
}