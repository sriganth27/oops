package collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {
    public static void main(String[] args) {
         
        HashMap hs = new HashMap();
        hs.put(101,"sriganth");
        hs.put(102,"kalaivendhan");
        hs.put(103, "mullai");
        hs.put(105,"james");
        System.out.println(hs);
        LinkedHashMap lhs = new LinkedHashMap();
        lhs.put(101,"sriganth");
        lhs.put(102,"kalaivendhan");
        lhs.put(103, "mullai");
        lhs.put(105,"james");
        System.out.println(lhs);
       
        Set s = hs.keySet();
        System.out.println("keys are : "+s);
        Collection c = hs.values();
        System.out.println("values are "+c);
        Set s2 = hs.entrySet();
         System.out.println("keys are : "+s2);
         Iterator i = s2.iterator();
         
         while (i.hasNext())
         {
             //System.out.println(i.next());
            Map.Entry me =(Map.Entry) i.next();
             //System.out.println(me.getKey()+" : " +me.getValue());
             if(me.getKey().equals(102))
                 //System.out.println(""+ me.getKey());
             me.setValue("kalai");
             System.out.println(me);
         }
        
        
    }
}
