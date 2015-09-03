package mainpack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



public class MainApp {
	static Logger log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log = Logger.getLogger(MainApp.class.getName());
		BasicConfigurator.configure();
		
		log.setLevel(Level.TRACE);

		//There are 6 levels of log. Trace is lowest priority, fatal is highest.
		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
		
	}

}
