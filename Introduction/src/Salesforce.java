import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create Driver object
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://login.salesforce.com/?locale=eu");
		//driver.findElement(By.id("sum1")).sendKeys(losowaJeden);
		//driver.findElement(By.id("username")).sendKeys("heloo");
		driver.findElement(By.cssSelector("#username")).sendKeys("helo");
		//driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234");
		//driver.findElement(By.className("button r4 wide primary")).click(); // b³¹d, nazwa klasy nie moze zawieraæ spacji
		driver.findElement(By.name("Login")).click();
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();;// //*[@id="Login"] - wewn¹trz xpath zmianiamy " na '
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		//6_35
		//CSS selector
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.print("Done");
		

	
		
            }
		
}
 
 