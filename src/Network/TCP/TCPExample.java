package Network.TCP;

import static java.lang.System.out;

import java.io.IOException;
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
