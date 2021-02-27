package com.ubs.docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest{
	
	public static void main(String[] args) throws MalformedURLException {
		/*
		 * URL url =new URL("http://localhost:4444/wd/hub"); DesiredCapabilities dc
		 * =DesiredCapabilities.chrome(); RemoteWebDriver driver= new
		 * RemoteWebDriver(url, dc);
		 * driver.get("https://phoenixnap.com/kb/docker-run-command-with-examples");
		 * System.out.println("Title of webpage is :- "+ driver.getTitle());
		 * driver.quit();
		 */
		
		URL url =new URL("http://localhost:4443/wd/hub");
		DesiredCapabilities dc =DesiredCapabilities.firefox();
		RemoteWebDriver driver= new RemoteWebDriver(url, dc);
		driver.get("https://phoenixnap.com/kb/docker-run-command-with-examples");
		System.out.println("Title of webpage is :- "+ driver.getTitle());
		driver.quit();
	
	}
    
}
