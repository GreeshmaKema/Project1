package com.mohs.reuse;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mohs.config.StartBrowser;
import com.mohs.or.Books;
import com.mohs.or.CartPage;
import com.mohs.or.Comparelist_OR;
import com.mohs.or.Customer_ServisesOR;
import com.mohs.or.HomePage;
import com.mohs.or.Jewelry;
import com.mohs.or.ProductPage;
import com.mohs.wdcmds.ActionDriver;

public class Customer_servicesCF {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public Customer_servicesCF()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	
	
	  public void Pagedown() throws Exception
	  
	  { 
	  StartBrowser.childTest =StartBrowser.parentTest.createNode("Page down");
	  aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.PAGE_DOWN).perform();
	  a.sendKeys(Keys.PAGE_DOWN).perform();
	  }
	 
	public void Newsbtn() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("News button");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(Customer_ServisesOR.btnNews, "Performed click operation on News button");
	}
	
	public void Blogbtn() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Blog buttton");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(Customer_ServisesOR.btnBlog, "Performed click operation on Blog button");
	}
	public String  Recentlyviewed1() throws Exception 
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Recently Viewed List");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(HomePage.lnkBooks, " books category Selected");
		String Book1=aDriver.getText(Books.textimgBoook1,"Book1 Text");
		aDriver.click(Books.imgBoook1, "Book is viewed");
		aDriver.click(HomePage.btnHome, "Home button");
		aDriver.click(Customer_ServisesOR.btnRecentlyviewed, "Performed click operation on Recentlyviewed button");
		return Book1;
		
		
	}
	public String  Book1text() throws Exception 
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Book1 text ");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		String recentlyviewed=aDriver.getText(Books.textBoook1, "Book1 text in recently viewed");
		return recentlyviewed ;
	}
	
		public void  Recentlyviewed2() throws Exception 
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Recently Viewed List second scenario");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(HomePage.lnkBooks, " books category Selected");
		aDriver.click(Books.imgBoook1, "Book is viewed");
		aDriver.click(HomePage.btnHome, "Home button");
		aDriver.click(HomePage.lnkBooks, " books category Selected");
		aDriver.click(Books.imgBoook2, " Another Book is viewed");
		aDriver.click(HomePage.btnHome, "Home button");
		aDriver.click(Customer_ServisesOR.btnRecentlyviewed, "Performed click operation on Recentlyviewed button");
		
	}
	
	public void Compare_list2() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Compare list List with same category products scenario");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(HomePage.lnkBooks, " books category Selected");
		aDriver.click(Books.imgBoook1, "A Book is selected"); 
		aDriver.click(Comparelist_OR.btnComparelistBook, "Product added to compare list");
		aDriver.click(HomePage.btnHome, "Home button");
		aDriver.click(HomePage.lnkJewelry, "Jewelry category is selected");
		aDriver.click(Jewelry.imgJewelry, "Jewelry item is selected");
		aDriver.click(Comparelist_OR.btnComparelistJewelry, "Product added to compare list");
		aDriver.click(HomePage.btnHome, "Home button");
		aDriver.click(Customer_ServisesOR.btnComparelist, "Performed click operation on Compare list button");
		
	}
	
	public void Compare_list1() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Compare list List with same category products scenario");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(HomePage.lnkBooks, " books category Selected");
		aDriver.click(Books.imgBoook1, "A Book is selected"); 
		aDriver.click(Comparelist_OR.btnComparelistBook, "Product added to compare list");
		aDriver.click(HomePage.btnHome, "Home button");
		aDriver.click(HomePage.lnkBooks, "Books category is selected");
		aDriver.click(Books.imgBoook2, "Same category item is selected");
		aDriver.click(Comparelist_OR.btnComparelistJewelry, "Product added to compare list");
		aDriver.click(HomePage.btnHome, "Home button");
		aDriver.click(Customer_ServisesOR.btnComparelist, "Performed click operation on Compare list button");
		
	}

	
}

