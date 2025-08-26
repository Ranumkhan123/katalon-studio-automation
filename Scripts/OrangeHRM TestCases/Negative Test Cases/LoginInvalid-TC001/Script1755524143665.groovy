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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('OrangeHRM Objects/input_Username_username'))

WebUI.setText(findTestObject('OrangeHRM Objects/input_Username_username'), GlobalVariable.userName)

WebUI.click(findTestObject('OrangeHRM Objects/input_Password_password'))

WebUI.setText(findTestObject('OrangeHRM Objects/input_Password_password'), 'admin')

WebUI.click(findTestObject('OrangeHRM Objects/button_Password_oxd-button oxd-button--medi_8860b7'))

WebUI.waitForPageLoad(15)

WebUI.verifyElementText(findTestObject('OrangeHRM Objects/InvalidLoginMessage'), 'Invalid credentials')

WebUI.closeBrowser()

