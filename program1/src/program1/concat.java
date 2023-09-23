package program1;

public class concat {
	public static void main(String args[]) {
		String firstname = "Dhara ";
		String lastname = "Barot";
		String fullname = firstname+lastname;
		{
			System.out.println(firstname.concat(lastname));
			System.out.println(firstname+lastname);
			System.out.println(firstname+ "" +lastname);
			System.out.println(fullname);
		}
	}
	

}
