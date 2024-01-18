public class Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int c=nums.length/2;
        if(nums.length==1) return nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;
            }else{
                count=1;
            }
            if(count>c) return nums[i-1];
        }
        return -1;
    }
}
