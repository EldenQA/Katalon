import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

WebUI.openBrowser('')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://motzie-staging.mobile-recruit.com/')

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_Administration'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_Manage Accounts'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/button_Create New Account'))

FileWriter fw = new FileWriter("console.properties");
Properties pro = new Properties()
pro.setProperty("Account Name" , 'Auto' + RandomStringUtils.randomAlphabetic(4))
pro.store(fw, "comments")
FileInputStream fis = new FileInputStream("console.properties");
Input = pro.getProperty("Account Name")

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__accountName'), 
    Input)
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__email'), 'katalon@yopmail.com')
WebUI.click(findTestObject('Account_Creation/Page_Bebo Talent  Mobile Recruitment/div__selected-flag'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_India ()'))
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input_United States_primaryPhoneNumber'), 
    '9623521252')
WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/select_--Select-- Advertising, Arts, Entert_612296'), 
    '0', true)
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__vm.accountDetailsForm.contactDTO.pri_503879'), 
    '73 Ray St, Pleasanton, CA 94566, United States')
WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/select_--Select-- GBARBRCACOMXPHPLUSIN'), 
    '9', true)
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__vm.accountDetailsForm.contactDTO.zip'), 
    '177107')
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__vm.accountDetailsForm.contactDTO.city'), 
'Pleasanton')
driver.findElement(By.cssSelector("div.btn.btn-primary.btn-file")).click()
Robot rb = new Robot()
rb.delay(2000)
StringSelection ss = new StringSelection("C:\\Users\\atsharma\\Pictures\\photos.jpg")
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)
rb.keyPress(KeyEvent.VK_CONTROL)
rb.keyPress(KeyEvent.VK_V)
rb.keyRelease(KeyEvent.VK_CONTROL)
rb.keyRelease(KeyEvent.VK_V)
rb.keyPress(KeyEvent.VK_ENTER)
rb.keyRelease(KeyEvent.VK_ENTER)
WebUI.selectOptionByValue(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/select_--Select-- PunjabAndaman And nicobar_78b03e'), 
    '13', true)
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__contactFirstName'), 
    'katalon_3')
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__contactLastName'), 
    'katalon')
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__contactEmail'), 
    'katalon@yopmail.com')
WebUI.scrollToElement(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/label_Use account address'), 
    5, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input_United States_contactPhoneNumber'), 
    '3152779908')
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/label_Use account address'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/ul__multiselect-search-list'))
WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/input__ng-pristine ng-untouched ng-valid ng_084d1e'), 
    'atish')
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/li_atish sharma'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/span_Add User'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next_1'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/h3_Thank You for the confirmation. Account _7daf0d'))
WebUI.click(findTestObject('Object Repository/Account_Creation/Page_Bebo Talent  Mobile Recruitment/h3_Thank You for the confirmation. Account _7daf0d'))

