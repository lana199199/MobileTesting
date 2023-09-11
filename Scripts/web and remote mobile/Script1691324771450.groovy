import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI





//open Website 
WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/")


// set Desired capabilities for Web remote on Lambda
//DesiredCapabilities caps = new DesiredCapabilities();
//caps.setCapability("browserName", "Chrome");
//caps.setCapability("browserversion", "114");
//caps.setCapability("platformName", "MacOS Catalina");
//caps.setCapability("build", "Headless Automation");
//caps.setCapability("name", "Headless Automation");
//caps.setCapability("network", true);
//caps.setCapability("visual", true);
//caps.setCapability("video", true);
//caps.setCapability("console", true);

// Input your username and password on LambdaTest here
DesiredCapabilities caps = new DesiredCapabilities();
String username = System.getenv("an.le");
String authkey = System.getenv("uDPicLwK5rsSyjqLYBxz0rEtfcIvSylzytA6d6vaEC7NfGkg25");
String hub = "@hub.lambdatest.com/wd/hub";

//trigger the remote web browser 

//System.out.println("Desired Caps: " + caps);
//driver = new RemoteWebDriver(new URL("http://an.le:uDPicLwK5rsSyjqLYBxz0rEtfcIvSylzytA6d6vaEC7NfGkg25@hub.lambdatest.com/wd/hub") ,caps);
//driver.get("https://katalon-demo-cura.herokuapp.com/");

// Set Desired Capabilities for Android device
caps.setCapability("platformName", "android");
caps.setCapability("deviceName", "Pixel 7");
caps.setCapability("platformVersion", "13");
caps.setCapability("isRealMobile", true);
//caps.setCapability("app","lt://APP10160631101690262197254877");

//trigger the .apk in Android LambdaTest
System.out.println("Desired Caps: " + caps);
RemoteWebDriver driver01 = new RemoteWebDriver(new URL("http://an.le:uDPicLwK5rsSyjqLYBxz0rEtfcIvSylzytA6d6vaEC7NfGkg25@mobile-hub.lambdatest.com/wd/hub") ,caps);

DriverFactory.changeWebDriver(driver01)

Mobile.startApplication('lt://APP10160631101690262197254877', false)

//find the button Test Touch on Mobile
//WebElement two = driver01.findElement(By.id("com.perfectomobile.test:id/TestTouch"))
//
//two.click();
//
////click on button Make Appointment on Web
//WebUI.click(findTestObject("Object Repository/Web Browser/btn_MakeAppointment"))
//
////WebElement one = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"))
////
////one.click()
//
//////find the button CountUp on Mobile
//WebElement third = driver01.findElement(By.id("com.perfectomobile.test:id/CountUp"))
//
//third.click();

