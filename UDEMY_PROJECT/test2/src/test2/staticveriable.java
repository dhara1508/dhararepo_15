package test2;   //Example of static variable

public class staticveriable {

	int roll_no;
	String name;
	static String collage = "CCMS";  // Static variable 
	
	//constructor  
	staticveriable(int r,String n){
		roll_no = r;
		name = n;
	}
	
	 //method to display the values  
	void display() { 
		System.out.println(roll_no + "" + name + "" + collage);
	}
	
	//show the values of objects 
	public static void main(String args[]) {
		staticveriable s1 = new staticveriable(1,"abc");
		staticveriable s2 = new staticveriable(2,"xyz");
		//we can change the college of all objects by the single line of code  
		//Test13.collage="ccm";
		s1.display();
		s2.display();
	}
	
	
}
