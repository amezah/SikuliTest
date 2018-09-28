package com.accenture.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webDriver.ie.driver", "IEDriverServer.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//		WebDriver driver = new InternetExplorerDriver(capabilities);
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.microsoft.com/silverlight/iis-smooth-streaming/demo/");
		driver.manage().window().maximize();
		
		
		Screen screen = new Screen();
		
		Pattern ondemand = new Pattern("src/main/resources/captures/youtube/ondemand.jpg");
		Pattern home = new Pattern("src/main/resources/captures/youtube/home.jpg");
//		Pattern quality = new Pattern("src/main/resources/captures/ytquality.jpg");
//		Pattern button360p = new Pattern("src/main/resources/captures/yt360p.jpg");
//		Pattern play = new Pattern("src/main/resources/captures/ytplay.jpg");
		try {
			screen.wait(ondemand, 1000);
			screen.click();
			screen.wait(home, 2000);
			screen.click();
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("trin");
	}
}
