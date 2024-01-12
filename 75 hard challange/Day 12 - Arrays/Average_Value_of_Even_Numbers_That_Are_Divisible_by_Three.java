

public class Average_Value_of_Even_Numbers_That_Are_Divisible_by_Three {
    public int averageValue(int[] nums) {
        ArrayList<Integer> arList=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                arList.add(nums[i]);
            }
        }
        for(int i=0;i<arList.size();i++){
            sum+=arList.get(i);
        }
        
        return (sum==0)?0:sum/arList.size();
    }
}
