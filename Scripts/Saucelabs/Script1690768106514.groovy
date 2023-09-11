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

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver;

//DesiredCapabilities options = new DesiredCapabilities();
//ChromeOptions options = new ChromeOptions();
//options.setCapability("platformName", "Windows 11");
//options.setCapability("browserVersion", "latest");
//options.setCapability("tunnelName", "katalon-service_tunnel_name");
//options.setCapability("w3c", "false");
//options.setCapability("browserName", "Chrome");
//
//Map<String, Object> sauceOptions = new HashMap<>();
//sauceOptions.put("username", System.getenv("katalon-service"));
//sauceOptions.put("accessKey", System.getenv("0fe52f8d-e050-4b5a-96b3-621784196fd3"));
//sauceOptions.put("name", "Chrome Job");
//
//options.setCapability("sauce:options", sauceOptions);
//URL url = new URL("https://katalon-service:0fe52f8d-e050-4b5a-96b3-621784196fd3@ondemand.us-west-1.saucelabs.com:443/wd/hub");
//
////driver = new RemoteWebDriver(new URL("https://katalon-service:0fe52f8d-e050-4b5a-96b3-621784196fd3@ondemand.us-west-1.saucelabs.com:443/wd/hub") , options);
//
//driver = new RemoteWebDriver(url, options);
//
//driver.navigate().to("https://raptor-ui.dev.aws.wiscoro.com/");

//driver.get("https://raptor-ui.dev.aws.wiscoro.com/");

WebUI.openBrowser('')

WebUI.navigateToUrl('raptor-ui.dev.aws.wiscoro.com')

