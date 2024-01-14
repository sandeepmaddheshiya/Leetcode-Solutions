
public class Count_Elements_With_Maximum_Frequency {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int mFreq=0;
        for (int e : nums) {
            if (hmap.containsKey(e)) {
                hmap.put(e, hmap.get(e) + 1);
            }
            else {
                hmap.put(e, 1);
            }
    }
       
        int maxKey=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
       
        {
            if(hmap.get(nums[i])>mFreq){
                mFreq=hmap.get(nums[i]);
                maxKey=nums[i];}
        }
         int result = 0;

        for (int count : hmap.values()) {
            if (count == mFreq) {
                result++;
            }
        }
        return result*mFreq;
        
}
}
