package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mentor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omk.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("nbanala@unomaha.edu");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/mentors']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='app']/h2/a[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Karthik");
		driver.findElement(By.id("qualification")).sendKeys("mba");
		driver.findElement(By.id("address")).sendKeys("Jones Circ");
		driver.findElement(By.id("zip")).sendKeys("68106");
		driver.findElement(By.id("email")).sendKeys("karthik@mentor.com");
		driver.findElement(By.id("phone")).sendKeys("987654321");
		driver.findElement(By.xpath("/html/body/div/form/div[7]/input")).click();
		driver.findElement(By.xpath("//*[@id='app']/table/tbody/tr[1]/td[8]/a")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys("55555");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/form/div[7]/input")).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//html//body//div//form//div[6]/input")).click();
		WebDriverWait wait4= new WebDriverWait(driver, 30);
	}

}
