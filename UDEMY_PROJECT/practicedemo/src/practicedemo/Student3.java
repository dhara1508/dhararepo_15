package practicedemo;    //  2) Object and Class Example: Initialization through method  (By method)

public class Student3 {
	
	int id_num ;
	String name;
	
	void insertRecord(int i, String n) {
		id_num = i;
		name = n;
		
	}
	void displayInformation() {
		
		System.out.println(id_num + " " + name);
	}
	}
class Studenttest3{
	
	public static void main(String args[]) {
		Student3 s2 = new Student3();
		Student3 s3 = new Student3();
		s2.insertRecord(1000,"firstname");
		s3.insertRecord(200,"Secondname");
		s2.displayInformation();
		s3.displayInformation();
		
	}
}


