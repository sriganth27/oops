package oops;

class outerclass{
    
    static int x=7;
    int y=9;
    static class innercls{
        void display(){
            System.out.println("X : "+x);
    }
}}
public class staticinnerclass {
    public static void main(String [] args){
        outerclass.innercls i = new outerclass.innercls();
        i.display();
    }
    }

