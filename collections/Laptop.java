package collections;
public class Laptop {
    String model;
    int price;
    int gb;
    boolean touch;

    Laptop(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString(){
        
        return " " + this.model+"-" + this.price + "-" + this.gb +"-" +this.touch ;
        
    }
    public Laptop(String model ,int price , int gb , boolean touch){
        this.model = model;
        this.price = price ;
        this.gb = gb;
        this.touch = touch;
    }
}
