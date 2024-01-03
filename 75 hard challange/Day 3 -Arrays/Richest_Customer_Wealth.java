

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=Math.max(sum,accounts[i][j]+sum);
                res=Math.max(sum,res);
            }
        }
        return res;
    }
}
