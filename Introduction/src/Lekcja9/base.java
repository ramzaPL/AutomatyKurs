package Lekcja9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 9_68
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		int j = 0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);

		// pojedynczy element
		// WebElement product = driver.findElement(By.cssSelector("h4.product-name"));
		// lista elementów / znajdz elementY
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// zwraca pozycjê w liœcie / tak jak w tablicy - a nastêpnie wyci¹ga z niej
			// tekst /
			// 9_70
			// split - dzieli tekst, w tym typadku String, natomiast musi byæ tablic¹, jeden
			// String staje siê dwoma
			String[] name = products.get(i).getText().split("-");
			// trim - usuwa spacje
			String formatedName = name[0].trim();

			// 9_69
			List itemsNeededList = Arrays.asList(itemsNeeded);

			// wersja pierwsza 9_68
			// if (name.contains("Cucumber"))
			// druga wersja 9_69
			// if (itemsNeededList.contains(name))
			// trzecia wersja 9_70
			if (itemsNeededList.contains(formatedName)) {
				// wersja pierwsza
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				// 9_70
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// wersja pierwsza 9_68
				// break;
				// 9_70 - je¿eli znajdzie wszytkie 3 poszukiwane warzywa, niech wyjdzie z pêtli
				j++;
				// if (j == 3)
				// 9_70
				if (j == itemsNeeded.length)
					break;

			}
		}

	}

}
