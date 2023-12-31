package chatTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"Ешь меньшими порциями", "Два слова: не годится"};

    public void go() {
        try (ServerSocket serverSocket = new ServerSocket(5000);
             Socket sock = serverSocket.accept();
             PrintWriter writer = new PrintWriter(sock.getOutputStream())) {

            while (true) {
                String advice = getAdvice();
                writer.println(advice);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
    public static void main(String[] args) {
        new DailyAdviceServer().go();
    }
}
