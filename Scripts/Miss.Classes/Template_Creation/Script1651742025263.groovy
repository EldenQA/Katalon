import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.swing.ListSelectionModel as ListSelectionModel
import javax.swing.text.html.CSS as CSS
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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.DriverCommand as DriverCommand
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mobile-recruit.com/')

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Manage Templates'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Create New Template'))

FileWriter fw = new FileWriter('console.properties')
Properties pro = new Properties()
pro.setProperty('Template', 'Software_Testing_' + RandomStringUtils.randomAlphabetic(4))
pro.store(fw, 'comments')
FileInputStream fis = new FileInputStream('console.properties')
Input = pro.getProperty('Template')

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input__templateName'), 
    Input)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li__multiselect-search-list-item multiselec_b05554'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li_Management of Companies and Enterprises'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li_Job Family_multiselect-search-list-item _bf01f7'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li_Telecommunications'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/i_Add page_fa fa-plus icon-grey'))

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Enter Page Name_form-control ng-prist_3b5161'), 
    'Capture')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/img'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Save'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/div_Template has been saved successfully'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/div_Template has been saved successfully'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Manage Templates'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fa fa-share-alt fa-lg color-g_72fb5f'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/div_Template has been published successfully'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))


