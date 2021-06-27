import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class checkboxes {

	public static void main(String[] args) {

		//8 zadanie 1
				String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", Path);
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				
				driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
				System.out.println("Is is checkd :"+driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
				driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
				System.out.println("It is unchekd (false) :"+driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
				
				System.out.println("Number of chceckboxes :"+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				

	}

}
