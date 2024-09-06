package ui;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		
WebDriver driver = new ChromeDriver();

driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
driver.findElement(By.xpath("(//table[@id='sitemap']//a)[1]")).click();
driver.manage().window().setSize(new Dimension(1920,1080));
File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f1,new File("D:\\TestResults1.png"));

System.out.println("take a screenshot");
driver.close();

	
	
	
	
	
	
	}

}
