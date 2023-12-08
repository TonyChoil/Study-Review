package io;
import java.io.*;
public class Serialization implements Serializable{

    private int num;
    private String str;

    public Serialization(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public static void main(String[] args) {

        Serialization obj = new Serialization(10, "Hello");

        try {
            FileOutputStream fos = new FileOutputStream("object.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
