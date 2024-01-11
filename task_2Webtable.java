import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_2Webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 WebElement table = driver.findElement(By.id("t01"));
	       
	        WebElement lastRow = table.findElement(By.xpath("//tr[last()]"));
	       
	        java.util.List<WebElement> columns = lastRow.findElements(By.tagName("td"));

	        assert columns.size() == 2;
	        driver.close();
	}

}
