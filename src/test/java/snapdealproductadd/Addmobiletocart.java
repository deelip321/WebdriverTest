package snapdealproductadd;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addmobiletocart {
	WebDriver driver;
	
	@Test
	public void addmobiletocart() {
		driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.id("inputValEnter")).sendKeys("Mobile");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
	driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
	driver.findElement(By.xpath("(//li[@class='search-li'])[3]")).click();
	WebElement ele2 =driver.findElement(By.id("display-price-641085904072"));
	ele2.click();
	
	String parent=driver.getWindowHandle();
	Set<String> s=driver.getWindowHandles();
	
	Iterator<String >it=s.iterator();
	
	while(it.hasNext()) {
		String childwindow=it.next();
		
		if(!parent.equals(childwindow)) {
			driver.switchTo().window(childwindow);
			driver.findElement(By.xpath("//span[@class='intialtext']")).click();
			driver.findElement(By.xpath("//span[@class='class']")).click();
			driver.quit();
		}
		driver.switchTo().window(parent);
	}

	
	
	
	
	
	
	

	
	
		
		
		
		
		
		
		
	}

}
