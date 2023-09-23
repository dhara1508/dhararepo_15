package program1;
public class specialchar{
	public static void main(String args[]) {
		String txt = "it\'s okay";
		String txt1 = "it \"s okay";
		String txt2 = "it's\\ okay";
		String txt3 = "it'\bs okay";
		String txt4 = "it's\r okay";
		String txt5 = "it's\t okay";
		String txt6 = "it's\n okay";
		{
			System.out.println(txt);
			System.out.println(txt1);
			System.out.println(txt2);
			System.out.println(txt3);
			System.out.println(txt4);
			System.out.println(txt5);
			System.out.println(txt6);
		}
	}
}