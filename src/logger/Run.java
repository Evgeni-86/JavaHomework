package logger;

public class Run {
    public static void main(String[] args) {
        SimpleLogger simpleLogger = new SimpleLogger();
        simpleLogger.log("AAAAA");

        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log("DDD");
        smartLogger.log("error FFF");
        smartLogger.log("GGG");
        smartLogger.log("MMM");
    }
}
