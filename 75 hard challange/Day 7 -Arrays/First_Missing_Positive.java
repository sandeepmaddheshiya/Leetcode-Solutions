
public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int n1=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            if(nums[i]==n1){
                n1++;
            }
        }
        return n1;
    }
}
