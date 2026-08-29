import java.util.ArrayList;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// Add elements (amortized O(1))
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list); // Printing the list

		// Getting the value by index (O(1))
		int element = list.get(1);
		int element1 = list.get(2);
		System.out.println(element);
		System.out.println(element1);

		// Contains check (O(n))
		System.out.println(list.contains(40));
		System.out.println(list.contains(100));
	}
}
