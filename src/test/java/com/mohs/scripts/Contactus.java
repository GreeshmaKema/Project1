package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class Contactus extends StartBrowser {
  @Test
  public void ContactusTestCase () throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.contactUs("Tester", "testingautomation40@gmail.com", "Hello.This is Test Enquiry");
	  String enquirysuccessfultxt = cfs.enquirysuccessfultxt();
	  Thread.sleep(5000);
  }
}
