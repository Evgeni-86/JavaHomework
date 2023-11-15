package logger;

import java.time.LocalDateTime;

public class SmartLogger implements Logger{
    private long callCounter;

    @Override
    public void log(String message) {
        callCounter++;
        System.out.printf("%s %d [%s] <%s>\n",
                (message.toLowerCase().contains("error")) ? "ERROR" : "INFO",
                callCounter,
                LocalDateTime.now(),
                message);
    }
}
