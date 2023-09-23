package practicedemo;




class Student5 {
  int rollnum;
  String name;
  
  void insertRecord(int r, String n){
    rollnum = r;
    name = n;
    
  } 
  void displayinformation(){
   
   System.out.println(rollnum+""+name);
 }
  class test{
    public static void main(String[] args){
    	Student5 s1 = new Student5();
    s1.insertRecord(1,"test");
    s1.displayinformation();
    
    }
  }
}

