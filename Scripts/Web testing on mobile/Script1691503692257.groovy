import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.appium.java_client.android.AndroidDriver



 //define your credentials 
DesiredCapabilities caps = new DesiredCapabilities();
String username = System.getenv("thanhnguyen_7ohCYW");
String authkey = System.getenv("M8XsXTcihWMV52ixCpGT");
String hub = "@hub-cloud.browserstack.com/wd/hub";

// set device config
caps.setCapability("os_Version", "16");
caps.setCapability("deviceName", "iPhone 14");
caps.setCapability("platformName", "iOS");
caps.setCapability("real_mobile", "true");
caps.setCapability("browserstack.idleTimeout", "50");

//caps.setCapability(ChromeOptions.CAPABILITY, options);


// trigger the remote server


System.out.println("Desired Caps: " + caps);

//RemoteWebDriver driver = new RemoteWebDriver(new URL("http://thanhnguyen_7ohCYW:M8XsXTcihWMV52ixCpGT@hub-cloud.browserstack.com/wd/hub") ,caps);

AndroidDriver driver = new AndroidDriver(new URL("http://thanhnguyen_7ohCYW:M8XsXTcihWMV52ixCpGT@hub-cloud.browserstack.com/wd/hub") ,caps);

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl("https://katalon-demo-cura.herokuapp.com/")

WebUI.click(findTestObject('Object Repository/Web Browser/btn_MakeAppointment'));

WebUI.setText(findTestObject('Object Repository/Web Browser/txt_Username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/Web Browser/txt_Password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/Web Browser/btn_Login'));

