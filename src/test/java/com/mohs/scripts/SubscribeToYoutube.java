package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class SubscribeToYoutube extends StartBrowser{
  @Test
  public void SubscribeToYoutubeTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.logInAndSubscribe("testingautomation40@gmail.com", "Test@111");
	  Thread.sleep(5000);
  }
}
