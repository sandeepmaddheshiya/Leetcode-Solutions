
public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=1;
        int ans=0;
        if(nums.length==1){
            return (nums[0]==0)?0:1;
        }
        if(nums.length==2){
            if(nums[0]==0 && nums[1]==0)
            {
                return 0;
            }
            if(nums[0]==1 && nums[1]==1){
                return 2;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]&&nums[i]==1){
                count++;
            }else{
                count=1;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}
