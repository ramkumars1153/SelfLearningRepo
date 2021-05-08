package Coca.Loco;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logfilechecking {
	
	static Logger log = Logger.getLogger(Logfilechecking.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();

		log.debug("This is a debug");
		log.info("This is a info");
		log.fatal("This is a fatal");
		log.error("this is a erro");
		log.warn("This is a warning");
		
	}

}
