package basics;

public class StaticVariable {
    static int accbalance=0;
    String depositedby;
 public static void main (String []args)  {
     StaticVariable s1 = new StaticVariabale();
     s1.accbalance = 1000;
     s1.depositedby="sri";
     
     StaticVariable s2 = new StaticVariabale();
     s2.accbalance = 2000;
     s2.depositedby="sri";
     
     
     System.out.println(" s1 integer:"+s1.accbalance );
     System.out.println(" s1 string:"+s1.depositedby);
     System.out.println(" s2 integer:"+s2.accbalance );
     System.out.println(" s2 string:"+s2.depositedby );
 } 

    
}
