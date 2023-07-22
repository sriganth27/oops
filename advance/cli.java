package advance;
import java.io.*;
import java.net.*;


public class cli {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("hello server");
            dos.flush();
            dos.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
