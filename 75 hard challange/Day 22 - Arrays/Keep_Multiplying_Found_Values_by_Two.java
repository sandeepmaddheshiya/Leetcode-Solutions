
public class Keep_Multiplying_Found_Values_by_Two {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original*=2;
            }
        }
        return original;
    }
}
