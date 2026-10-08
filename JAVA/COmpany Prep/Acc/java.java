import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr = {2, 3, 3, 3, 2, 2, 6, 4, 4, 4, 4};

        int chainCount = 0;
        int count = 1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                if(arr[i-1] == count){
                    chainCount++;
                }
                count = 1;
            }
        }
        
        if(arr[arr.length-1]==count){
            chainCount++;
        }
        
        System.out.print(chainCount);
    }
}
// 