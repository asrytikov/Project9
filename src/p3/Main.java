package p3;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        try(FileInputStream fileInputStream = new FileInputStream("test2.txt")){
            int i;
            while ((i = fileInputStream.read())!=-1){
                System.out.print((char) i);
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }


    }

}
