
public class Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        int end=numbers.length-1;
        int[] res=new int[2];
        int start=0,sum=0;
        while(start<end){
            sum=numbers[start]+numbers[end];
            if(sum==target){
                res[0]=start+1;
                res[1]=end+1;
                break;
            }
            else if(sum>target){
                end--;
            }else{
                start++;
            }
            
        }
        return res;
    }
}
