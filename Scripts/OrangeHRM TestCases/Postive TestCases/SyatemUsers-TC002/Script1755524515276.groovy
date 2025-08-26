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

WebUI.verifyElementVisible(findTestObject('OrangeHRM Objects/adminMainMeniitem'))

WebUI.click(findTestObject('OrangeHRM Objects/adminMainMeniitem'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('OrangeHRM Objects/input_Username_SystemUsers'))

WebUI.setText(findTestObject('OrangeHRM Objects/input_Username_SystemUsers'), 'Admin')

WebUI.click(findTestObject('OrangeHRM Objects/User-roledropdown'))

WebUI.click(findTestObject('OrangeHRM Objects/User Role_text-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrangeHRM Objects/SelectStatusdropdown'))

WebUI.click(findTestObject('OrangeHRM Objects/Status-text-input'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('OrangeHRM Objects/search-button'))

WebUI.scrollToElement(findTestObject('OrangeHRM Objects/recordVerifyRow'), 0)

WebUI.verifyElementVisible(findTestObject('OrangeHRM Objects/recordVerifyRow'))

WebUI.waitForPageLoad(15)

