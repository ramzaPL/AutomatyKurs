import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class asercja {

	public static void main(String[] args) throws InterruptedException {
		
		String Path = "C:\\Users\\pratlinski\\Documents\\Repo\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //test przejdzie dalej poniewaz oczekuje false (assertFalse)
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//zatrzyma test bo oczekuje true (assertTrue) a dostaje false
		
		
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
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText(), "8 Adult"); //zatrzyma test bo oczekuje wartoœci 8 Adult a dostaje 9 Adult
		System.out.println(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
		
		
	}

}
