

public class Sort_the_People {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
         for(int i= 0 ; i < names.length; i++){
             map.put(heights[i], names[i]);
         }
         
         //default sorting behaviour
         Arrays.sort(heights);
         //just reverse the sorted element to get the sorted in decending order
         for(int i = 0; i < heights.length / 2; i++)
 {
     int temp = heights[i];
     heights[i] = heights[heights.length - i - 1];
     heights[heights.length - i - 1] = temp;
 }
         
         
         
         String [] res = new String[names.length];
         
         for(int i= 0; i < heights.length; i++){
             res[i] = map.get(heights[i]);
         }
         
         return res;
     }
}
