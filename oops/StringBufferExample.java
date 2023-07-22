package oops;
class demo{
    void display(){
        System.out.println("#############################");
    }
}


public class StringBufferExample {
     
    public static void main(String [] args ) {
        demo d = new demo();
        d.display();
        System.out.println(" string is imutable");
        String name =  " sriganth";
        System.out.println("appending a name to oringinal"+ name.concat("hero"));
        
        System.out.println("oringinal name "+ name);
        
        System.out.println("#############################");
        
        System.out.println(" StringBuffer is mutable");
        StringBuffer  name1 = new StringBuffer ("sriganth");
        System.out.println("appending a name to oringinal :"+ name1.append("hero"));
        System.out.println("oringinal name "+ name1);
        
        
        //StringBuffer methhds
        // reverse
        System.out.println("reverse name :"+ name1.reverse());
        //replace
        StringBuffer  name2 = new StringBuffer ("sridevi");
        System.out.println( name2.replace(0,3,"ganth"));
        //delete
        System.out.println( name2.delete(0,3));
        //insert
        System.out.println( name2.insert(2,"ganth"));
        //capacity
        System.out.println( name2.capacity());
    }
}
