import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.nio.sctp.SendFailedNotification;

public class rediff {

	public static void main(String[] args) {
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); // wyra�enie nieregularne
		driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("login1234"); // wyra�enie nieregularne
		driver.findElement(By.xpath("//body/div/div/div/div/form/div/div/div/div/input[1][@id='login1']")).sendKeys("4321nigol"); //to samo co wy�ej tylko r�cznie zapisny krok po kroku xpath
		
		
		 driver.findElement(By.xpath("//input[contains(@name, 'passwd')]")).sendKeys("testtest"); // wyra�enie nieregularne
		 driver.findElement(By.cssSelector("input[name*='proc']")).click();
		 driver.findElement(By.xpath("//input[@type='password']/following-sibling::input[1]")).click();  // to co wy�ej tylko xpath i uzycie rodze�stwa
		 //driver.findElement(By.xpath("//div[@class='cell logo']/a")).click(); //xpatch po rodzicach/tagach [dzia�a w kosoli przegl�darki]
		 //driver.findElement(By.xpath("//*[text()='Forgot Password?']")).click(); // xpath po samym tek�cie (sapcje maj� znaczenie) [dzia�a w kosoli przegl�darki]
		 //driver.findElement(By.xpath("//div[@class='div_container']/div[2]/a/span[2]")).click(); //xpatch po rodzicach [dzia�a w kosoli przegl�darki, tutaj nie]
		
		
	}

}
