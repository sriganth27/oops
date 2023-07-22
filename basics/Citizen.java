package basics;

public class Citizen {
    String name;
    int age;
    int aadhar;
    public Citizen(String name , int age )  {
    this.name=name;// this refers to c
    this.age=age;
}
    
public  Citizen(String name , int age, int aadhar )  {
    this.name=name;
    this.age=age;
    this.aadhar=aadhar;
    
}
public static void main(String [] args){
    Citizen c1 = new Citizen("sri",90);
    
   Citizen c2 = new Citizen("sri",78,90);
    passportOffice emp = new passportOffice();
   boolean result = emp.verifyDocsA(c1);
   if (result==true){
       System.out.println("done");
  }
   else{
       System.out.println("10 days later");
   }
}
}

