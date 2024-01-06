
public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int pk=0;
        if(nums.length==1) return 0;
        else if(nums.length==2){
            if(nums[0]>nums[1]){
                return 0;
            }else{
                return 1;
            }
        }
        
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                pk=i;
            }else if(nums[i]<nums[i+1]){
                pk=i+1;
            }
        }
        return pk;
    }
}
