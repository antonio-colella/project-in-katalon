package login

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

public class User {
	/**
	 * Login controlle
	 * @param user email for login
	 * @param user password for login
	 */
	@Keyword
	def Login(String username, String password) {
		WebUI.verifyElementVisible(findTestObject('Login/h1 Acesse sua conta'), FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Login/label Email'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Login/input Email'), username)
		WebUI.verifyElementVisible(findTestObject('Login/label Senha'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Login/input Senha'), password)
		WebUI.click(findTestObject('Login/button Entrar'))
	}

	/**
	 * Logout controlle
	 */
	@Keyword
	def Logout() {
		WebUI.closeBrowser()
	}
}
