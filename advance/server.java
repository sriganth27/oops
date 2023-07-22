package advance;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try 
        {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("massage : "+ str );
            ss.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
