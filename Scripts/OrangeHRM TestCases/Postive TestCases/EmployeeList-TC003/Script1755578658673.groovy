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

WebUI.click(findTestObject('OrangeHRM Objects/pim-main-menu-item'))

WebUI.verifyElementText(findTestObject('OrangeHRM Objects/topbar-header-title-PIM'), 'PIM')

WebUI.click(findTestObject('OrangeHRM Objects/employee-name-imput'))

WebUI.setText(findTestObject('OrangeHRM Objects/employee-name-imput'), 'John  Smith')

WebUI.click(findTestObject('OrangeHRM Objects/select-jobtitle-dropdown'))

WebUI.click(findTestObject('OrangeHRM Objects/Job Title-input'))

WebUI.click(findTestObject('OrangeHRM Objects/Searchbutton'))

WebUI.waitForPageLoad(20)

WebUI.scrollToElement(findTestObject('OrangeHRM Objects/employeeList-RowVerify'), 10)

WebUI.verifyElementVisible(findTestObject('OrangeHRM Objects/employeeList-RowVerify'))

WebUI.waitForPageLoad(20)

