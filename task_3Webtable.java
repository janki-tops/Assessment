import java.util.List;

import org.apache.poi.ss.usermodel.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_3Webtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
        double maxHeight = 0;
        String maxName = "";
        for (int i = 1; i < rows.size(); i++) {
          
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));

            double height = Double.parseDouble(columns.get(1).getText().replace("m", ""));

            if (height > maxHeight) {
                maxHeight = height;
                maxName = columns.get(0).getText();
            }
           }
      
        System.out.println("The tallest structure is " + maxName + " with a height of " + maxHeight + "m");
	}

}
