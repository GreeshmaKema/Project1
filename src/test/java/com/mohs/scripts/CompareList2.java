package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.Customer_servicesCF;

public class CompareList2 extends StartBrowser{
	@Test
	public void CompareList2TestCase() throws Exception {
		Customer_servicesCF cfs = new Customer_servicesCF();
	    cfs.Compare_list2();
		Thread.sleep(5000);
	}
	
}
