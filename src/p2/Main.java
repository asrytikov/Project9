package p2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "sdhfgsdhjfgdhjsgfh";
        try(FileOutputStream fileOutputStream = new FileOutputStream("test3.txt")){
            byte[] buffer = text.getBytes();
            //fileOutputStream.write(buffer,0, buffer.length);
            fileOutputStream.write(buffer[0]);
            System.out.println("The end");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
