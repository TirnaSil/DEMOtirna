package demo1;
import org.apache.commons.mail.Email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Send_Email_Project {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		System.out.println("========TEST STARTED=======");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("siltirna195@gmail", "tirna71796"));
		email.setSSLOnConnect(true);
		email.setFrom("siltirna195@gmail");
		email.setSubject(" Selenium TestMail");
		email.setMsg("This is a test mail  from selenium ... :-)");
		email.addTo("siltirna195@gmail.com");
		email.send();
		System.out.println("=========EMAIL SENT========");
	}

}
