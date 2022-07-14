package com.mohs.reuse;
import org.openqa.selenium.WebDriver;

import com.mohs.config.StartBrowser;
import com.mohs.or.CartPage;
import com.mohs.or.EleProductPage;
import com.mohs.or.HomePage;
import com.mohs.or.ProductPage;
import com.mohs.or.WishList;
import com.mohs.wdcmds.ActionDriver;

public class CartFunctions {
	
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public CartFunctions()
	{
		aDriver = new ActionDriver();
		driver = StartBrowser.driver;
	}
	
	//selecting category (Computer->Desktop)
	public void selectCategory() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Select catgory of product");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.mouseHover(HomePage.lnkComputer, "Computer link");
		aDriver.click(HomePage.lnkDesktop, "Desktop link");
	}
	
	//Adding product(computer) to cart	
	public String addProductToCart() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Add a product to CART");
		aDriver.click(ProductPage.imgProduct, "Product Image");
		String pName=aDriver.getText(ProductPage.textProduct, "Name of the product");
		aDriver.click(ProductPage.btnAddtoCart, "Add to Cart Button");
		aDriver.click(ProductPage.lnkShoppingCart, "Shopping cart link");
		return pName;
	}

	public String cartProductName() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from Cart");
		String cProductName=aDriver.getText(CartPage.lnkProductName, "Name of the product in cart page");
		return cProductName;
	}
	
	//selecting category (Electronics->Cellphones)
		public void selCategory() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Select category of product");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.mouseHover(HomePage.lnkElectronics, "Electronics link");
			aDriver.click(HomePage.lnkCellphones, "Cellphones link");
		}
		
		//Adding product(Cellphones) to cart	
		public String addProductCellphonesToCart() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Add a product to CART");
			aDriver.click(EleProductPage.imgProduct, "product image");
			String prodName=aDriver.getText(EleProductPage.textProduct, "Name of the product");
			aDriver.click(EleProductPage.btnAddtoCart, "Add to cart button");
			aDriver.click(EleProductPage.lnkShoppingCart, "Shopping cart link");
			return prodName;
         }
		public String cartProdName() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from Cart");
			String cProdName=aDriver.getText(CartPage.lnkPhProductName, "Name of the ph product in cart page");
			return cProdName;
		}
		
		// Registration process
		/*public void Register(String Firstname, String Lastname, String Email, String Pwd, String ConfirmPwd) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in DemoWeb shop");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkRegister, "Register link");
			aDriver.click(HomePage.rbGender, "Radio button Gender");
			aDriver.type(HomePage.txtFirstname,  Firstname, "FirstName text box");
			aDriver.type(HomePage.txtLastname, Lastname, "LastName text box");
			aDriver.type(HomePage.txtEmail, Email, "Email text box");
			aDriver.type(HomePage.txtPassword, Pwd, "password text box");
			aDriver.type(HomePage.txtConfirmpassword, ConfirmPwd, "confirm password text box");
			aDriver.click(HomePage.btnRegister, "Register button");
			aDriver.click(HomePage.btnContinue, "Continue button");
		}*/
		
	//Login process
		public void logIn(String email, String pwd) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to DemoWeb shop");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkLogin, "Login link");
			aDriver.type(HomePage.txtemail, email, "email text box");
			aDriver.type(HomePage.txtpwd, pwd, "password text box");
			aDriver.click(HomePage.btnlogin, "Login button");
			aDriver.click(HomePage.lnkLogout, "Logout link");
		}
		//invalid login process
		public void invalidLogIn(String email, String pwd) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to DemoWeb shop with invalid credentials");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkLogin, "Login link");
			aDriver.type(HomePage.txtemail, email, "email text box");
			aDriver.type(HomePage.txtpwd, pwd, "password text box");
			aDriver.click(HomePage.btnlogin, "Login button");
		}	
		//selecting category to add in wishlist
		public void selectJwlryCategory() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Select jewelry category of product");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkJewelry, "Jewelry link");
		}
		//Adding product(chain) to WishList	
		public String addJwlryProductToCart() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Add a product to wishlist");
			aDriver.click(ProductPage.imgChainProduct, "Product image");
			String productName=aDriver.getText(ProductPage.textChainProduct, "Name of the product");
			aDriver.click(ProductPage.btnAddToWishList, "Add to wishlist button");
			aDriver.click(ProductPage.lnkWishList, "wishlist link");
			return productName;
		}
		public String wishlistProductName() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from WishList");
			String wProductName=aDriver.getText(WishList.lnkJewelryProductName, "Name of the jewelry product in wishlist");
			return wProductName;
		}
		//login and subscribe to youtube
		public void logInAndSubscribe(String email, String pwd) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to DemoWeb shop and subscribe to youtube channel");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkLogin, "Login link");
			aDriver.type(HomePage.txtemail, email, "email text box");
			aDriver.type(HomePage.txtpwd, pwd, "password text box");
			aDriver.click(HomePage.btnlogin, "Login button");
			aDriver.click(HomePage.lnkYoutube, "youtube link");
			aDriver.click(HomePage.btnSubscribe, "subscribe button");
			
		}

		//go to sitemap
		public void siteMap(String search) throws Exception
		{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("click sitemap and search for a prod");
		aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		aDriver.click(HomePage.lnkSitemap, "Sitemap link");
		aDriver.click(HomePage.lnkSearch, "search btn");
		aDriver.type(HomePage.txtSearchKeyword, search, "search keyword textbox");
		aDriver.click(HomePage.btnsearch, "search button");
		}
		public String prodName() throws Exception
		{
			aDriver.click(ProductPage.imgprod, "prod image");
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
		    String prodNamejeans=aDriver.getText(ProductPage.textprod, "Name of the product");
		    return prodNamejeans;
		}

		//go to shipping & returns
		public void shippingAndReturns() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Click Shipping&Returns");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkShippingandReturns, "shipping&returns link");
		}
		public String shpngName() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Get txt  from shpng & returns");
			String shpngName = aDriver.getText(HomePage.lnkShpng, "shpng name");
			return shpngName;	
		}
		//go to contact us
		public void contactUs(String name, String email, String enquiry) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("submit your enquiry");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");	
			aDriver.click(HomePage.lnkContactUs, "Contact us link");
			aDriver.type(HomePage.txtName, name, "User name text box");
			aDriver.type(HomePage.txtEmaill, email, "Email text box");
			aDriver.type(HomePage.txtEnquiry, enquiry, "Enquiry text box");
			aDriver.click(HomePage.btnSubmit, "submit button");
		}
		public String enquirysuccessfultxt() throws Exception
		{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Get txt  from contact us");
		String  enquirysuccessfultxt= aDriver.getText(HomePage.txtcontactus, "text from contact us");
		return enquirysuccessfultxt;
		}
		//go to new products page
		public void newProducts() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Select any prod in new products page");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkNewProducts, "new products link");
		}
		public String phCoverProdName() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Get prod name from selected new prod");
			aDriver.click(ProductPage.imgPhCover,"ph cvr prod image");
			String phcvrProdName = aDriver.getText(HomePage.txtphCvr, "text of the product");
			return phcvrProdName;
		}
		//goto shopping cart
		public void shoppingCart() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Select shopping cart");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");	
			aDriver.click(HomePage.lnkShoppingCart, "shopping cart link");
		}
		public String textofshoppingCart() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Get text from shopping cart");
			String textofshoppingCart = aDriver.getText(HomePage.txtemptyshpngcart, "text of the shopping cart");
			return textofshoppingCart;
		}
		//Login and order a product
		public void logInAndOrder(String email, String pwd) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to DemoWeb shop and order a product");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomePage.lnkLogin, "Login link");
			aDriver.type(HomePage.txtemail, email, "email text box");
			aDriver.type(HomePage.txtpwd, pwd, "password text box");
			aDriver.click(HomePage.btnlogin, "Login button");
			aDriver.click(HomePage.lnkApparelAndShoes, "Apparels and shoes link");
			aDriver.click(HomePage.imgBelt, "image of the product");
			aDriver.click(HomePage.btnAddtoCart, "add to cart button");
			aDriver.click(ProductPage.lnkShoppingCart, "shopping cart link");
			aDriver.click(HomePage.chkAgree, "Agree checkbox");
			aDriver.click(HomePage.btnCheckout, "Checkout buttton");
			aDriver.click(HomePage.btnCntnue, "Continue btn");	
			aDriver.click(HomePage.btnBillingContinue, "Billing continue button");
			aDriver.click(HomePage.btnShippingContinue, "Shipping continue button");
			aDriver.click(HomePage.btnShpngMthdContinue, "shpng mthd continue btn");
			aDriver.click(HomePage.btnPaymentMthdContinue, "payment mthd continue btn");
			aDriver.click(HomePage.btnPaymentInfoContinue, "payment info continue btn");
			aDriver.click(HomePage.btnConfirm, "confirm btn");
			//aDriver.click(HomePage.lnkOrderDetails, "product details link");
			}
		public String textofOrdercnfrmtn() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Get confirmation text from ordered product");
			String textofOrdercnfrmtn = aDriver.getText(HomePage.classOrderconfrmtn, "text of the product order date");
			return textofOrdercnfrmtn;
		}
		

}		



