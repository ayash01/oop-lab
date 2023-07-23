import java.net.Socket;
import java.io.*;

class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 3000);
            System.out.println("Connected to server at " + socket.getInetAddress().getHostAddress() + ":3000");

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Client started");

            while (true) {
                System.out.print("Enter message: ");
                String str = userInput.readLine();
                out.println(str);
                System.out.println(in.readLine());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

