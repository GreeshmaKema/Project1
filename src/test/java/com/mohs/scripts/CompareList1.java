package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.Customer_servicesCF;

public class CompareList1 extends StartBrowser{
	@Test
	public void CompareList1TestCase() throws Exception {
		Customer_servicesCF cfs = new Customer_servicesCF();
	    cfs.Compare_list1();
		Thread.sleep(5000);
	}
	
}

