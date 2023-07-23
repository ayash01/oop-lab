import java.net.*;
import java.util.Scanner;

class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(3000);
            InetAddress serverAddress = InetAddress.getLocalHost();
            System.out.println("Server started");
            System.out.println("Server listening on " + serverAddress.getHostAddress() + ":3000");

            Scanner input = new Scanner(System.in);

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received message from client: " + receivePacket.getAddress().getHostAddress() + ": " + message);

                byte[] sendData;
                System.out.print("Enter message to send to client " + receivePacket.getAddress().getHostAddress() + ": ");
                String userMessage = input.nextLine();
                sendData = userMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}