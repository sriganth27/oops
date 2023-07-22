package oops;
interface testdemo{
    
    abstract void display();
    
}
class outerdemo{
    void outerdisplay(){
        testdemo o = new testdemo(){
            @Override
            public  void display() {
                System.out.println("test display."); //To change body of generated methods, choose Tools | Templates.
            }
            
    };
        o.display();
}
}

public class anonymouscls {
    public static void main(String []args ){
        outerdemo o = new outerdemo();
        o.outerdisplay();
    }
}
    

