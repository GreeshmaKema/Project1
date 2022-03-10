package com.mohs.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class AddProductToCart extends StartBrowser{
	@Test
	public void AddProductToCartTestCase() throws Exception {
		CartFunctions cfs = new CartFunctions();
		cfs.selectCategory();
		String pName= cfs.addProductToCart();
		String cProductName=cfs.cartProductName();
		Assert.assertEquals(cProductName, pName);
		Thread.sleep(5000);
	}
}
