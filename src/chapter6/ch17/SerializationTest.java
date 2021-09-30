package chapter6.ch17;

import java.io.*;

class Person implements Externalizable {
    private String name;
    private String job;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        job = in.readUTF();
    }
}

public class SerializationTest {

    public static void main(String[] args) {
        Person person1 = new Person("이순신", "장군");
        Person person2 = new Person("김유신", "장군");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person1);
            oos.writeObject(person2);
        } catch (IOException e) {
            System.out.println("e = " + e);
        }

        try(FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person person3 = (Person) ois.readObject();
            Person person4 = (Person) ois.readObject();

            System.out.println("person3 = " + person3);
            System.out.println("person4 = " + person4);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("e = " + e);
        }

    }
}
