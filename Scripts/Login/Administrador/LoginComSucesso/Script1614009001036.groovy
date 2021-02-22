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

WebUI.openBrowser(GlobalVariable.local)

def var = WebUI.waitForElementPresent(findTestObject('Object Repository/Login/input Email'), GlobalVariable.minTimeout)

if (var == true) {
	KeywordUtil.markPassed('Passou: Apresentou input Email')

	WebUI.setText(findTestObject('Object Repository/Login/input Email'), GlobalVariable.adminEmail)

	KeywordUtil.markPassed('Passou: Digitou: ' + GlobalVariable.adminEmail + 'no campo email')
} else {
	KeywordUtil.markWarning('Atenção: Não apresentou o campo email na tela')

	WebUI.closeBrowser()
}

WebUI.waitForElementPresent(findTestObject('Object Repository/Login/input Senha'), GlobalVariable.minTimeout)

WebUI.setText(findTestObject('Object Repository/Login/input Senha'), GlobalVariable.adminSenha)

WebUI.waitForElementPresent(findTestObject('Object Repository/Login/button Entrar'), GlobalVariable.minTimeout)

WebUI.click(findTestObject('Object Repository/Login/button Entrar'))
