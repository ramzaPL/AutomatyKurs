import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {

		// 8_zadanie2
		String from = "random";
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com");

		// send "From" direction
		driver.findElement(By.cssSelector("input[class*='field bw-1 bs-solid w-100p']")).sendKeys(from);

		// click on callendar
		driver.findElement(By.cssSelector("div[class*='flex flex-middle p-relative homeCalender']")).click();

		// Select a current date
		driver.findElement(By.cssSelector("div[aria-selected='true']")).click();

		// Use a select class to chose a number of adult person
		Select adult = new Select(driver.findElement(By.xpath("select[@class='bc-neutral-100 bg-transparent']")));
		adult.selectByVisibleText("4");

		// Click to "More options: Class of travel, Airline preference"
		driver.findElement(By.xpath("a[@class='td-none hover:td-underline px-4 mt-1 weak']")).click();

		// Send airline name
		driver.findElement(By.xpath("input[@placeholder='Airline name']")).sendKeys("Ryanair");

		// Search flight click
		driver.findElement(By.cssSelector("button[class*='px-7 bg-primary-500 hover:bg-primary-600']")).click();

		// Error message
		System.out.println(driver.findElement(By.xpath("span[contains(@class, 'to-ellipsis o-hidden')]")).getText());

		// It probably have some bugs but i try too many times to refresh page and
		// effect was
		// www.cleartrip.com | Access denied (403)
		// Current session has been terminated.
	}

}
