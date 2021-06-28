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
                // Generate inMessage byte array and set it length as `1024`
                // 1 KB(Kilo-Byte) = 1024 Bytes
                inMessage = new byte[1024];

                // Generate InPacket Instance
                inPacket = new DatagramPacket(inMessage, inMessage.length);
                out.println("InMessage : " + inMessage + "\n" + "inMessage length : " + inMessage.length + "\n"
                        + "inPacket : " + inPacket);

                // Receive PacketData
                socket.receive(inPacket);

                // Save as Character-String(String)
                String message = new String(inMessage, 0, inPacket.getLength());
                out.println("Client Message : " + message + "\n" + "Client Message length : " + inMessage.length);

                // Client IP
                InetAddress address = inPacket.getAddress();

                // Client Port
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
