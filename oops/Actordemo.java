package oops;

public class Actordemo {
    Actors a;
    
    public static void main(String[] args) {
        Actors[]ac = Actors.values();
        for (int i = 0; i < ac.length; i++) {
            System.out.println(ac[i]+"-->"+ac[i].salary);
        }
    }
}

