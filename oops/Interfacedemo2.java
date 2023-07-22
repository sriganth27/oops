//how multiple inheritance can be achieved by implement multiple interface
package oops;

class phone {
    void voicecall(){
        System.out.println("make voice calls");
    }
    
    void sms(){
        System.out.println("we can send sms");
    }
    
}
interface camera {
    void click();
    void record();
}

interface player{
    void play();
    void stop();
    void pause();
}
class smartphone extends phone implements camera,player
{

    @Override
    public void click() {
        System.out.println("take selfi");
    }
    @Override
    public void record() {
        System.out.println("take record"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void play() {
        System.out.println(" song play");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        System.out.println("song stop"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pause() {
        System.out.println("song pause"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public interface Interfacedemo2 {
    public static void main(String [] args) {
        smartphone o = new smartphone();
        o.sms();
        o.voicecall();
        o.click();
        o.pause();
        o.play();
        o.record();
        o.stop();
       
    }
}
