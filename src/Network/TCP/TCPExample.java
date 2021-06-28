package Network.TCP;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
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
            // Set the Server Port as `9999`
            server = new ServerSocket(9999);

            // Waiting for client access to Server -> Infinite Repetition
            while (true) {
                out.println("Waiting for Client access to Server");
                // Listens for a connection to be made to this socket and accepts it.
                Socket client = server.accept();
                out.println(client);

                // Call the HttpThread Class
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
            // Initialize BufferedReader instance and PrintWriter Instance
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

    public void run() {
        BufferedReader fileBufferedReader = null;
        DataOutputStream outToClient = null;

        out.println("----------------");
        out.print("Current `FileBufferedReader` value : ");
        out.println(fileBufferedReader);

        out.print("Current `OutToClient` value : ");
        out.println(outToClient);

        try {
            // Line : Get / HTTP/1.1
            String line = bufferedReader.readLine();
            out.println("Http Reader : " + line);

            // Get the `index.html` page information
            // Starting from `Get /`
            int start = line.indexOf("/") + 1;

            // Get from `HTTP` which is behind of `index.html`, the file-name
            int end = line.lastIndexOf("HTTP") - 1;

            // If the substituted string is equals to "",
            // Then get the fileName as `index.html`.
            String fileName = line.substring(start, end);
            if (fileName.equals("")) {
                fileName = "index.html";
            }
            out.println("사용자 요청 파일 : " + fileName);
            // Connect to `Index.html` File from Server
            fileBufferedReader = new BufferedReader(new FileReader(fileName));

            String fileLine = null;
            printWriter.println("HTTP/1.0 200 Document Follows \r\n");

            // Print the result of gotten file-information
            while ((fileLine = fileBufferedReader.readLine()) != null) {
                printWriter.println(fileLine);
                printWriter.flush(); // Print the rest of text and empty the printWriter Instance
            }
        } catch (IOException e) {
            out.println(e.getMessage());
            out.println("----------------");
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (printWriter != null)
                    printWriter.close();
                if (client != null)
                    client.close();
            } catch (IOException e) {
                out.println(e.getMessage());
                out.println("---------------");
                e.printStackTrace();
            }
        }
    }
}