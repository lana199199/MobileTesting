import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile


Mobile.startApplication('/Users/thanh.pnguyen/Documents/Katalon/Mobile testing/apk file/PMTest-v1.0.apk', false)

Mobile.startExistingApplication('com.google.android.documentsui')

Mobile.verifyElementText(findTestObject('Object Repository/download file - mobile/android.widget.TextView - pdf-test.pdf'), 
    'sample.pdf')

Mobile.tap(findTestObject('Object Repository/download file - mobile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/download file - mobile/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/download file - mobile/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/download file - mobile/android.widget.Button - OK'), 0)

