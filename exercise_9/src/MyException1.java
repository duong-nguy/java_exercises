import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

   public MyException1() {
    StringWriter strace = new StringWriter();
    printStackTrace(new PrintWriter(strace));
    logger.severe(strace.toString());
   }
}
