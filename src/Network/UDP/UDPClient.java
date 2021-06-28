package Network.UDP;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Get the Input from Keyboard
            BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
            out.println(systemIn);

            // Server IP (127.0.0.1 = Local)
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            out.println(serverIP);

            while (true) {
                String data = systemIn.readLine();
                out.println(data);

            }
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("-------------");
            e.printStackTrace();
        }
    }
}
