package basics;

public class NoArgconstructor {
    int empId;
    String empname;
    
    NoArgconstructor(){
        empId=1;
        empname="sri";
        System.out.println("emp object is screated");
    }
 public static void main (String []args)   {
     NoArgconstructor n = new NoArgconstructor();
 }
}
