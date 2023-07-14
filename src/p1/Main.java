package p1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String text = "Hello";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt", true))){
            writer.write(text);
            writer.newLine();
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }

}
