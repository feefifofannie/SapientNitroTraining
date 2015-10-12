package com.sapient.beans.security;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.sapient.client.cui.MainApp;

public class SecureAuthentication implements Authentication {

	public SecureAuthentication() {
		Logger log = Logger.getLogger(MainApp.class.getName());
		BasicConfigurator.configure();
		
		log.info("Secure Authenticator instantiated");
	}
	
	@Override
	public boolean validateCredentials(String firstName, String lastName) {
		if (firstName.equalsIgnoreCase("jiaju") && lastName.equals("Xu")) {
			return true;
		}
		return false;
	}

}