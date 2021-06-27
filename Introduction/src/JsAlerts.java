import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlerts {

	public static void main(String[] args) {

		//8_64
		String  text = "Przemo";
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		//po poni�szym znika mi box z informacj�
		driver.findElement(By.id("alertbtn")).click();
		//wyci�ga tekst z alertu
		System.out.println(driver.switchTo().alert().getText());
		//akceptuje alert
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//klika w alercie w anuluj/nie itd - zadziala tylko w alertach kt�re taki rpzycisk maj�
		driver.switchTo().alert().dismiss();
		
	}

}
