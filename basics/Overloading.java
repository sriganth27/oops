package basics;

public class Overloading {
   
    /*public void talk(Integer styleOfTalking){
        System.out.println("polite and silent");
    }
    public void talk(String  styleOfreading , String styleOfSpeaking){
        System.out.println("polite and silent");
    }
    public void talk( int  styleOfwalking ){
        System.out.println("polite and silent");
    }*/
    
    int add(int a , int b){
        return a+b;
    }
     
    int add(int a , int b , int c){
        return a+b+c;
    }
     
    float add(float a ,float b){
        return a+b;
    }
     
public static void main (String [] args){
    Overloading ob = new Overloading ();
      System.out.println("sum of two numbers "+ ob.add(9, 8));
     System.out.println("sum of three numbers "+ ob.add(9, 8,8));
    //System.out.println("sum of two numbers "+ ob.add(9.9, 8.8));
    }
}
