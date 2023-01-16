import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    private static Logger instance;

    private Logger() {
    }

    public void log(String msg) {
        System.out.println("[" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                .format(Calendar.getInstance().getTime()) + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

}
