package test2;   // Java program to initialize the values from one object to another object.  

public class onetoanotherobj {
	int id;
	String name;
	
	
	  //constructor to initialize integer and string  
	onetoanotherobj(int i, String n){
	id = i;
	name = n;
	
	}
	
	//constructor to initialize another object  
	onetoanotherobj(onetoanotherobj s){
		id=s.id;
		name = s.name;
	}
	void display() {
		System.out.println(id + " " + name);
	}
	
public static void main(String args[]) {
	onetoanotherobj s1 = new onetoanotherobj(1,"dhara");
	onetoanotherobj s2 = new onetoanotherobj(s1);
	s1.display();
	s2.display();
}
}
