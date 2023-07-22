package oops;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.*;
import java.util.*;

public class cli {
    public static void main(String[] args) {
        try {
            Socket s= new Socket("localhost",6666);
            DataOuputStream dout = DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello");
            dout.flush();
            s.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }

    private static DataOuputStream DataOutputStream(OutputStream outputStream) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
