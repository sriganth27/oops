package basics;

public class BankB {
    public String name = "indian bank";
    public int doorNo = 10;
    public float intrest = 4.6f;
    public boolean open = true;
public static void main (String [] args ){
    System.out.println("hi");
}
public static void declareHolidays(){
    System.out.println("Holidays list");
}
public void openAccount(){
    System.out.println("Account opening for ");

}
public String openAccount(String customerName){
    System.out.println("Account opening for "+customerName);
    return "account created";

}
public void openAccount(String customerName, int mobile ){
    System.out.println("Acco opening for" + customerName +":"+mobile);
}
public void openAccount(String customerName, int mobile ,String mailid){
    System.out.println("Acco opening for" + customerName +":"+mobile+ ":" +mailid);
}
}  