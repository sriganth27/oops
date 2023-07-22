package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class SetDemo {
    public String toString(){
        return "abc";
    }
    public static void main(String[] args) {
        SetDemo sd = new SetDemo();
        LinkedList ll = new LinkedList();
        ll.add("sri");
        ll.add("kalai");
        ll.add("abi");
        ll.add("kalai");
        ll.add("vimal");
        ll.add("yshini");
        //ll.add(sd);
        TreeSet  ts = new TreeSet(ll);
        
        System.out.println("afer tree st addding :"+ts);
        Object [] ob = ll.toArray();
        for (Object o:ob) {
            System.out.println(o);
        }
        //System.out.println("at first : "+ll);
        LinkedHashSet lhs =  new LinkedHashSet(ll);
        System.out.println("after removing duplicates "+lhs);
        HashSet hs = new HashSet();
        hs.add(45);
        hs.add(60);
        hs.add(24);
        hs.add(90);
        System.out.println(hs);
        
        
    }
}
