package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.Customer_servicesCF;

public class Newsbtn extends StartBrowser{
	@Test
	public void NewsbtnTestCase() throws Exception {
		Customer_servicesCF cfs = new Customer_servicesCF();
	    cfs.Pagedown();
	    Thread.sleep(2000);
	    cfs.Newsbtn();
		Thread.sleep(5000);
	}
}

