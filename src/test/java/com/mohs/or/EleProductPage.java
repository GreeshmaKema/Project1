package com.mohs.or;

import org.openqa.selenium.By;

public class EleProductPage {
	
	public static By imgProduct = By.xpath("//img[@title=\"Show details for Smartphone\"]");
	public static By btnAddtoCart = By.id("add-to-cart-button-43");
	public static By textProduct = By.xpath("//h1[@itemprop=\"name\"]");
	public static By lnkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

}
