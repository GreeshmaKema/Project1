package com.mohs.or;

import org.openqa.selenium.By;

public class Books {
	public static By imgBoook1 = By.xpath("//img[@alt=\"Picture of Computing and Internet\"]");
	public static By textimgBoook1 = By.xpath("//a[@href=\"/computing-and-internet\"]");
	// book text locator in recently viewed
	public static By textBoook1 = By.xpath("//a[@href=\"/computing-and-internet\"]");
	public static By imgBoook2 = By.xpath("//img[@src=\"http://demowebshop.tricentis.com/content/images/thumbs/0000133_fiction_125.jpeg\"]");
	public static By textimgBoook2 = By.xpath("//a[@href=\"/fiction\"][2]");
}

