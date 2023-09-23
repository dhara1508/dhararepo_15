package test2;       //multiple objects and store information in it through reference variable.

public class refvariable {

		 int id;  
		 String name;  
		
//		class TestStudent3{  
		 public static void main(String args[]){  
		  //Creating objects  
			 refvariable s1=new refvariable();  
			 refvariable s2=new refvariable();  
		  //Initializing objects  
		  s1.id=101;  
		  s1.name="Sonoo";  
		  s2.id=102;  
		  s2.name="Amit";  
		  //Printing data  
		  System.out.println(s1.id+" "+s1.name);  
		  System.out.println(s2.id+" "+s2.name);  
		 }  
		}  