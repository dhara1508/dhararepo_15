package test2;     //Java Program to demonstrate the use of a static method.  

public class staticmethod {
int roll_no;
String name;
static String collage = "CCMS";

//static method to change the value of static variable 

static void change() {
	collage = "ITS";
}

//constructor to initialize the variable  
staticmethod(int r,String n){
	roll_no = r;
	name = n;
}

void display(){
	System.out.println(roll_no + "" + name + " " + collage);
}
public static void main(String args[]) {
	staticmethod.change();    //calling change method
	
    //creating objects  
	staticmethod c = new staticmethod(1,"abc");
	staticmethod c1 = new staticmethod(1,"xyz");
	c.display();
	c1.display();
	
}
}
