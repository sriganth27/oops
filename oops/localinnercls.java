package oops;

class outercls
{
    void display()
    {
       class inner{
           void innerdisplay(){
               System.out.println(" inner display");
           }
       } 
       inner i = new inner();
       i.innerdisplay();
    }
}


public class localinnercls {
    public static void main (String [] args) {
        outercls o = new outercls();
        o.display();
    }
}
