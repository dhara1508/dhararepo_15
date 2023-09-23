

package practicedemo;  // Object and Class Example: main outside the class


public class Student1 {

	int id = 10;
	String name;
}

class Student12{
	
	public static void main (String args[]) {
		
		Student1 s1 = new Student1();
		System.out.println(s1.id);
		System.out.println(s1.name);
		
	}
}
