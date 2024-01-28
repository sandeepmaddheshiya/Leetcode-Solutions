class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
       int[] arr=new int[h.size()];
       int index = 0;
        for (Integer value : h) {
            arr[index] = value;
            index++;
        }
       Arrays.sort(arr);
       return (arr.length<3)?arr[arr.length-1]:arr[arr.length-3];
    }
}