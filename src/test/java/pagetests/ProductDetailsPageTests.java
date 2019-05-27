package pagetests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.BasePage;
import pageobjects.HomePageObjects;
import pageobjects.ProductDetailsPageObjects;

public class ProductDetailsPageTests {
	 HomePageObjects homePage;
	 BasePage bp;
	 ProductDetailsPageObjects pd;
	
	public ProductDetailsPageTests()
	{
		homePage=new HomePageObjects();
		bp=new BasePage();
		pd=new ProductDetailsPageObjects();
	}
	
	@Test
	public void verifyButtons()
	{
		
		
		Assert.assertTrue(bp.elementFound(pd.getShare()));
		Assert.assertTrue(bp.elementFound(pd.getTweet()));
	}
	
	@Test
	public void verifyProdDesc()
	{
		
		
		Assert.assertTrue(bp.elementFound(pd.getProdDesc()));
	}
	
    @BeforeMethod
    public void before()
	    {
	    	homePage.clickDresses();
	    	pd.moveToProduct();
	    }

}
