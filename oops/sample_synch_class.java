package oops;
import java.lang.System.Logger;
import java.util.*;
import java.util.logging.Level;
class synch_class
{
    public  void thread_fun(){
        
        Thread th = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(th.getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
class threadone extends Thread{
    synch_class thrval;
    public threadone(synch_class value){
        this.thrval = value;
    }
    public void run(){
        thrval.thread_fun();
    }
}
class threadtwo extends Thread{
    synch_class thrval;
    public threadtwo(synch_class obj){
        this.thrval = obj;
    }
    public void run(){
        thrval.thread_fun();
    }
}

class threadthree extends Thread{
    synch_class thrval;
    public threadthree(synch_class value){
        this.thrval = value;
    }
    public void run(){
        thrval.thread_fun();
    }
}
public class sample_synch_class {
    public static void main(String[] args) throws InterruptedException {
        
    
    synch_class obj =new synch_class();
    threadone one = new threadone(obj);
    threadtwo two = new threadtwo(obj);
    threadthree three=new threadthree(obj);
    
    one.start();
    one.join();
    two.start();
    two.join();
    three.start();
    
}
}
