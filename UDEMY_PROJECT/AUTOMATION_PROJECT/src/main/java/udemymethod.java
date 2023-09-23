

public class udemymethod {
	public static void main(String args[]){
		
		udemymethod m = new udemymethod();
		String name = m.getdata();
		System.out.println(name);
		getdata2();
		udemymethod1 m1 = new udemymethod1();    // call from another class method
		m1.getdata1();	
	}
	
	public String getdata() {
		System.out.println("Hello World");
		return "This is hello world";
	}
	// static method is used for particular class method 
	public static void getdata2() {
		System.out.println("hello world");
	}
}
