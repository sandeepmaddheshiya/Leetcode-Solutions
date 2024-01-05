

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            res=Math.max(res,(nums[i]-1)*(nums[j]-1));
            }
            
        }
        return res;
    }
}
