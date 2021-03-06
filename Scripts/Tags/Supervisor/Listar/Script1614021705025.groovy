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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.production)

CustomKeywords.'login.User.Login'(findTestData('null').getValue(1, 2), findTestData('null').getValue(2, 2))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('null'))

WebUI.delay(1)

WebUI.click(findTestObject('null'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('null'))

WebUI.verifyElementClickable(findTestObject('null'))

def no_item = WebUI.getText(findTestObject('null'))

if (no_item) {
    println('Não há itens disponíveis')
} else {
    WebUI.verifyElementVisible(findTestObject('null'))
	println ("Há itens disponíveis")
}
