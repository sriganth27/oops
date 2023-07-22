package collections;
import java.util.Comparator;


public class ComaparatorDemo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
       /*String s1= (String)o1;
       String s2= (String)o2;
       int result = s1.compareTo(s2);
        if (result<0) {
            return 1;
        }
        else if (result>0){
            return -1;
        }
        else
        return 0;*/
       Laptop l1 = (Laptop)o1;
       Laptop l2 = (Laptop)o2;
       int result = l1.model.compareTo(l2.model);
      
        if (result<0) {
            return 1;
        }
        else if (result>0){
            return -1;
        }
        else
        return 0;
       
       /*if (l1.price >l2.price) {
            return 1;
        }
        else if (l1.price<l2.price){
            return -1;
        }
        else
        { 
            if(l1.gb<l2.gb)
            {
                return 1;
            }
            else if (l1.gb>l2.gb){
                return -1;
            }
            
        }
        return 0;*/
      
        
}
     public void display(String s1 , String s2){
         
     }
}
