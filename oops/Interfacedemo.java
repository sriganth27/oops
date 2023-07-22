package oops;

interface animal{
    void sound();
    void sleep();
}

class dog implements animal{

    @Override
    public void sound() {
        System.out.println("the dogs soound like : woof"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sleep() {
        System.out.println("dog sleeep");//To change body of generated methods, choose Tools | Templates.
    }
    
}



public interface Interfacedemo {
    public static void  main (String[] args){
        animal an = new dog();
        an.sleep();
        an.sound();
    }
}
