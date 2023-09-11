package cs

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.MobileTestObject
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement



public class getElement {

	@Keyword

	public static boolean waitForElementVisible(TestObject object,int timeInSec) {



		AppiumDriver mobileDriver = MobileDriverFactory.getDriver()

		MobileTestObject mobileObject = findTestObject(object.getObjectId())

		System.out.println(mobileObject)

		String xpath = mobileObject.getMobileLocator()

		System.out.println(xpath)

		MobileElement elementU=MobileElementCommonHelper.findElement(object, timeInSec)

		System.out.println(elementU)

		WebDriverWait wait = new WebDriverWait(mobileDriver, timeInSec);

		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
		}

		catch(Exception e) {

			println(e)
		}
	}
}
