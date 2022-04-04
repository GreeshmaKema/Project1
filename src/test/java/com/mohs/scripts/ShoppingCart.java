package com.mohs.scripts;

import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
import com.mohs.reuse.CartFunctions;

public class ShoppingCart extends StartBrowser {
  @Test
  public void ShoppingCartTestCase() throws Exception {
	  CartFunctions cfs = new CartFunctions();
	  cfs.shoppingCart();
	  String textofshoppingCart = cfs.textofshoppingCart();
	  Thread.sleep(5000);
  }
}
