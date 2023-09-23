package test2;    //Rectangle

public class ractangle {
	
	int length;
	int width;
	
		void insert(int l , int w)
		{
			length=l;
			width=w;
	
		}
		void display()
		{
			System.out.println(length*width);
			
		}
		
		public static void main(String args[]) {
			
			ractangle r1 = new ractangle();
			ractangle r2 = new ractangle();
			r1.insert(20,10);
			r2.insert(30,40);
			r1.display();
			r2.display();			
			
		}
}
