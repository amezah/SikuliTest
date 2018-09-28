package com.accenture.sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.basics.Debug;
import org.sikuli.basics.Settings;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		Screen screen = new Screen();
		
		Pattern iniciarSesion = new Pattern("src/main/resources/captures/gmail/iniciarsesion.jpg");
		Pattern userField = new Pattern("src/main/resources/captures/gmail/userfield.jpg");
		Pattern passField = new Pattern("src/main/resources/captures/gmail/passfield.jpg");
		Pattern siguiente = new Pattern("src/main/resources/captures/gmail/siguiente.jpg");
		Pattern gmail = new Pattern("src/main/resources/captures/gmail/gmail.jpg");
		Pattern compose = new Pattern("src/main/resources/captures/gmail/compose.jpg");
		
		
		try {
			
			System.out.println("Inicar sesion");
			screen.wait(iniciarSesion, 2000);
			Region r = new Region(screen.getBounds());
			System.out.println("Text: "+r.find(iniciarSesion).text());
			screen.click();
			
//			System.out.println("ingresar user");
//			screen.wait(userField, 2000);
//			screen.type(userField,"Mezaherazo");
//						
//			System.out.println("click siguiente 1");
//			screen.wait(siguiente, 1000);			
//			screen.click();
//			
//			System.out.println("ingresar pass");
//			screen.wait(passField, 2000);
//			screen.type(passField,"masterkool");	
//			
//			
//			System.out.println("click siguiente 2");
//			screen.wait(siguiente, 1000);	
//			screen.click();
//			
//			System.out.println("entrar gmail");
//			screen.wait(gmail, 1000);		
//			
//			screen.click();
			
			
			//driver.close();
			System.out.println("trin");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
