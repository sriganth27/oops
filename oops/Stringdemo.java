package oops;
public class Stringdemo {
     public static void main (String [] args){
         String name ="sriganth";
         int number= 6;
         
      System.out.println(name.charAt(6)) ;
      
       System.out.println(name.length()) ;
       
       System.out.println(name.equals("sri")) ;
      
       System.out.println(name.equalsIgnoreCase("SRIGANTH")) ;
         
       System.out.println(name.isEmpty()) ;
       
        System.out.println(name.contains("a")) ;
        
        System.out.println(name.replace("g","G")) ;
       
       System.out.println(name.substring(1)) ;
      
       System.out.println(name.substring(1,4)) ;
         
       System.out.println(name.concat("kalai")) ;
       
        System.out.println(name.replace("ganth","GANTH")) ;
        
        System.out.println(name.indexOf("g")) ;
      
       System.out.println(name.indexOf("i",6)) ;
         
       System.out.println(name.indexOf("gan",7)) ;
       
        System.out.println(name.trim()) ;
        
        System.out.println(String.valueOf(number)) ;
      
       System.out.println(name.toLowerCase()) ;
         
       System.out.println(name.toUpperCase()) ;
       
        System.out.println(name.join("/","5","8","2003")) ;
        
        String splitThis = "  am , i ,watching, tv ";
        String [] splittedWords= splitThis.split(",");
        for( String string:splittedWords){
            System.out.println(string);
        }
        
       
       
        
     }
}
