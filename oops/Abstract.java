package oops;

abstract class shape{

    
   abstract void draw();
    
   void massage()
   {
    System.out.println("massage freom shape");   
    }
} 
    class rectangle extends shape{
        void draw() {
            System.out.println("draw rerctangle usin lengh and breadh");   //To change body of generated methods, choose Tools | Templates.
        }
       
   }

public class Abstract {
    public static void main (String []args){
        rectangle ob = new rectangle();
        ob.draw();
        ob.massage();
    }

   

    

    
}
