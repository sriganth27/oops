package collections;

import java.util.Arrays;






public class Arraybasics {
    public static void main(String[] args) {
        int [] a = {10,20,45};
        int [] b = { 45,10,20};
        System.out.println(Arrays.equals(a,b));
        Arrays.sort(b);
        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i]);
        }
        String [] names = {"vishal","suriyan", "nithya", "suresh"};
        //Arrays.sort(names);
       ComaparatorDemo c = new  ComaparatorDemo();
        Arrays.sort(names ,c );
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


}
}
