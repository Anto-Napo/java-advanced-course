package net.server;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1234); //? Create the server on port 1234
        System.out.println("Server started.");

        Socket clientSocket = serverSocket.accept(); //? Get the client when he connects
        System.out.println("Client connected");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); //? Content that'll be sent.
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); //? Content that'll be received.

        String inputLine;
        while ((inputLine = in.readLine()) != null) { //? Read input from the client
            System.out.println("Client: " + inputLine);
            out.println("Server received: " + inputLine); //? Send response back to the client
        }

        // Close streams and sockets
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}