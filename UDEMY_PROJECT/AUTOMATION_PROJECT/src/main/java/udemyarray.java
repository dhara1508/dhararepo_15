
public class udemyarray {
	public static void main(String args[]) {
		
// Data type and value store in variable 
		int num = 1;
		double dec = 2.5;
		String text = "I learn Java";
		char word = 'D';
		boolean itis = true;
		
		System.out.println(num);
		
// Array 
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 4;
		array[3] = 6;
		array[4] = 7;
		
	//use declare array with another way
		int[] array1 = {2,3,5,6,7,8,10};
		
		System.out.println(array[4]);
		System.out.println(array1[3]);
		
// Loop with integer array
					
		for(int i=0;i<array.length;i++)  	//loop for array 
		{	
			System.out.println(array[i]);
		}
		
		for (int i=0;i<array1.length;i++) 	//loop for array1 
		{
			System.out.println(array1[i]);
		}
// Loop with string array
		String[] name = {"Dhara","Raja","Deep"};  //declare string array
		
		for (int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
// Using with enhanced for loop declaration
		for(String s: name) {
			System.out.println(s);
		}
	}

}
