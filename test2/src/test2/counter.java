package test2;  //Program of the counter without static variable

public class counter {
int count = 0;    //will get memory each time when the instance is created  
counter(){
	count++;    //incrementing value 
System.out.println(count);
}
public static void main(String args[]) {
	//Creating objects 
	counter c = new counter();
	counter c1 = new counter();
}
}
