package Network.UDP;

import static java.lang.System.out;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

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

                break;
            }
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("<--------------------------->");
            e.printStackTrace();
        }
    }
}
