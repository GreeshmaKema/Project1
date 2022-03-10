package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class InvalidLogIn extends StartBrowser {
  @Test
  public void InvalidLogInTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.invalidLogIn("testingautomation40@gmail.com", "Test@1114");
	  Thread.sleep(5000);
  }
}
