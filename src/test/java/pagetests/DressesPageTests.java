package pagetests;


import org.testng.Assert;

import org.testng.annotations.Test;

import pageobjects.BasePage;
import pageobjects.DressesPageObjects;
import pageobjects.HomePageObjects;

public class DressesPageTests {
	
     DressesPageObjects dp;
     HomePageObjects homePage;
     BasePage bp;
     
     public DressesPageTests()
     {
    	 dp=new DressesPageObjects();
    	 homePage=new HomePageObjects();
    	 bp=new BasePage();
    	 
     }
     
     @Test
     public void verifyIcons()
     {  
    	homePage.clickDresses();
  	    Assert.assertTrue(bp.elementFound(dp.getShort()));
  	    Assert.assertTrue(bp.elementFound(dp.getMedium()));
  	    Assert.assertTrue(bp.elementFound(dp.getLarge()));
  	  
  	    
     }
     
     @Test
     public void verifyProductCount()
     {
    	 homePage.clickDresses();
    	 Assert.assertTrue(dp.getProductCount()== dp.getProductCountFromHeader(), "Failed:Count mismatched");
    	 
     }
    
    @Test
    public void verifyAddToCart()
    {
    	homePage.clickDresses();
    	dp.moveToProductOne();
    	String msg=dp.getTxtCart();
    	Assert.assertTrue(msg.contains("added"), "Failed:Product not added to cart");
    	dp.close();
    
    }
   
}
