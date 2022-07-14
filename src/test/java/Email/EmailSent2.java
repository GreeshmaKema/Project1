package Email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSent2 {

public static void main(String[] args) throws EmailException {

System.out.println("===test started===");
sendEmail_1();
}

public static void sendEmail() throws EmailException {


sendEmail_1();
}

public static void sendEmail_1() throws EmailException {
Email email = new SimpleEmail();
email.setHostName("smtp.gmail.com");
System.out.println("===test started===");
email.setSmtpPort(587);
email.setAuthenticator(new DefaultAuthenticator("tester", "Test@444000"));
email.setSSLOnConnect(true);
email.setFrom("testingautomation40@gmail.com");
email.setSubject("TestMail");
email.setMsg("This is a test mail ... :-)");
email.addTo("mystery81a6@gmail.com");
email.send();
System.out.println("===email sent===");
}

}