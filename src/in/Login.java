package in;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
try {
		driver.navigate().to("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		System.out.println("Login completed");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='material-icons notranslate MuiIcon-root MuiIcon-fontSizeSmall css-va0op3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='nav-bullet css-13ded6j']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space(text())='Add Bulk Orders']")).click();
        Thread.sleep(1000);
        System.out.println("ckick on Add Bulk order");
        WebElement fileinput = driver.findElement(By.xpath("//div[contains(@class,'MuiOutlinedInput-root MuiInputBase-root')]//input[1]"));
        fileinput.sendKeys("C:\\Users\\91700\\Downloads\\demo-data.xlsx");
        Thread.sleep(7000);
        System.out.println("file upload sucessfully");	
        driver.findElement(By.xpath("//div[@class='MuiBox-root css-1xi4464']//button[1]")).click();
        Thread.sleep(1000);
        System.out.println("click on import button");
        driver.findElement(By.xpath("//div[@class='MuiBox-root css-1xi4464']//button[1]")).click();
        Thread.sleep(3000);
        System.out.println("click on validate button");
        Alert a =driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[normalize-space(text())='Next']")).click();
        }
		
        catch (Exception e) {
        File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File("D:\\TestResults.png"));
		System.out.println("take a screenshot");
        }
		driver.close();
	}
}
