package permissions

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

public class Message {

	/**
	 * AlertPage
	 */
	@Keyword
	def AlertPage() {
		WebUI.verifyElementPresent(findTestObject('Permissions/new permissions/alert page'), 0)
		WebUI.click(findTestObject('Permissions/new permissions/button Ok Fechar mensagem'))
		println('Infelizmente você não tem permissão para acessar esse conteúdo')
	}

	def AlertDialog() {
		WebUI.verifyElementVisible(findTestObject('Permissions/new permissions/alert dialog'))
		WebUI.click(findTestObject('Permissions/new permissions/button Ok Fechar mensagem alert dialog'))
		println('Infelizmente você não tem permissão para acessar esse conteúdo')
	}

	def PermissionDenied() {
		WebUI.verifyElementVisible(findTestObject('Permissions/old permissions/title Opss voce nao possui permissao de acesso'))
		println ("Infelizmente você não possui permissão para acessar essa página.")
		WebUI.click(findTestObject('Permissions/old permissions/link Voltar'))
	}

	def BalanceDeniedAccount() {
		WebUI.verifyElementVisible(findTestObject('Permissions/span Mensagem sem permissao em saldos - account'))
		println ("Você não tem permissão para ver o saldo")
	}

	def BalanceDeniedCreditCard() {
		WebUI.verifyElementVisible(findTestObject('Permissions/span Mensagem sem permissao nos saldos - creditcard'))
		println ("Você não tem permissão para ver o saldo")
	}

	def BalanceDeniedTransaction() {
		String errormessage = WebUI.getText(findTestObject('Permissions/text Desculpe, voce nao tem permissao para ver o saldo'))
		WebUI.verifyEqual(errormessage, "Desculpe, você não tem permissão para ver o saldo")
	}

	def BlockMessage() {
		WebUI.verifyElementVisible(findTestObject('Permissions/block message/h1 Infelizmente voce nao tem permissao para acessar esse conteudo'))
		println("Infelizmente você não tem permissão para acessar esse conteúdo")
	}
}
