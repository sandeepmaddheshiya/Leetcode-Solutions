import java.util.ArrayList;
import java.util.List;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
       
        List<Integer> res = new ArrayList<Integer>();
        boolean check=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]+nums[j]==target){
                    check=true;
                }
                if(check){
                   res.add(i);
                   res.add(j);
                    check =false;
                }
            }
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
         
     }
}
