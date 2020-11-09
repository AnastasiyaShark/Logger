package Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger = null;

    protected int num = 1;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private Logger() {
    }

    public void log(String msg) {
        System.out.println("[" + formatter.format(new Date()) + "  " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
