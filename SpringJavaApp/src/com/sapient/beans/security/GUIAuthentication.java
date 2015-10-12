package com.sapient.beans.security;

import org.apache.log4j.Logger;

import com.sapient.client.cui.MainApp;

public class GUIAuthentication {
	private int maxAttempts;

	public GUIAuthentication() {
		Logger log = Logger.getLogger(MainApp.class.getName());

		log.info("GUI Authenticator instantiated");
	}

	public int getMaxAttempts() {
		return maxAttempts;
	}

	public void setMaxAttempts(int maxAttempts) {
		this.maxAttempts = maxAttempts;
	}

}