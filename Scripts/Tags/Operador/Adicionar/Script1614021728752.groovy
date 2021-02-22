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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable

//WebUI.mouseOver(findTestObject('Header/button Configuracoes'))

//WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Header/link Tags'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Tags/title Tags'), GlobalVariable.minTimeout)
//WebUI.verifyElementVisible(findTestObject('Object Repository/Tags/title Tags'))

for (def item : name) {
 	WebUI.click(findTestObject('Object Repository/Tags/button Adicionar'))
	WebUI.waitForElementPresent(findTestObject('Object Repository/Tags/input Nome'), GlobalVariable.minTimeout)
	WebUI.setText(findTestObject('Object Repository/Tags/input Nome'), item)	
	WebUI.click(findTestObject('Object Repository/Tags/button Salvar'))
	WebUI.delay(2)
}
