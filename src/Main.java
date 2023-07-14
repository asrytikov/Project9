import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String line;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("D:\\файл.txt"));
            line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }catch (IOException exception){
            System.out.println("ERROR");
            System.out.println(exception.getMessage());
        }
        finally {
            try{
                if (reader != null) reader.close();
            }catch (IOException exp){
                System.out.println(exp.getMessage());
            }
        }
    }
}