
public class udemystringinjava {
	
	public static void main(String args[]) {
		//String is an object (string literal )
	//String s = "Learn java";
	String s1 = "Learn c++";
	String s2 = "Learn .net";
	
		// new memory allocation 
	
	String s3 = new String("Hello java");
	String s4 = new String("Hello c++");
	
		// Using with split method 
	String s = "Learn java concept";
	String[] stringspace = s.split(" ");
	System.out.println(stringspace[0]);
	System.out.println(stringspace[1]);
	System.out.println(stringspace[2]);
	{
	String s5 = "Learn java concept";
	String[] spittedString = s5.split("java");
	System.out.println(spittedString[0]);
	System.out.println(spittedString[1]);
	
	System.out.println(spittedString[1].trim());   // Using with trim method remove before space
	
	//Using for loop for print array char
	for(int i=0;i<s1.length();i++) {
		System.out.println(s1.charAt(i));
	}
	//Using for loop for print reverse char
	for(int i=s5.length()-1;i>=0;i--) {
		System.out.println(s5.charAt(i));
	}
	}
	}
}
