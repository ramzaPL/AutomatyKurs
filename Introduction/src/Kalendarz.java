import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Kalendarz {

	public static void main(String[] args) {
		
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//8_59 kalendarz calender
		// kalendarz wyœwitli siê samoistnie po wybraniu kierunków podró¿y
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//option[@value='BLR']")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='MAA']")).click(); // to co wy¿ej tylko xpatch od rodzica do dziecka
		
		
		//8_60 widocznoœc elementu disabled enabled
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//System.out.println("Czy obszar jest dostêpny: "+driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // sprawdza czy element strony jest aktywny, dzia³a niepoprawnie je¿eli strona jest zle zaimplementowana
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//obejœcie problemu z niedzia³aj¹ca funkcj¹ isEnabled
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Drugi kalendarz aktywny");
			Assert.assertTrue(true);
				
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
