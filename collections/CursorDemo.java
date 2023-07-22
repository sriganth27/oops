package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class CursorDemo {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("abishek");
        names.add("vimalraj");
        names.add("kalaivendhan");
        names.add("sriganth");
        Laptop l = new Laptop("dell",1233,4677,true);
        Laptop l2 = new Laptop("lenevo",1233,4677,true);
        names.add(l);
        names.add(l2);
        System.out.println("before : "+ names);
        Iterator i = names.iterator();
        while(i.hasNext()){
            if(i.next().equals("kalaivendhan"))
                i.remove();
            //System.out.println(i.next());
            
        }
        System.out.println("after :" + names);
       ListIterator li = names.listIterator();
        li.add("james");
       while(li.hasNext()){
           if(li.next().equals(l2)){
               li.set("abinash");
           }
       // System.out.println(li.next());
    }
        System.out.println(names);
    }
}
