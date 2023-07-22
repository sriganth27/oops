package basics;

public class returntype {
    public int amount=236449;
    
    public int collectamount(){
        System.out.println("daddy have cllect rupees :"+amount);
        return amount;
    }
 public static void main(String []args){
     returntype r = new returntype(); 
     int amount=r.collectamount();
     System.out.println("got the amunt "+amount);
 }   
}
