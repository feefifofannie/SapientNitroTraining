package com.sapient.beans.security;

import org.apache.log4j.Logger;

import com.sapient.client.cui.MainApp;

public class BasicAuthentication implements Authentication {

	private int maxAttempts;

	public BasicAuthentication() {
		Logger log = Logger.getLogger(MainApp.class.getName());

		log.info("Basic Authenticator instantiated");
	}

	public int getMaxAttempts() {
		return maxAttempts;
	}

	public void setMaxAttempts(int maxAttempts) {
		this.maxAttempts = maxAttempts;
	}

	@Override
	public boolean validateCredentials(String firstName, String lastName) {
		if (firstName.equalsIgnoreCase("jiaju") && lastName.equals("Xu")) {
			return true;
		}
		return false;
	}

}