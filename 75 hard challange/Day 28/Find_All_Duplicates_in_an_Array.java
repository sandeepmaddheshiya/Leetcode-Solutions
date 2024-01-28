class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(Integer key:hm.keySet()){
            if(hm.get(key)>=2){
                al.add(key);
            }
        }
        Collections.sort(al);
        return al;
    }
}