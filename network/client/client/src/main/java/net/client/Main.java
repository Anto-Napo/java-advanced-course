package net.client;

import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234); //? Connect to the server running on localhost at port 1234

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //? Content that'll be sent.
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //? Content that'll be received.

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)); //? Reader of the input
        String userInput;

        System.out.println("Enter \"quit\" to leave the chat.");

        while (!(userInput = stdIn.readLine()).equals("quit")) { //? Read input from user
            out.println(userInput); //? Send input to the server

            String serverResponse = in.readLine(); //? Read response from the server
            System.out.println("Server: " + serverResponse);
        }

        // Close streams and socket
        out.close();
        in.close();
        stdIn.close();
        socket.close();
    }
}
