import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class udemyarraylist {

public static void main(String args[]) {
	int[] array = {4,1,15,22,25,27};
	
//Loop declaration & using Conditional statements inside the loops	
	for(int i=0; i<array.length; i++) {
		if (array[i] % 5 == 0 ) {
		System.out.println(array[i]);
		break;
		}
		else {
			System.out.println(array[i] + " Is not multiply by 5");	
			}
	}
//Array list 
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("DHARA");
	a.add("abc");
	a.add("xyz");
	
	System.out.println(a.get(2));
	
//Array list for loop 
	
	for (int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	
	for (String val :a) {
		System.out.println(val);
		
	}
	// Items present in Arraylist
	System.out.println(a.contains("abc")); 
	
//	String[] name = {"dhara","sagar","mihir","dev"};
//	List<String> nameArrayList = Arrays.asList(name);
//	nameArrayList.contains("dhara");
	
	}
	
}

