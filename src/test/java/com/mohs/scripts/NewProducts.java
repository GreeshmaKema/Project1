package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class NewProducts extends StartBrowser {
  @Test
  public void NewProductsTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.newProducts();
	  String phCoverProdName = cfs.phCoverProdName();
	  Thread.sleep(5000);
  }
}
