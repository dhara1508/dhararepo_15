package test2;

public class Test12 {
	int id;
	String name;
	Test12(int i,String n){
	id = i;
	name = n;
	}
	void display() {
	
		System.out.println(id + "" + name);
	}
	public static void main(String args[]) {
		
	Test12 s1 = new Test12(1,"barot");
	Test12 s2 = new Test12(2, "abc");
	s1.display();
	s2.display();
}
}