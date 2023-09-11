import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.apple.mobilecal', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/pickerwheel/XCUIElementTypeButton - Add'), 0)

Mobile.tap(findTestObject('pickerwheel/XCUIElementTypeButton - 1200 PM'), 0)

String a = '9'

GlobalVariable.hours = a

Mobile.sendKeys(findTestObject('pickerwheel/XCUIElementTypePickerWheel - 12 oclock - Copy', [('GlobalVariable.hours') : '']), 
    GlobalVariable.hours)

String b = '20'

GlobalVariable.minutes = b

Mobile.sendKeys(findTestObject('pickerwheel/XCUIElementTypePickerWheel - 00 minutes - Copy', [('GlobalVariable.minutes') : '']), 
    GlobalVariable.minutes)

