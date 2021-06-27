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
		
		//Wyœwietli aktualny url, wzrokowo pozwala go zweryfikowaæ i pozwala zapobiec niechcianym przekierowaniom
		//System.out.println(driver.getCurrentUrl());
		
		//wyœwietla zrod³o strony w przypadku kiedy tego ód³a nie da siê podejrzeæ w przegl¹darce
		//System.out.println(driver.getPageSource());

		//driver.get("https://www.wp.pl/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close(); //zamyka bierz¹ce okno
		//driver.quit(); //zamyka ca³¹ przegl¹darkê
		
		//6_27
		//driver.get("https://pl-pl.facebook.com/");
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Akceptuj wszystkie"))).click();
		


	
		
            }
		
}
 
 