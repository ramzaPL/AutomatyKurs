import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create Driver object
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		
		//driver.get("https://stackoverflow.com/");
		//System.out.println(driver.getTitle());
		
		//Wy�wietli aktualny url, wzrokowo pozwala go zweryfikowa� i pozwala zapobiec niechcianym przekierowaniom
		//System.out.println(driver.getCurrentUrl());
		
		//wy�wietla zrod�o strony w przypadku kiedy tego �d�a nie da si� podejrze� w przegl�darce
		//System.out.println(driver.getPageSource());

		//driver.get("https://www.wp.pl/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close(); //zamyka bierz�ce okno
		//driver.quit(); //zamyka ca�� przegl�dark�
		
		//6_27
		//driver.get("https://pl-pl.facebook.com/");
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Akceptuj wszystkie"))).click();
		


	
		
            }
		
}
 
 