package webserver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    public static void main(String[] args) throws IOException, InterruptedException {


        ServerSocket serverSocket = new ServerSocket(8080);

        System.out.println("Waiting for a client to connect......");


        while (true){
            Socket clientSocket = serverSocket.accept();
            new Thread(new WebWorker(clientSocket)).start();
            System.out.println("Hallelujah!!");
        }


//        serverSocket.close();
//        System.out.println("DONE, exiting!!!");
//        System.out.println("done ");
    }



}
