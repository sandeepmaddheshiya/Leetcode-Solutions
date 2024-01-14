

public class Maximum_Gap {
    public int maximumGap(int[] nums) {
        int mGap=0;
        Arrays.sort(nums);
        if(nums.length<2) return 0;
        for(int i=1;i<nums.length;i++){
            mGap=Math.max(mGap,nums[i]-nums[i-1]);
        }
        return mGap;
    }
}
