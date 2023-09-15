package test2;    //Employee

public class employee {


    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+salary);}  

//public class TestEmployee {  
public static void main(String[] args) {  
	employee e1=new employee();  
	employee e2=new employee();  
	employee e3=new employee();  
    e1.insert(101,"ajeet",45000);  
    e2.insert(102,"irfan",25000);  
    e3.insert(103,"nakul",55000);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  