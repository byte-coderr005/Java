import java.io.*;

public class Main {
    public static void main(String[] args) {
        File obj = new File("mytxt.txt");
        System.out.println("File Created..");
        //Java OutputStream Class Upper class of All input output stream.
        //InputStream obj1 = new FileInputStream(); // Giriş akışı oluşturuldu.
        //read(); //Reads one byte of data from the input stream.
        //read(byte[] array)() Reads byte from the stream and stores that byte in the spesified array.
        //mark()
        //skips()
        //reset()
        //close()
        File obj1 = new File("mytxt2.txt");
        if(obj1.delete())
        {
            System.out.println("File Deleted..");
        }
        else {
            System.out.println("File Not Deleted..");
            //sdfsdfsdferewrewrwee
        }
    }
}