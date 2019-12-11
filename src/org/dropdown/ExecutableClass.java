package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends SampleDdBase {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("https://www.toolsqa.com/automation-practice-form/");
		WebElement dd = driver.findElement(By.xpath("//label[text()='Continents – Multiple Select']"));
		scroll(dd);
		WebElement a = driver.findElement((By.id("continents")));
		selectIndex(a,5);
		Thread.sleep(5000);
		selectValue(a, "EU");
		Thread.sleep(5000);
		selectVisible(a, "Africa");
		
	}

}


