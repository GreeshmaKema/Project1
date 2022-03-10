package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class Sitemap_searchprod extends StartBrowser {
  @Test
  public void Sitemap_searchprodTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.siteMap("blue jeans");
	  String prodName= cfs.prodName();
		Thread.sleep(5000);
  }
}
