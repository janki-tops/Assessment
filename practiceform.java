import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceform {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Janki");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Soni");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement f2=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		f2.click();
		Thread.sleep(2000);
		driver.findElement(By.id("userNumber")).sendKeys("9834569876");
		Thread.sleep(2000);
		WebElement di =driver.findElement(By.id("dateOfBirthInput"));
		di.click();
		new Select(driver.findElement(By.className("react-datepicker__month-select"))).selectByVisibleText("October");
		Thread.sleep(2000);
		new Select(driver.findElement(By.className("react-datepicker__year-select"))).selectByVisibleText("1989");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("subjectsContainer")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadPicture")).sendKeys("photo 1.jpg");
		Thread.sleep(2000);
		driver.findElement(By.id("Current Address")).sendKeys("Ahmedabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).sendKeys("Rajasthan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*//*[@id=\"city\"]/div/div[1]")).sendKeys("Jaipur");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		File Screenshot=((ChromeDriver)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(Screenshot,new File("filled_form_Screenshot.png"));
				
		driver.close();
	}

}
