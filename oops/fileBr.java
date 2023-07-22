package oops;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class fileBr {
    public static void main (String[]args){
        
        File file = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\abc.txt");
        try {
            FileWriter fwriter= new FileWriter(file ,true);
            BufferedWriter bwriter = new BufferedWriter(fwriter);
            bwriter.write("tamil");
            bwriter.newLine();
            bwriter.write("english");
            bwriter.newLine();
            bwriter.write("mathamatics");
            bwriter.flush();
            bwriter.close();
            FileReader freader = new FileReader(file);
            BufferedReader breader= new BufferedReader(freader);
            String line = breader.readLine();
            int lineCount = 0;
            int sentenceCount=0;
            int wordcount=0;
            int charcount=0;
            while(line!=null)
            {
                String[] sentence = line.split("[.]");
                sentenceCount = sentenceCount + sentence.length;
                String[] words = line.split(" ");
                wordcount = wordcount+words.length;
               
                System.out.println(line);
                charcount = charcount + line.length();
                 lineCount++;
                line = breader.readLine();
            }
            System.out.println("no of lines " + lineCount);
            System.out.println("no of sentece " + sentenceCount);
            System.out.println("no of words" + wordcount);
            System.out.println("no of chars" + charcount);
                
            } 
            catch (IOException ex) {
            ex.printStackTrace();
                
                    
                }
        }
        
    }
    

