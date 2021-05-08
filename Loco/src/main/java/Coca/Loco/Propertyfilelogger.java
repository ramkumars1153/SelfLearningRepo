package Coca.Loco;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Propertyfilelogger {
	
	static Logger log = Logger.getLogger(Logfilechecking.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("");

		log.debug("This is a debug");
		log.info("This is a info");
		log.fatal("This is a fatal");
		log.error("this is a erro");
		log.warn("This is a warning");
		
	}

}
