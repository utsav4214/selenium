import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class crossBrowser {
	
	
	String geckodr = "webdriver.gecko.driver";
	String geckodrpath= "H:\\\\Selenium\\\\geckodriver-v0.24.0-win64\\\\geckodriver.exe";
	String chromedr = "webdriver.chrome.driver";
	String chromedrpath = "H:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe";
	String edgedr = "webdriver.edge.driver";
	String edgedrpath = "H:\\\\Selenium\\\\MicrosoftWebDriver.exe";
	

	public static void main(String[] args) {
		
		mozilla t1 = new mozilla();
		t1.start();
		chrome t2 = new chrome();
		t2.start();
		edge t3 = new edge();
		t3.start();
		

	}
	
	public void method(String browser) throws InterruptedException {
		
	
	
		if (browser=="mozilla") {
		gecko();
		}
	
		else if (browser=="chrome") {
		chrome();
		}
	
		else if (browser=="edge") {
		edge();
		}
		
	}
	
	public void gecko() throws InterruptedException {
	
		System.setProperty(geckodr,geckodrpath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("date");;
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		Thread.sleep(5000);
		driver.close();
		System.out.println("Close the firefox browser");
	}

	public void chrome() throws InterruptedException {
		
		System.setProperty(chromedr,chromedrpath);
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("date");;
		driver1.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		Thread.sleep(5000);
		driver1.close();
		System.out.println("Close the chrome browser");
		
	}

	public void edge() throws InterruptedException {
		
		System.setProperty(edgedr,edgedrpath);
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.google.com/");
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("date");
		driver2.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		Thread.sleep(5000);
		driver2.close();
		System.out.println("Close the edge browser");
	}

	

}
