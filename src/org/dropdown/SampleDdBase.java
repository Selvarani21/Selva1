package org.dropdown;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleDdBase {
	static WebDriver driver;
	static Select s;
	static JavascriptExecutor j;
	
	
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Geetha\\SampleDropDown\\Driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	public static void scroll(WebElement down) {
		j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(false)",down );
		
	}
	
	public static void selectIndex(WebElement m ,int index) {
		s=new Select(m);
		//s.selectByIndex(index);
		s.selectByValue("7");
		
	}
	
	public static void selectValue(WebElement v,String text2) {
		//s=new Select(v);
		List<WebElement> op = s.getOptions();
		for(int i=0;i<op.size();i++) {
			WebElement each = op.get(i);
			 text2 = each.getAttribute("value");
			if(text2.equals("EU")) {
				s.selectByValue(text2);
			}
			}	
	}
		public static void selectVisible(WebElement vi,String text1) {
		s=new Select(vi);
		//s.selectByVisibleText(text1);
	}
}
