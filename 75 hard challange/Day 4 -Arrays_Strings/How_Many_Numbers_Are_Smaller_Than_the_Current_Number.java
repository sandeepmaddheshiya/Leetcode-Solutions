

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] cpy=nums.clone();
        Arrays.sort(cpy);
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(cpy[i],i);
        }
        for(int i=0;i<nums.length;i++){
            cpy[i]=map.get(nums[i]);
        }
        return cpy;
    }
}
