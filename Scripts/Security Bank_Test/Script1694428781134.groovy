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

Mobile.startApplication('/Users/thanh.pnguyen/Downloads/app-st-release.apk', true)

Mobile.setText(findTestObject('Object Repository/Security Bank/android.widget.EditText - Access token'), 'ZfHmCb9CanyadOe65NA_B5r0erI', 3)

Mobile.takeScreenshot()

//Mobile.verifyElementText(findTestObject('Security Bank/android.widget.EditText - testing'), 'testing')

Mobile.setText(findTestObject('Object Repository/Security Bank/android.widget.EditText - Password'), 'Password123@', 3)

Mobile.tap(findTestObject('Object Repository/Security Bank/com.horcrux.svg.PathView'), 3)

Mobile.takeScreenshot()

//Mobile.verifyElementText(findTestObject('Security Bank/android.widget.EditText - 12345'), '12345')

