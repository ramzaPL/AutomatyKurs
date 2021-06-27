import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {

		//8_62
		int i=0;
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		
		// kalendarz wyœwitli siê samoistnie po wybraniu kierunków podró¿y
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//option[@value='DEL']")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='MAA']")).click(); // xpatch od rodzica do dziecka
		
		//klikniêcie w aktywn¹-bierz¹c¹- datê w pierwszym kalendarzu
		driver.findElement(By.cssSelector(".ui-state-active")).click();

		
		//obejœcie problemu z niedzia³aj¹ca funkcj¹ isEnabled
		//weryfikuje czy drugi kalendarz jest wy³¹czony
		// w 5 minucie jest b³¹d, ale lecimy z tym dlaej
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Drugi kalendarz nie aktywny");
			Assert.assertTrue(true);
				
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		//zaznaczenie checkboxa "SR. Citizen"
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.cssSelector("div[class='paxinfo']")).click();
		//TO MI COŒ NIE DZIA£A // Brakuje pêtli for z lekcji
		//driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")).click();
		Thread.sleep(2000);
		Select adult = new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")));
		adult.selectByVisibleText("4");
		//ponownie klikniêcie w obszar odpoweidzialny za liczbê pasa¿erów po to zeby go zamkn¹æ - bez tego czasami nie idzie dalej
		driver.findElement(By.cssSelector("div[class='paxinfo']")).click();
		
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
			//driver.findElement(By.cssSelector("input[type='submit']")).click(); // to co powy¿ej
			//driver.findElement(By.xpath("//input[@type='submit']")).click(); // to co powy¿ej
			//driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click(); // to co powy¿ej
		
	}

}
