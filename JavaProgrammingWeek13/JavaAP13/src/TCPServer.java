import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private int port;

    public TCPServer(int port) {
        this.port = port;
    }

    public void update() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println(serverSocket.getInetAddress().getHostAddress());
            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("클라이언트 접속: " + clientSocket.getInetAddress().getHostAddress());
                TCPWorker worker = new TCPWorker(clientSocket);
                Thread t = new Thread(worker);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
