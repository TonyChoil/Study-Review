package io;

import java.io.*;

public class Deserialization implements Serializable {
    private int num;
    private String str;

    public Deserialization(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public void printData() {
        System.out.println("num : " + num + ", str : " + str);
    }

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Object.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Deserialization obj = (Deserialization)ois.readObject();
            obj.printData();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
