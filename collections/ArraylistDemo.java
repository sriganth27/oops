package collections;
import java.util.ArrayList;
import java.util.List;


public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        System.out.println(al);
        al.add(5);
        al.add(15);
        al.add(45);
        al.add("sriganth");
        al.add('c');
        al.add(false);
        //al.remove(1);
        System.out.println("al arraylist is "+al);
        System.out.println(al.get(3));
        al.add(3,"kalaivendhan");
        System.out.println(al);
        al.set(3,"mullai");
        System.out.println(al);        
        ArrayList al2= new ArrayList();
        al2.addAll(al);
         System.out.println("al2 Arraylist is"+al2);
        ArrayList al3 = new ArrayList();
        al3.add("chennai");
        al3.add("trichy");
        al3.add("villupuram");
        al3.add("nammakal");
        al3.add("chennai");
        
        al3.addAll(2, al);
        System.out.println("al3 arraylist is"+al3);
        List al4 = al3.subList(0, 5);
       
        System.out.println("after al4 arraylist is"+al4);
        
       al3.indexOf(3);
       al3.isEmpty();
       al3.indexOf("chennai");
       al3.lastIndexOf("chennai");
        System.out.println("al3 index is  "  + al3.indexOf(3)+  "al3 is empty  88833 "+   al3.isEmpty());
        System.out.println("al3 iindex is  "+al3.indexOf("chennai")  +  "al3 last index is "  +al3.lastIndexOf("chennai"));
      
        
    }
}
