package Email;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class EmailSent1 {

	public static void main(String[] args) throws EmailException, MalformedURLException {
		
	System.out.println("===test started===");

  // Create the email message
  HtmlEmail email = new HtmlEmail();
  email.setHostName("smtp.gmail.com");
  email.addTo("mystery81a6@gmail.com", "mystery");
  email.setFrom("greeshmasona3@gmail.com", "greeshma");
  email.setSubject("html report");
  
  // embed the image and get the content id
  URL url = new URL("file:///C:/Users/Tharun/eclipse-workspace/.metadata/Sample_Framework1/Report/AutomationReport.html");
  String cid = email.embed(url, "Automation report");
  
  // set the html message
  email.setHtmlMsg("<html>The automation report - <img src=\"cid:"+cid+"\"></html>");

  // set the alternative message
  email.setTextMsg("test mail from selenium");

  // send the email
  email.send();
  
  System.out.println("===email sent===");
	}

}
