import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.MobileElement

//open Website 
//WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/")


// set Desired capabilities for Web remote on Lambda
DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability("browserName", "Chrome");
caps.setCapability("browserversion", "114");
caps.setCapability("platformName", "MacOS Catalina");
caps.setCapability("build", "Headless Automation");
caps.setCapability("name", "Headless Automation");
caps.setCapability("network", true);
caps.setCapability("visual", true);
caps.setCapability("video", true);
caps.setCapability("console", true);

//trigger the remote web browser

System.out.println("Desired Caps: " + caps);
driver = new RemoteWebDriver(new URL("http://an.le:uDPicLwK5rsSyjqLYBxz0rEtfcIvSylzytA6d6vaEC7NfGkg25@hub.lambdatest.com/wd/hub") ,caps);
driver.get("https://katalon-demo-cura.herokuapp.com/");

// Input your username and password on LambdaTest here
//DesiredCapabilities caps = new DesiredCapabilities();
String username = System.getenv("an.le");
String authkey = System.getenv("uDPicLwK5rsSyjqLYBxz0rEtfcIvSylzytA6d6vaEC7NfGkg25");
String hub = "@hub.lambdatest.com/wd/hub";


// Set Desired Capabilities for Android device
caps.setCapability("platformName", "android");
caps.setCapability("deviceName", "Pixel 7");
caps.setCapability("platformVersion", "13");
caps.setCapability("isRealMobile", true);
caps.setCapability("app","lt://APP10160631101690262197254877");

//trigger the .apk in Android LambdaTest
System.out.println("Desired Caps: " + caps);
driver01 = new RemoteWebDriver(new URL("http://an.le:uDPicLwK5rsSyjqLYBxz0rEtfcIvSylzytA6d6vaEC7NfGkg25@mobile-hub.lambdatest.com/wd/hub") ,caps);

//find the button Test Touch on Mobile
WebElement two = driver01.findElement(By.id("com.perfectomobile.test:id/TestTouch"))

two.click();

//click on button Make Appointment on Web
//WebUI.click(findTestObject("Object Repository/Web Browser/btn_MakeAppointment"))

WebElement one = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"))
one.click()

////find the button CountUp on Mobile
WebElement third = driver01.findElement(By.id("com.perfectomobile.test:id/CountUp"))

third.click();

