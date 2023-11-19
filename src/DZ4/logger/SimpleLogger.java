package DZ4.logger;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.printf("[%s] <%s>\n", LocalDateTime.now(), message);
    }
}
