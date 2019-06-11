package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.Base;
import utilities.ReadProperty;

public class TestCase1 extends Base {
	public WebDriver driver;
	public ReadProperty rp1;

	@Test
	public void testCase001() throws IOException {
		test = extent.createTest("testCase001");
		driver = initializrDriver();
		rp1 = new ReadProperty();
		driver.get(rp1.getUrl());
		driver.quit();
		
	}
	
	@Test
	public void testCase002() throws IOException {
		test = extent.createTest("testCase002");
		driver = initializrDriver();
		rp1 = new ReadProperty();
		driver.get(rp1.getUrl());
		Assert.assertEquals(false, true);
		driver.quit();
		
	}
}
