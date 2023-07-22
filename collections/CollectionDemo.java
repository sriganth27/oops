package collections;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionDemo {
    public static void main(String[] args) {
        Laptop dell = new Laptop("inspiron",45000, 7 , true);
        Laptop lenova = new Laptop("ideapad",40000, 9 , true);
        Laptop hp = new Laptop("pavilion",40000 , 6 , false);
        ArrayList laptoplist = new ArrayList();
        laptoplist.add(dell);
        laptoplist.add(hp);
        laptoplist.add(lenova);
        System.out.println("before string : "+ laptoplist );
        
        ComaparatorDemo cd = new ComaparatorDemo();
        Collections.sort(laptoplist,cd);
        System.out.println("after sorting  :"+ laptoplist);
        Collections.reverse(laptoplist);
        System.out.println(laptoplist);
    }
}
