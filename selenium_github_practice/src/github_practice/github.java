package github_practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class github {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com");
		Thread.sleep(3000);

	}

}
