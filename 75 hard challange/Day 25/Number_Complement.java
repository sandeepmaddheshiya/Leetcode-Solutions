class Solution {
    public int findComplement(int num) {
       int tmp = (int) (Math.pow(2,digits(num))-1);
        return tmp - num; 
    }
     static int digits(int n){
        int count = 0;
        while(n > 0){
            n = n/2;
            count++;
        }
        return count;
    }
}