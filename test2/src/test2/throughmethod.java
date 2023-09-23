package test2;     //Object and Class Example: Initialization through method

public class throughmethod {

		 int rollno;  
		 String name;  
		 void insertRecord(int r, String n){  
		  rollno=r;  
		  name=n;  
		 }  
		 void displayInformation(){
			 System.out.println(rollno+" "+name);
			 }  
		
//		class TestStudent4{  
		 public static void main(String args[]){  
			 throughmethod s1=new throughmethod();  
			 throughmethod s2=new throughmethod();  
		  s1.insertRecord(111,"Karan");  
		  s2.insertRecord(222,"Aryan");  
		  s1.displayInformation();  
		  s2.displayInformation();  
		 }  
		}  
		
		