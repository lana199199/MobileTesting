import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject

Mobile.startExistingApplication('com.apple.mobilecal', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/pickerwheel/XCUIElementTypeButton - Add'), 0)

Mobile.tap(findTestObject('Object Repository/pickerwheel/XCUIElementTypeButton - 1200 PM'), 0)

//set to 9 hour
TestObject pickerWheel01 = new TestObject();
pickerWheel01.addProperty("xpath", ConditionType.EQUALS, "(//XCUIElementTypePickerWheel) [1]");
MobileBuiltInKeywords.sendKeys(pickerWheel01, "9");

//set to 20 minutes
Mobile.delay(4)
TestObject pickerWheel02 = new TestObject();
pickerWheel02.addProperty("xpath", ConditionType.EQUALS, "(//XCUIElement Type0ther) [2]");
MobileBuiltInKeywords.sendKeys(pickerWheel02, "20");

//set to AM 
Mobile.delay(4)
TestObject pickerWheel03 = new TestObject();
pickerWheel03.addProperty("xpath", ConditionType.EQUALS, "(//XCUIElementTypePickerWheel) [3]");
MobileBuiltInKeywords.sendKeys(pickerWheel03, "AM");




