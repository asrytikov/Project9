package p5;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))){
            Person person = new Person("Ivan", 33, 178, true);
            objectOutputStream.writeObject(person);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.dat"))){
            Person p = (Person) objectInputStream.readObject();
            System.out.printf("Name: %s Age: %d \n", p.getName(), p.getAge());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }

}

class Person implements Serializable {
    public String name;
    public transient int age;
    public double height;
    public transient boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}