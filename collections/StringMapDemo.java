package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class StringMapDemo {
    public static void main(String[] args) {
        StringMapDemo sm = new StringMapDemo();
        
        sm.WordCount();
        sm.Charcount();
    }
    private void WordCount() {
        String names = "kalai sriganth mullai james kalai";
         HashMap<String ,Integer> wcount = new HashMap();
         String [] words = names.split(" ");
         System.out.println(wcount);
         for(String w : words)
         {
             if(wcount.containsKey(w))
             {
                 wcount.put(w, wcount.get(w)+1);
             }
             else 
             {
                 wcount.put(w, 1);
             }
         }
         System.out.println("word couut values : "+ wcount);
         Set<Map.Entry<String , Integer>> se = wcount.entrySet();
         for (Map.Entry<String , Integer> entry : se ) 
         {
             if(entry.getValue() ==1)
             System.out.println(entry.getKey() +" "+ entry.getValue());
         }
    }

    private void Charcount() {
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
