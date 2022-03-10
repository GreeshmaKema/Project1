package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.Customer_servicesCF;

public class Recently_viewed_button2 extends StartBrowser{
	@Test
	public void Recently_viewed_button2TestCase() throws Exception {
		Customer_servicesCF cfs = new Customer_servicesCF();
	    cfs.Recentlyviewed2();
		Thread.sleep(5000);
	}
	
}
