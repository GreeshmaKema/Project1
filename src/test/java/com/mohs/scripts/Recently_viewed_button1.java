package com.mohs.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.Customer_servicesCF;

public class Recently_viewed_button1 extends StartBrowser{
	@Test
	public void Recently_viewed_button1TestCase() throws Exception {
		Customer_servicesCF cfs = new Customer_servicesCF();
		String Book1=cfs.Recentlyviewed1();
		String recentlyviewed=cfs.Book1text();
		Assert.assertEquals(recentlyviewed,Book1 );
		Thread.sleep(5000);
	}
	
}
