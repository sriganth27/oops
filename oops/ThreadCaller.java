package oops;
public class ThreadCaller {
    public static void main(String[] args) throws InterruptedException {
        ChildThread ch = new ChildThread();
        /*System.out.println(ch.getState());
        //ch.setPriority(56);
        System.out.println(ch.getName());
        ch.setName("javathread");
         System.out.println(ch.getName());
          System.out.println(ch.getId()); 
          System.out.println(ch.getPriority());*/
        ch.start(); 
        ch.interrupt();
       
        for (int i = 1; i < 5; i++) {
            
            System.out.println("main thread"+i);
        }
        //System.out.println(ch.getState());
    }
} 

/*ChildThread ch = new ChildThread();
        /*System.out.println(ch.getState());
        //ch.setPriority(56);
        System.out.println(ch.getName());
        ch.setName("javathread");
         System.out.println(ch.getName());
          System.out.println(ch.getId()); 
          System.out.println(ch.getPriority());
        ch.start(); 
        ch.yield();
       
        for (int i = 1; i < 5; i++) {
            System.out.println("main thread"+i);
        }
        //System.out.println(ch.getState());
}*/

/*ChildThread ch = new ChildThread();
        /*System.out.println(ch.getState());
        //ch.setPriority(56);
        System.out.println(ch.getName());
        ch.setName("javathread");
         System.out.println(ch.getName());
          System.out.println(ch.getId()); 
          System.out.println(ch.getPriority());
        ch.start(); 
        ch.join();
       
        for (int i = 1; i < 5; i++) {
            System.out.println("main thread"+i);
        }
        //System.out.println(ch.getState());
    }*/