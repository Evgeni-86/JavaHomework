package chatTest;

public class Run {
    public static void main(String[] args) {
        DailyAdviceServer adviceServer = new DailyAdviceServer();
        adviceServer.go();
        DailyAdviceClient adviceClient = new DailyAdviceClient();
        adviceClient.go();
    }
}
