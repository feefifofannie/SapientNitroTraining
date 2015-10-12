package com.sapient.beans.security;

public interface Authentication {
	public boolean validateCredentials(String firstName, String lastName);
}