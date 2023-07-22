package basics;

public class passportOffice {
    public static void main(String [] args){
        
    }
 public boolean verifyDocsA(Citizen c){
     String cName= c.name;
     int cAge = c.age;
    boolean result =  verifyDocsB(c);
    return result;
 }
 public  boolean verifyDocsB(Citizen c){
     
    boolean result= verifyDocsC(c);
    return result;
 }
 public boolean  verifyDocsC(Citizen c){
      boolean result = true;
     return result;
     
 }
    
}
