
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggingTut {
	
	public static Logger log= LogManager.getLogger(LoggingTut.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   log.debug("I am debugging");
   log.info("I am collecting Info");
   log.error("Error is found");
   log.fatal("Fatal error is found");
	}

}
