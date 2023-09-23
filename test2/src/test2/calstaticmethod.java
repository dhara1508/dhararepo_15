package test2;   //Java Program to get the cube of a given number using the static method  

public class calstaticmethod {
	static int cube(int i) {
		return i*i*i;
	}
	public static void main(String args[]) {
		int result = calstaticmethod.cube(2);
		System.out.println(result);
	}

}
