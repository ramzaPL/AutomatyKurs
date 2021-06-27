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
		
		// kalendarz wy�witli si� samoistnie po wybraniu kierunk�w podr�y
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//option[@value='DEL']")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='MAA']")).click(); // xpatch od rodzica do dziecka
		
		//klikni�cie w aktywn�-bierz�c�- dat� w pierwszym kalendarzu
		driver.findElement(By.cssSelector(".ui-state-active")).click();

		
		//obej�cie problemu z niedzia�aj�ca funkcj� isEnabled
		//weryfikuje czy drugi kalendarz jest wy��czony
		// w 5 minucie jest b��d, ale lecimy z tym dlaej
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
		//TO MI CO� NIE DZIA�A // Brakuje p�tli for z lekcji
		//driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")).click();
		Thread.sleep(2000);
		Select adult = new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")));
		adult.selectByVisibleText("4");
		//ponownie klikni�cie w obszar odpoweidzialny za liczb� pasa�er�w po to zeby go zamkn�� - bez tego czasami nie idzie dalej
		driver.findElement(By.cssSelector("div[class='paxinfo']")).click();
		
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
			//driver.findElement(By.cssSelector("input[type='submit']")).click(); // to co powy�ej
			//driver.findElement(By.xpath("//input[@type='submit']")).click(); // to co powy�ej
			//driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click(); // to co powy�ej
		
	}

}
