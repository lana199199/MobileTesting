import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

Mobile.startApplication('/Users/thanh.pnguyen/apk/IT Glossary_1.5_Apkpure.apk', true)

//Mobile.tap(findTestObject('Object Repository/liamtest/android.widget.TextView - TermsDefinitions'), 0)

//Mobile.tap(findTestObject('Object Repository/liamtest/android.widget.TextView - Abort'), 0)

//Mobile.verifyElementExist(findTestObject('Object Repository/liamtest/android.widget.TextView - TermsDefinitions'), 3)

if (Mobile.verifyElementExist(findTestObject('Object Repository/liamtest/android.widget.TextView - TermsDefinitions'), 3, FailureHandling.CONTINUE_ON_FAILURE)) {
	
	println('found');
	
  } else {
	
	println('not found')
	  
	Mobile.pressBack();
  }

//Mobile.tap(findTestObject('Object Repository/liamtest/android.widget.TextView - Abort'), 0)
