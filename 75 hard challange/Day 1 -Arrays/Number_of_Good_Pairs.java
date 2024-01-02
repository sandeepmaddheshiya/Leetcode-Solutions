

public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&& i<j){
                    res++;
                }
            }
        }
        return res;
    }
}
