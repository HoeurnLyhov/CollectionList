import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class ExArrayListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(100);
		arr.add(10);
		arr.add(50);
		arr.add(45);
		arr.add(90);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("ABC");
		arr1.add("ACBD");
		arr1.add("ABDC");
		arr1.add("abcd");
		arr1.add("bcds");
		
		Collections.sort(arr1);
		System.out.println(arr1);
		String srr="";
		for(String s:arr1){
			srr += (s+=".....");
		}
		System.out.println(srr);

	}

}
