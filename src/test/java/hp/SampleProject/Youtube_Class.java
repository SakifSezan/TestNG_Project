package hp.SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("noya daman" + Keys.ENTER);

	}

}
