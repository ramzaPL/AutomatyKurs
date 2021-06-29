package Lekcja9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9_68
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = {"Cucumber", "Brocolli"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//pojedynczy element
		//WebElement product = driver.findElement(By.cssSelector("h4.product-name"));
		//lista elementów / znajdz elementY
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0; i<products.size(); i++)
		{
			//zwraca pozycjê w liœcie / tak jak w tablicy - a nastêpnie wyci¹ga z niej tekst
			String name = products.get(i).getText();
			
			//8_69
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			//wersja pierwsza 8_68
			//if (name.contains("Cucumber"))
			if (itemsNeededList.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//wersja pierwsza 8_68
				//break;
			}
		}
		

	}

}
