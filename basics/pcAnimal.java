package basics;

public class pcAnimal {
    String Animal_name;
    String Animal_type;
    
    pcAnimal(String name){
        Animal_name=name;
        System.out.println("animal name is dog");
    }
    pcAnimal(String name, String type){
        Animal_name=name;
        Animal_type=type;
    }
    public void sayaboutanimal(){
        System.out.println("animal mame is"+ Animal_name +"animal type is "+ Animal_type);
    }
public static void main (String []args)   {
    pcAnimal p1 = new pcAnimal("duck");
     pcAnimal p2 = new pcAnimal("karadi","ominivors");
     p1.sayaboutanimal();
     p2.sayaboutanimal();  
} 
}
