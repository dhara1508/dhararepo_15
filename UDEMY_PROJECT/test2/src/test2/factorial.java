package test2;    //calling method with anonymous object  

public class factorial {
	void fact(int n){
		int fact = 1;
		for (int i=1;i<=5;i++) {
			fact=fact*i;
		
		}	
	
		System.out.println("Factorial is " + fact);
}		
public static void main(String args[]) {

	new factorial().fact(1);   //calling method with anonymous object  
}
}

