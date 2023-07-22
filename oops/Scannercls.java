package oops;
import java.util.Scanner;


public class Scannercls {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1");
        int no1 = sc.nextInt();
         System.out.println("enter no 2");
        int no2 = sc.nextInt();
        System.out.println("enter your name:");
        String name = sc.next();
        System.out.println("your name is "+ name);
        
        if(no1>no2){
            System.out.println("no1 is grater");
        }
        else if(no1<no2){
            System.out.println("no2 is grater");
        }
        else{
            System.out.println("both are same");
        }
    }
}
