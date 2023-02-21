import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
	
	 public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Study\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.youtube.com/watch?v=unQlCp-lL6I");
		 System.out.println(driver.getTitle()); 
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 
		
	}

}
