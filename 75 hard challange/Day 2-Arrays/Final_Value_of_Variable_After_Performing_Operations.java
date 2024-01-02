/**
 * Final_Value_of_Variable_After_Performing_Operations
 */
public class Final_Value_of_Variable_After_Performing_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X")||operations[i].equals("X++")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
    
}