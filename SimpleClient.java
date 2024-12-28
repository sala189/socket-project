import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345); 
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String greeting = in.readLine(); 
            System.out.println("Server says: " + greeting);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

