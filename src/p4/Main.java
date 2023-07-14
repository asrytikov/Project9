package p4;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Alex", 30, 1.68, false);

        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"))){
            dataOutputStream.writeUTF(person.name);
            dataOutputStream.writeInt(person.age);
            dataOutputStream.writeDouble(person.height);
            dataOutputStream.writeBoolean(person.married);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.bin"))){
            String name = dataInputStream.readUTF();
            int age = dataInputStream.readInt();
            double height = dataInputStream.readDouble();
            boolean married = dataInputStream.readBoolean();

            System.out.printf("Name: %s Age: %d Height: %f Married: %b", name, age, height, married);

        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

}

class Person{
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }
}
