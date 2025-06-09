import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);
             Socket socket = new Socket("210.125.213.180", 8080);
             BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter socketOut = new PrintWriter(socket.getOutputStream(), true)) {
            while (true) {
                System.out.print("메세지 입력: ");
                String userInput = sc.nextLine();
                socketOut.println(userInput);

                String serverReturn = socketIn.readLine();
                System.out.println(serverReturn);
                if (userInput.equals("bye")) break;
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
