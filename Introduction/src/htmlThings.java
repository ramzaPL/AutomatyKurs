import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class htmlThings {

	public static void main(String[] args) throws InterruptedException {
		
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//8_48
		//namiary na listê rowzijaln¹
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown); // dzia³a tylko na listach które maj¹ tag Select
		//Select dropdownn = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))); // drugi sposób
		dropdown.selectByIndex(3); //wbiera z listy po numerze indeksu
		System.out.println(dropdown.getFirstSelectedOption().getText()); // wyrzuci³o nazwê aktulanie wybranej pozycji z listy
		dropdown.selectByVisibleText("AED");;
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR"); // wybiera z listy po atrybucie Value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//8_49
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(2000); // na co dzieñ tego nie u¿ywaæ / bez nie dzia³a reszta
		int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div/div/div/span[3][@id='hrefIncAdt']")).click();
			i++;
		}
		for (i=1; i<5; i++)
		{
			driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div/div/div/span[3][@id='hrefIncAdt']")).click();
		}
		driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
		
		//8_51
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//option[@value='AMD']")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
		//driver.findElement(By.xpath("(//option[@value='BLR'])[2]")).click(); // wybór drugiego taga, obydwie listy maj¹ takie same i domyœlnie wybrany zosta³by z pierwszej
		
		//8_52
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='BLR']")).click(); // to co wy¿ej tylko xpatch od rodzica do dziecka
		
		//8_54
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options =   driver.findElements(By.cssSelector("li[role='presentation']")); // elements - liczba mnoga, elementy listy zapisane w List<WebElement>
		
		
		for (WebElement option : options)
		{
			//System.out.println(option.getText()); //wyœwietla zawartoœæ listy
			if (option.getText().equals("India"))
			{
				System.out.println("Wybrane zosta³o: " + option.getText());
				option.click();
				break;  //dla optymalizacji ¿eby pêtla nie lecia³a dalej jak znajdzie to co trzeba
			}
		}
		
		//8_56 chechbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // scc po wyra¿eniu regularnym
		System.out.println("Czy checkbox jest zaznaczony: "+driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //true je¿eli zaznaczony
		System.out.println("Iloœæ chceckboxow: "+driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //liczba mnoga /zwraca iloœæ szukanych elementów [wielkoœæ listy]
		
		
		
	}

}
