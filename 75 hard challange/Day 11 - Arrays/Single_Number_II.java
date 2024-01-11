
public class Single_Number_II {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
 
        for (int i = 0; i < nums.length; i++)
        {
            mp.put(nums[i], mp.get(nums[i]) == null ? 1 : mp.get(nums[i]) + 1);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}
