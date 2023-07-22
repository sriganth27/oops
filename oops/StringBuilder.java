package oops;
public class StringBuilder {

    public StringBuilder(String ganth) {
    }

    
    public static void main(String [] args ) {
        StringBuffer name1 = new StringBuffer("sri");
        StringBuilder name2= new StringBuilder("ganth");
    
        System.out.println(name2);
        name2.append("ganth");
    }

    String append(String hero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String reverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    }


