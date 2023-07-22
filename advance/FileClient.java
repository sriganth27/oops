package advance;
import java.io.*; 

import java.net.*;

	
public class FileClient {
public static void main(String[] args) throws Exception{
//Initialize socket
Socket socket = new Socket(InetAddress.getByName("localhost"), 5000); 
byte[] contents = new byte[10000];
//Initialize the FileOutputStream to the output file's full path. 
FileOutputStream fos = new FileOutputStream("E:\\index.html");
BufferedOutputStream bos = new BufferedOutputStream(fos); 
InputStream is = socket.getInputStream();
//No of bytes read in one read() call 
int bytesRead = 0;
while((bytesRead=is.read(contents))!=-1) 
bos.write(contents, 0, bytesRead);
bos.flush(); 
socket.close();
System.out.println("File saved successfully!");
}
}

