package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class LoginPage extends StartBrowser {
  @Test
  public void LoginPageTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.logIn("testingautomation40@gmail.com", "Test@111");
	  Thread.sleep(5000);
  }
}
