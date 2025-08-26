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

WebUI.waitForElementVisible(findTestObject('Object Repository/OrangeHRM Objects/Recruitment-Btn'), 8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrangeHRM Objects/Recruitment-Btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM Objects/Recruitment-heading-verify'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrangeHRM Objects/Recruitment-Vacancies-Tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('OrangeHRM Objects/Recruitment-VacanciesTab-headingVerify'), 'Vacancies')

WebUI.click(findTestObject('OrangeHRM Objects/Recruitment-VacanciesJob Title-Dropdown'))

WebUI.click(findTestObject('OrangeHRM Objects/Recruitment-VacanciesTab-Job Title-text-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrangeHRM Objects/RecruitmentVacancyTab-VacancydropDown'))

WebUI.click(findTestObject('OrangeHRM Objects/RecruitmentVacancyTab-Vacancy-input'))

WebUI.click(findTestObject('OrangeHRM Objects/Recruitment-VacanciesTab-SearchBtn'))

