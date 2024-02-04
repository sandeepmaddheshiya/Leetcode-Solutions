class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int e=s.length()-1;
        while(s.charAt(e)==' '){
            e--;
        }
        for(int i=e;i>=0;i--){
            if(s.charAt(i)!=' ') ans++;
            if(s.charAt(i)==' ') break;
        }
        return ans;
    }
}