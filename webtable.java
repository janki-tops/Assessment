import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement table2 = driver.findElement(By.id("table2"));
        java.util.List<WebElement> rows = table2.findElements(By.tagName("tr"));
        int structureCount = 0;
        for (WebElement row : rows) {
            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                String cellText = cell.getText();
                if (cellText.equals("Structure")) {
                    structureCount++;
                }
            }
        }

        assert structureCount == 4;

		driver.close();
	}

	public static List<WebElement> findElements(By tagName) {
		
		return null;
	}

}
