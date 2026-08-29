import java.util.ArrayList;
import java.util.Scanner;

// public class InteractiveMain {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             list.add(sc.nextInt());
//         }

//         // printing the values
//         for (int i = 0; i < n; i++) {
//             System.out.print(list.get(i) + " ");
//         }
//         System.out.println();
//         sc.close();
//     }
// }

import java.util.*;
public class InteractiveMain{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0;i<n;i++){
	        list.add(sc.nextInt());
	    }
	    int max = Integer.MIN_VALUE;
	    
	    for(int i=0;i<n;i++){
	        max = Math.max(max, list.get(i));   
	    }
	    
	    System.out.println("Max Value in ArrayList: "+ max);   
	}
}
