// nestedinner cls
package oops;
class outer{
    int a=40;
    class inner{
        int b = 89;
         void innerdisplay(){
             System.out.println("A :"+ a);
             System.out.println("B :"+ b);
            }
    }
    void outerdisplay(){
        inner i = new inner();
        i.innerdisplay();
        System.out.println("B from inner class by uoter display: "+i.b);
    }
}

public class nestedclass {
    public static void main(String [] args ){
        outer ob = new outer();
        ob.outerdisplay();
        outer.inner i = new outer().new inner();
        i.innerdisplay();
    }
    
}
