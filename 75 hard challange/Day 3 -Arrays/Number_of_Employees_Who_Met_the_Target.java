
public class Number_of_Employees_Who_Met_the_Target {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                ans++;
            }
        }
        return ans;
    }
}
