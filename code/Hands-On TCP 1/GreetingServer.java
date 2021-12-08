
// File Name GreetingServer.java
import java.net.*;
import java.io.*;

public class GreetingServer {
    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]); // get the port number
        try {
            /*------------Define an instance of the ServerSocket class --------------------*/
            ServerSocket serverSocket = new ServerSocket(port);
            /*--waits until a client connects with the server application 
            at the specified port number)-*/
            System.out.println(
            "Waiting for client on port " + serverSocket.getLocalPort( ) + "...");
            
            Socket server = serverSocket.accept( ); // accept client’s connection
            System.out.println("Just connected to " + server.getRemoteSocketAddress( ));
            /*- Get a reference of the server socket’s input stream and connect a filter to it-*/
            DataInputStream sinput = new DataInputStream(server.getInputStream());
            // get a message from the client and print it
            String st = sinput.readUTF();
            System.out.println("Client says:\t" + st);
            /*- Get a reference of the server socket’s output stream and connect a filter to it*/
            DataOutputStream coutput = new DataOutputStream(server.getOutputStream());
            /*------------------ send the following message to the client-----------------------*/
            coutput.writeUTF("Thank you for connecting to " +
                    server.getLocalSocketAddress() + "\nGoodbye!");
            server.close();
        } catch (SocketTimeoutException s) {
            System.out.println("Socket timed out!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
