package com.mohs.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class AddPhProductToCart extends StartBrowser{
  @Test
  public void AddPhProductToCartTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.selCategory();
	  String prodName= cfs.addProductCellphonesToCart();
		String cProdName=cfs.cartProdName();
		Assert.assertEquals(cProdName, prodName);
		Thread.sleep(5000);
  }
}
