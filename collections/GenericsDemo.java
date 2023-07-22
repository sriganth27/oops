package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class GenericsDemo {
    public static void main(String[] args) {
        String ss = "sriganthkalai";
        HashMap<Character ,Integer> Charcount = new HashMap();
        System.out.println(Charcount);
        char[] ch = ss.toCharArray();
        for (char c : ch)
        {
           if( Charcount.containsKey(c))
           {
               Charcount.put(c, Charcount.get(c)+1);
           }
           else
           {
               Charcount.put(c,1);
           }
        }
        System.out.println(Charcount);
        Set<Map.Entry<Character, Integer>> se = Charcount.entrySet();
        for (Map.Entry<Character, Integer> entry : se)
        {
            if(entry.getValue()==1)
                
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
