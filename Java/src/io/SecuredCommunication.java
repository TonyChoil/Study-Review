package io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SecuredCommunication implements Serializable {
    private int num;
    private String str;
    private transient String password;

    public SecuredCommunication(int num, String str, String password) {
        this.num = num;
        this.str = str;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oss) throws IOException {
        oss.defaultWriteObject();
        String encryptedPassword = encrypt(password);
        oss.writeObject(encryptedPassword);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String encryptedPassword = (String) ois.readObject();
        password = decrypt(encryptedPassword);
    }

    private String encrypt(String str){
        // 암호화 코드
        return null;
    }

    private String decrypt(String str){
        //복호화 코드
        return null;
    }


}
