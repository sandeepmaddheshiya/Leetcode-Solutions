

public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public double average(int[] salary) {
        double ans=0;
        ArrayList<Integer> arList=new ArrayList<>();
        Arrays.sort(salary);
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=salary[0] && salary[i]!=salary[salary.length-1])
            {
                arList.add(salary[i]);
            }
        }
        for(int i=0;i<arList.size();i++){
            ans+=arList.get(i);
        }
        return ans/arList.size();
    }
}
