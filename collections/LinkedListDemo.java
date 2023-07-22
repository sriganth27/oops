package collections;
import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(35);
        ll.add(45);
        ll.add("sriganth");
        ll.add("kalai");
        ll.add(true);
        System.out.println(ll.contains("kalai"));
        System.out.println(ll);
        ll.offerLast("mullai");
      System.out.println(ll);
      ll.offerFirst(23);
       System.out.println(ll); 
       LinkedList ll2 = (LinkedList)ll.clone();
        System.out.println("after clone"+ll2);
        ll.clear();
        System.out.println(ll);
    }
}
