package io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkCommunication implements Serializable {
    private int num;
    private String str;

    public NetworkCommunication(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public void printData() {
        System.out.println("num : " + num + ", str : " + str);
    }

    public void server(){
//        ServerSocket
        try {
            ServerSocket server = new ServerSocket(1234);
            System.out.println("Server started");
            while(true){
                Socket socket = server.accept();
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                NetworkCommunication obj = (NetworkCommunication) ois.readObject();
                obj.printData();
                ois.close();
                socket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void client{
        try {
            Socket socket = new Socket("localhost", 1234);
            ObjectOutputStream oss = new ObjectOutputStream(socket.getOutputStream());
            NetworkCommunication obj = new NetworkCommunication(10, "Hello");
            oss.writeObject(obj);
            oss.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

//        ServerSocket
    }
}
