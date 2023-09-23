package test2;    //Java Program to demonstrate the working of a banking-system  

public class bankingsystem {
 
	int acc_no;
	String name ;
	float amount; 
	
	void insert(int a,String n,float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt) {
		System.out.println("Deposit amount is " + (amount+amt));
	}
	
	void withdrow(float amt) {
		if (amount<amt) {
			System.out.println("Insufficient Balance : ");
		}else
			{
			amount = amount-amt;
				System.out.println("Balance is : " + (amount-amt) );
			}
		}
		
	void checkbalance() {
		System.out.println("Balance is : " +amount);
	}
	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
		
	}


	public static void main(String args[]) {
		bankingsystem a1 = new bankingsystem();
		a1.insert(123456,"Dhara",20000);
		a1.display();
		a1.checkbalance();
		a1.deposit(10000);
		a1.checkbalance();
		a1.withdrow(1000);
		a1.checkbalance();
	}
}



