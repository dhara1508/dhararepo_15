package practicedemo;   // 1) Object and Class Example: Initialization through reference  (By reference variable)

public class Student2 {

	int id;
	String name;
}

class Studenttest2{
	
	int id;
	
	}


class Student21{
	
	public static void main (String args[]) {
		
		Student2 s1 = new Student2();
		Studenttest2 s2= new Studenttest2();
		s1.id = 100;
		s1.name = "Test demo";
		s2.id = 50;
		System.out.println(s1.id + " " +s1.name );
		System.out.println(s1.id);
		
	}
}
