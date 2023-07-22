package collections;
import java.util.TreeMap;


public class TreeMapDemo {
    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap();
        tm.put(111,"sriganth");
        tm.put(101,"kalai");
        tm.put(105,"mullai");
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        ;
        System.out.println(tm);
      
    }
}
