package com.testng;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ASSESS_4_TASK1 {
	@DataProvider(name = "JankiChiragSoni") 
	public Object[][] readExcel() throws Exception, IOException 
	{ 
		Object[][] data = null; 
		String filePath = "C:\\AUTOMATION TOOLS\\guru99 id pass.xlsx";
	File file = new File(filePath); 
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	Sheet sheet=workbook.getSheet("Sheet1");
	int rows=sheet.getPhysicalNumberOfRows();
	System.out.println("Total Rows Are : " +rows );
	data=new Object[rows][];
	for(int i=0;i<data.length;i++)
	{
		Row row=sheet.getRow(i);
		int cols=row.getPhysicalNumberOfCells();
		System.out.println("Total Columns Are : " +cols );
		data[i]=new Object[cols];
		for(int j=0;j<data[i].length;j++)
		{
			Cell cell=row.getCell(j);
			cell.setCellType(CellType.STRING);
			data[i][j]=cell.getStringCellValue();
		}
	}
	return data;
	}
	WebDriver driver=null;
	@Test(dataProvider="JankiChiragSoni")
	public void test(String keyword) throws InterruptedException,Exception,Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION TOOLS\\chromedriver.exe");
		
		
		if (keyword.equals("open browser"))
		{ 
			driver = new ChromeDriver(); 
			Thread.sleep(2000); 
			} else if (keyword.equals("enter url")) 
			{
				driver.get("http://www.demo.guru99.com/V4/");
				
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
			} else if (keyword.equals("UserID"))
			{ 
				driver.findElement(By.name("uid")).sendKeys("mngr546775"); 
				Thread.sleep(2000); 
			} else if (keyword.equals("Password")) 
			{
				driver.findElement(By.name("password")).sendKeys("EmYdAqA"); 
				Thread.sleep(2000);
			} else if (keyword.equals("LOGIN")) 
			{
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
			} else if (keyword.equals("close browser"))
				driver.close();
			{
		}
			
		
	}
}
