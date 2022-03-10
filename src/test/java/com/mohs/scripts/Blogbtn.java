package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.Customer_servicesCF;

public class Blogbtn extends StartBrowser{
	@Test
	public void BlogbtnTestCase() throws Exception {
		Customer_servicesCF cfs = new Customer_servicesCF();
	    cfs.Pagedown();
	    Thread.sleep(2000);
	    cfs.Blogbtn();
		Thread.sleep(5000);
	}
}

