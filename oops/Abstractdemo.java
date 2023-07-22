package oops;

abstract class mobile {
    
    abstract void camera();
    abstract void display();
}
class samsung extends mobile{

    @Override
    void camera() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void display() {
      System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class Abstractdemo
{
    public static void main(String []args){
        mobile m = new samsung();
        m.camera();
        m.display();
    }
}
