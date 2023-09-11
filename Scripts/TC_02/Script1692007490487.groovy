import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile


Mobile.setText(findTestObject('Object Repository/CONTACTMANAGER/android.widget.EditText (1)'), 'abc', 0)

Mobile.setText(findTestObject('Object Repository/CONTACTMANAGER/android.widget.EditText (4)'), '012345', 0)

Mobile.setText(findTestObject('Object Repository/CONTACTMANAGER/android.widget.EditText (5)'), 'a@katalon.com', 0)
