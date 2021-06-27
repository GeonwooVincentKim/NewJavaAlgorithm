package Network.TCP;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPExample {
    public static void main(String[] args) {
        // Generate Socket
        ServerSocket server = null;
        out.println(server);

        try {
            server = new ServerSocket(9999);

            // Waiting for client access to Server -> Infinite Repetition
            while (true) {
                out.println("Waiting for Client access to Server");
                Socket client = server.accept();
                out.println(client);

                HttpThread ht = new HttpThread(client);
                ht.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("----------------");
                e.printStackTrace();
            }
        }
    }
}

class HttpThread extends Thread {
    private Socket client;
    BufferedReader bufferedReader;
    PrintWriter printWriter;

    HttpThread(Socket client) {
        this.setClient(client);

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            printWriter = new PrintWriter(client.getOutputStream());
        } catch (IOException e) {
            out.println(e.getMessage());
            out.println("------------------");
            e.printStackTrace();
        }
    }

    public Socket getClient() {
        return client;
    }

    public void setClient(Socket client) {
        this.client = client;
    }
}