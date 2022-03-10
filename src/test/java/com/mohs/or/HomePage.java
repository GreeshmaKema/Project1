package com.mohs.or;

import org.openqa.selenium.By;

public class HomePage {
	
	public static By lnkComputer = By.xpath("//a[@href='/computers']");
	public static By lnkDesktop = By.xpath("//a[@href='/desktops']");
	public static By lnkElectronics = By.xpath("//a[@href=\"/electronics\"]");
	public static By lnkCellphones = By.xpath("//a[@href=\"/cell-phones\"]");
	public static By lnkJewelry = By.xpath("//a[@href=\"/jewelry\"]");
	public static By lnkBooks = By.xpath("//a[@href=\"/books\"]");
	public static By btnHome =By.xpath("//a[@href=\"/\"]");
	//To Register
	public static By lnkRegister = By.xpath("//a[@href=\"/register\"]");
	public static By rbGender = By.id("gender-female");
	public static By txtFirstname = By.id("FirstName");
	public static By txtLastname = By.id("LastName");
	public static By txtEmail = By.id("Email");
	public static By txtPassword = By.id("Password");
	public static By txtConfirmpassword = By.id("ConfirmPassword");
	public static By btnRegister = By.id("register-button");
	//To login
	public static By lnkLogin = By.xpath("//a[@href=\"/login\"]");
	public static By txtemail = By.className("email");
	public static By txtpwd = By.className("password");
	public static By btnlogin = By.xpath("//input[@value='Log in']");
	public static By lnkLogout = By.xpath("//a[@class='ico-logout']");
	//To subscribe
	public static By lnkYoutube = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
	public static By btnSubscribe = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
	//To goto sitemap
	public static By lnkSitemap = By.xpath("//a[normalize-space()='Sitemap']");
	public static By lnkSearch = By.xpath("//div[@class='entity-body']//a[normalize-space()='Search']");
	public static By txtSearchKeyword = By.xpath("//input[@id='Q']");
	public static By btnsearch = By.xpath("//input[@class='button-1 search-button']");
}
