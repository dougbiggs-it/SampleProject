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

WebUI.openBrowser('https://www.vocabularya-z.com')

WebUI.click(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/span_Member Login'))

WebUI.setText(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/input_Username_username'), 'DougVocabularyAZ')

WebUI.setText(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/input_Password_password'), 'A11Y')

WebUI.click(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/button_Log In'))

WebUI.verifyElementPresent(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/img_DougVocabularyAZ_logo'), 0)

WebUI.click(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/ng-transclude_Premade Lessons'))

WebUI.click(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/a_Vocabulary Books'))

WebUI.click(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/div_Air TravelVocabulary Nonfiction'))

if (true) {
    WebUI.click(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/btn_LearnMore'))
}

not_run: WebUI.click(findTestObject('VocabularyAZ_OR/Page_Vocabulary A-Z/btn_LearnMore'))

