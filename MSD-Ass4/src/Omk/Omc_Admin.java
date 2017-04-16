package omc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omc_Admin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omk.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("karthik@admin.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/admins']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/h2/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Karthik");
		driver.findElement(By.id("qualification")).sendKeys("mba");
		driver.findElement(By.id("address")).sendKeys("Jones Circ");
		driver.findElement(By.id("zip")).sendKeys("68106");
		driver.findElement(By.id("email")).sendKeys("karthik@mentor.com");
		driver.findElement(By.id("phone")).sendKeys("9000000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[7]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='app']/table/tbody/tr[2]/td[8]/a")).click();
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys("60000");
		driver.findElement(By.xpath("/html/body/div[1]/form/div[7]/input")).click();
		
	}

}
