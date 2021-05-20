package com.xworkz.logger.utility;

import org.apache.log4j.Logger;

public class MailSender {

	static Logger logger;
	
	static {
		logger=Logger.getLogger(MailSender.class);
	}
	public static void main(String[] args) {
		logger.debug("hello");
		logger.info("world");
		logger.warn("welcome");
		logger.error("error message");

	}

}
