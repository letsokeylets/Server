package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


//Класс, который подключается к серверу
public class MainTwiceClass {

    public static void main( String[] args ) {
        String host = "localhost";
        int port = 8070;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            out.println("Client Twice");
            String resp = in.readLine();
            System.out.println(resp);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
