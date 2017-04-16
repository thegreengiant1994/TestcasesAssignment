package omc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omc_Mentor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omk.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("karthik@mentor.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/mentors']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/h2/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='app']/a")).click();
		driver.findElement(By.id("id")).sendKeys("47");
		driver.findElement(By.name("student_name")).sendKeys("ram");
		driver.findElement(By.name("attendance")).sendKeys("Yes");
		driver.findElement(By.name("comment")).sendKeys("Good performance");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/div[5]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='app']/table/tbody/tr[2]/td[5]/form/input[3]")).click();
		
		
	}

}
