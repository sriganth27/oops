package basics;

//static method
public class StaticMethod {
    public static void method1(){
     System.out.println("ststic method");
   
    }
    public void nonStstic(){
        method1();
        System.out.println("nonststic method");
    
    }
    public static void main (String [] args){
        method1();
    }
}
        
