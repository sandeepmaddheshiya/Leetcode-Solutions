

public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=nums.length,j=0;i<2*nums.length&&j<nums.length;i++,j++){
            ans[i]=nums[j];
        }
        return ans;
    }
}
