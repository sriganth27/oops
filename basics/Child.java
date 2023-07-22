package basics;
  
public class Child extends Parent {
public void work(){
      System.out.println("wrk noot intrested");
}
public static void main (String [] args){
    Parent ch = new Child(); //parentclass ref = new Childclass
  ch.watchTv();
  ch.work();
  //ch.read();
  System.out.println(ch.salary);
}
 public void play() {
    System.out.println("playing");
} 
 public void read() {
    System.out.println("reading");
} 

    
}
 