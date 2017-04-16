package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class meeting {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omk.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("nbanala@unomaha.edu");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='app']/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div/div/h2/a")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='app']/h2/a[2]")).click();
		Thread.sleep(2000);
	}

}
