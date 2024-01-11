

public class Missing_Number {
    public int missingNumber(int[] nums) {
        int n=nums.length;
         long actualSum = (n*(n+1))/2;

         long sum=0;
         for(int elements: nums){
             sum+=elements;
         }
         return (int)(actualSum-sum);
    }
}
