package oops;
import java.util.Scanner;

class exception {
    void getdetails () {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter account number");
            int accNo = sc.nextInt();
            System.out.println("enter pin number");
            int pin = sc.nextInt();
            int [] empDetatils = new int [5];
            for(int i=0;i<10;i++) {
                 empDetatils[i]=50000;
            }
        }
        catch(Exception e){
            System.out.println("chech yur accunt nnumber/ pin number");
            
            }
} }
public class exceptionDemo {
    public static void main (String []args){
        exception ob = new exception();
        ob.getdetails();
    }
}
