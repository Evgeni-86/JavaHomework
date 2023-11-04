package chatTest;

public class Run {
    public static void main(String[] args) {
        DailyAdviceServer dailyAdviceServer = new DailyAdviceServer();
        SimpleChatClientA simpleChatClientA = new SimpleChatClientA();
        dailyAdviceServer.go();
        simpleChatClientA.go();
    }
}
