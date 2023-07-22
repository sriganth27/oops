package collections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class propertiesDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\collection\\src\\main\\java\\test.properties");
        p.load(fis);
        System.out.println(p);
        String ss = p.getProperty("vadai");
        System.out.println(ss);
        p.setProperty("vadai", "90");
        System.out.println(p);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\collection\\src\\main\\java\\test.properties");
        p.store(fos, "updated price");
    }
}
