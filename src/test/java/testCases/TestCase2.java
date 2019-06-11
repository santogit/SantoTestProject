package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import config.Base;
import utilities.ReadProperty;

public class TestCase2 extends Base{
	WebDriver driver;
	ReadProperty rp2;


	@Test
	public void testCase003() throws IOException {
		test = extent.createTest("testCase003");
		driver = initializrDriver();
		rp2 = new ReadProperty();
		driver.get(rp2.getUrl());
		driver.quit();
		
	}
}
