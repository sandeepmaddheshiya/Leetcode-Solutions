

public class Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int spc=0;
        int res=0;
        for(int i=0;i<sentences.length;i++){
            for(int j=0;j<sentences[i].length();j++){
                char ch=sentences[i].charAt(j);
                if(ch==' '){
                    spc++;
                }
            }
            res=Math.max(res,spc+1);
            spc=0;
        }
        return res;
    }
}
