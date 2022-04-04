package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class ShippingandReturns extends StartBrowser {
  @Test
  public void ShippingandReturnsTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
		cfs.shippingAndReturns();
		String shpngName = cfs.shpngName();
		Thread.sleep(5000);
	  
  }
}
