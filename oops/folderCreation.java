package oops;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
      
public class folderCreation {
    public static void main(String [] args) throws IOException{
        /*
        File ff = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Oops\\sriganth\\sriganth2\\sriganth3\\sri.txt");
        //ff.delete();
        ff.createNewFile();
        boolean createFile = ff.createNewFile();
        System.out.println( ff.createNewFile());
        File f = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Oops\\sriganth\\sriganth2\\sriganth3\\kalai.txt");
        boolean renameSucces = ff.renameTo(f);
        System.out.println("rename succes"+ renameSucces);
        System.out.println(" file name "+f.getName());*/
        
        
        /* File ff = new File("C:\\Users\\Admin\\Desktop");
        String [] ss = ff.list();
        for(int i =0; i<ss.length;i++)
        {
            if (ss[i].charAt(0)=='H')
            System.out.println(ss[i]);
        }*/
        
        File file = new File("C:\\Users\\Admin\\desktop");
        File [] filefolderArray= file.listFiles();
        for (File ff : filefolderArray )
        {
            if(ff.isFile())
            {
                String filename= ff.getName();
                int lastDot = filename.indexOf(".");
                String extension = filename.substring(lastDot+1);
                System.out.println(extension);
                //if(extension.equals("docs"))
                System.out.println(filename + " size :  "+ ff.length());                        
                        
            }
           
            
        }
    
        
        
        
        
        
        
        /*File [] f= ff.listFiles();
        for (int i=0;i<f.length;i++ )
        {
            if(f[i].isFile())
            System.out.println(f[i].getName());
        }*/
        /*String [] ss = ff.list();
        for(int i =0; i<ss.length;i++)
        {
            if (ss[i].charAt(0)=='s')
            System.out.println(ss[i]);
        }*/
        
      
            
            
        
    }
    
}
