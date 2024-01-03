

public class Find_Words_Containing_Character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> aList=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                aList.add(i);
            }
        }
        return aList;
    }
}
