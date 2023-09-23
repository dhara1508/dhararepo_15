package test2;    //Program of counter by static variable

public class withstaticveriable {
	static int count = 0;

	withstaticveriable(){
		count++;
		System.out.println(count);
	}
	public static void main(String args[]) {
		withstaticveriable c = new withstaticveriable();
		withstaticveriable c1 = new withstaticveriable();
	}
}
