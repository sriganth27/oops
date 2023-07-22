package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class  ArrayListExample {
    public void arrayListExample(){
        
        List<String> arraylist= new ArrayList<String>();
        arraylist.add("banana");
        arraylist.add("apple");
        arraylist.add("grapes");
        arraylist.add("pine apple");
        arraylist.add("staberrys");
        System.out.println(arraylist);
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.indexOf("apple"));
        System.out.println(arraylist.indexOf("gua"));
        System.out.println("____________________________________");
        List <String> another = new ArrayList<>();
        another.addAll(arraylist);
        System.out.println(another);
        another.clear();
        System.out.println(another);
        arraylist.remove(0);
        arraylist.remove("banana");
        arraylist.add(null);
        arraylist.set(2,"mango" );
        System.out.println(arraylist);
        System.out.println(arraylist.isEmpty());
        System.out.println("____________________________________");
        for (int i = 0; i <arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        ListIterator<String> list_iterator = arraylist.listIterator();
        while(list_iterator.hasNext()){
            System.out.println(list_iterator.next());
        }
         System.out.println("____________________________________");
        while(list_iterator.hasPrevious()){
            System.out.println(list_iterator.previous());
        }
        System.out.println("____________________________________");  
        Iterator<String> iterator = arraylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
            
        
    }
    public static void main(String[] args) {
        ArrayListExample example = new ArrayListExample();
        example.arrayListExample();
    }
}


