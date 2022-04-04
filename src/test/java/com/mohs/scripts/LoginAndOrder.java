package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class LoginAndOrder extends StartBrowser {
  @Test
  public void LoginAndOrderTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.logInAndOrder("mystery81a6@gmail.com", "Test@987");
	  String textofOrdercnfrmtn = cfs.textofOrdercnfrmtn();
	  Thread.sleep(5000);
  }
}
