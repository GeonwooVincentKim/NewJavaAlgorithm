package Network.UDP;

import static java.lang.System.out;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9500);
            out.println(socket);

            DatagramPacket inPacket = null;
            byte[] inMessage = null;
            out.println(inPacket + "\n" + inMessage);

            while (true) {
                out.println("--------------------------");
                inMessage = new byte[1024];
                inPacket = new DatagramPacket(inMessage, inMessage.length);
                out.println("InMessage : " + inMessage + "\n" + "inPacket : " + inPacket);

                // Receive PacketData
                socket.receive(inPacket);

                // Save as Character-String(String)
                String message = new String(inMessage, 0, inPacket.getLength());
                out.println("Client Message : " + message);

                InetAddress address = inPacket.getAddress();
                int port = inPacket.getPort();

                out.println("Client Address : " + address);
                out.println("Client Port-Number : " + port);
            }
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("<--------------------------->");
            e.printStackTrace();
        }
    }
}
