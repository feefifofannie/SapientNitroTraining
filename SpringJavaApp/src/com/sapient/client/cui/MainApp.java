package com.sapient.client.cui;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sapient.beans.Parent;
import com.sapient.beans.security.Authentication;
import com.sapient.beans.security.BasicAuthentication;
import com.sapient.beans.security.GUIAuthentication;

public class MainApp {
	static Logger log = Logger.getLogger(MainApp.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		log.info("Spring IoC instantiated");
		
		Parent parent = (Parent)context.getBean("parentBean");
		log.info(parent.getChild().getName());
		
		/*Authentication authentication = (Authentication) context.getBean("authBean");
		log.info("Authenticator obtained");
		boolean status = authentication.validateCredentials("Jiaju", "Xu");
		log.info(status);
		if (authentication instanceof BasicAuthentication) {
			log.info(((BasicAuthentication)authentication).getMaxAttempts());
		}
		
		
		GUIAuthentication guiAuthentication = (GUIAuthentication) context.getBean("guiAuthBean");
		log.info("Gui authenticator obtained");
		log.info(guiAuthentication.getMaxAttempts());*/
		
	}
}