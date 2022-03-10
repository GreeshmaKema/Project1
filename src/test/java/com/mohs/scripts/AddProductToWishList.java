package com.mohs.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class AddProductToWishList extends StartBrowser {
  @Test
  public void AddProductToWishListTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.selectJwlryCategory();
	  String productName= cfs.addJwlryProductToCart();
		String wProductName=cfs.wishlistProductName();
		Assert.assertEquals(wProductName, productName);
		Thread.sleep(5000);
  }
}
