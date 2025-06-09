import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPWorker implements Runnable {
    private Socket socket;

    public TCPWorker(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        //클라이언트마다 Socket 스트림에서 데이터를 읽고 처리하고 반환
        try (Socket socket = this.socket;
             BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter socketOut = new PrintWriter(socket.getOutputStream(), true)) {
            String clientInput;

            while ((clientInput = socketIn.readLine()) != null) {
                if (clientInput.equals("bye")) {
                    socketOut.println("Server Closes connection");
                    continue;
                }
                System.out.println(socket.getInetAddress().getHostAddress());
                socketOut.println("Pong: " + clientInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
