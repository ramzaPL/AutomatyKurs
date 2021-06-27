import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Przemo");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("cokolwiek");

		//driver.findElement(By.cssSelector("#Login")).click(); // id="Login"
		//driver.findElement(By.cssSelector(".button.r4.wide.primary")).click(); // class="button r4 wide primary"

	}

}
