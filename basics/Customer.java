package basics;

public class Customer {
    //static  String name = "sriganth";
    public static void main (String [] args) {
        BankB bb = new BankB();
        System.out.println(bb.name);
        System.out.println(bb.doorNo);
        System.out.println(bb.intrest);
        System.out.println(bb.open);
        //String result =bb.openAccount(name);
        System.out.println(bb.openAccount("sri"));
        BankB.declareHolidays();
        bb.openAccount("sri",5678);
        bb.openAccount("sri",8900,"srivkp03@gmail.com");
        
    }
        
    
}
