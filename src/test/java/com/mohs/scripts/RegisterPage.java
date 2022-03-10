package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class RegisterPage extends StartBrowser {
  @Test
  public void RegisterPageTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.Register("Greeshma", "Kema", "greeshmasona@gmail.com", "Test@333", "Test@333");
	  Thread.sleep(5000);
  }
}
