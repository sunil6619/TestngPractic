package DemoLogg;
import org.apache.logging.log4j.*;
public class LoggerDemo {

    public static void main(String[] args) {

        Logger log= LogManager.getLogger("LoggerDemo");
        System.out.println(" This is logger demo");

        log.info("for info only");
        log.debug("for debug");
        log.error("error message");
        log.warn("warning message");

    }
}
