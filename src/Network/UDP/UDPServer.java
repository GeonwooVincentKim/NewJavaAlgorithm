package Network.UDP;

import static java.lang.System.out;

// import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9500);
            out.println(socket);

            // DatagramPacket inPacket;
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("<--------------------------->");
            e.printStackTrace();
        }
    }
}
