package oops;

class test {
    final int MIN=9;
    final int MAX ;
    final int NORMAL;
    
    test(int normal, int max){
         NORMAL = normal;
         MAX = max;
    }
    void display () 
    {
        System.out.println(" MIN :"+MIN);
        System.out.println(" MAX :"+MAX);
        System.out.println(" NORMAL :"+NORMAL);
    }
     
}

public class Finalvariable {
    public static void main (String []args){
        
    
    test t = new test(9,8);
    t.display();
    }
}
