// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         int n = name.length();
        
//         for(int i=0;i<name.length()/2;i++){
//             if(name.charAt(i) != name.charAt(n-i-1)){
//                 System.out.println("False");
//                 break;
//             }
//         }
//         System.out.println("True");
        
//     }
// }

import java.util.*;
public class Main{
    public static void main(String[] arg){
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            int n = name.length();
            int l = 0;
            int r = n-1;
            
            while(l<r){
                if(name.charAt(l) != name.charAt(r)){
                    System.out.println("False");
                    return;
                }
                l++;
                r--;
            }
            System.out.println("True");
        }
    }
}