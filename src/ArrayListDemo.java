import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList arr=new ArrayList();
		//ArrayList <String>arr=new<String> ArrayList();
		//LinkedList arr=new LinkedList();
		LinkedList <Integer>arr=new LinkedList<Integer>();
		
		arr.add(100);
		arr.add(20);
		arr.add(30);
		arr.add(35);
		arr.add(24);
		arr.add(54);
		arr.add(100);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		ArrayList<String> arr1=new ArrayList<String>();
		
		arr1.add("XYZ");
		arr1.add("aB");
		arr1.add("BC");
		arr1.add("AC");
		arr1.add("ABCD");
		arr1.add("XYZ");
		
		Collections.sort(arr1);
		System.out.println(arr1);
		String str="";
		for(String s:arr1)
		{
			str+=(s+="...");
		}
		System.out.println(str);
		
	}

}
