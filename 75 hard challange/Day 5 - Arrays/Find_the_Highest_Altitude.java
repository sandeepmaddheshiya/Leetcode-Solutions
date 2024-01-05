/**
 * Find_the_Highest_Altitude
 */
public class Find_the_Highest_Altitude {

    public int largestAltitude(int[] gain) {
        int pref_sum=0;
        int res=0;
        for(int i=0;i<gain.length;i++){
            pref_sum+=gain[i];
            res=Math.max(res,pref_sum);
        }
        return res;
    }
}