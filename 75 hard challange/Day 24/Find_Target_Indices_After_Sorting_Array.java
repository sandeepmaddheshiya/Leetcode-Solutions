import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                al.add(i);
            }
        }
        return al;
    }
}