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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.apache.commons.lang3.RandomUtils as RandomUtils
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Actions ac = new Actions(driver)

WebUI.setText(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/span_Mobile Talent Pool'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input_Clear_checkall'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/i_All Candidates_fa fa-comments'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input_Schedule SMS_mail-checkbox ng-pristin_aaf328'))
text = 'This is bulk schedule message ' + RandomStringUtils.randomAlphabetic(6)
WebUI.setText(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/textarea__form-control custom-control ng-pr_8b4879'), 
    text)

Date date = new Date()

SimpleDateFormat df = new SimpleDateFormat('MM/dd/yyyy')

currentDate = df.format(date)

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input__form-control ng-pristine ng-untouche_5e30cd'))

WebUI.setText(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input__form-control ng-pristine ng-untouche_5e30cd'), 
    currentDate)

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/span_24'))
WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input__startTime'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/span_02'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/i_PM_glyphicon glyphicon-chevron-down_1'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/i_PM_glyphicon glyphicon-chevron-down_1'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/span_11'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/div_Recipients   Sending SMS to selected Us_4ca291'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/button_Schedule'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/button_Confirm'))

WebUI.click(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/div_2Bulk SMS request has been posted successfully'))

WebUI.click(findTestObject('MTP Locators/MobileTalentPoolLocatorOnDashboardBar'))

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), GlobalVariable.candidateName)

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

WebUI.scrollToElement(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/span_SMS'), 2)

WebUI.click(findTestObject('Object Repository/Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/span_SMS'))

WebUI.scrollToElement(findTestObject('MTP Locators/smsScheduledBoxOnSMSTab'), 2)

WebElement element = driver.findElement(By.cssSelector(".table.table-striped > tbody > tr:nth-of-type(1) > td:nth-of-type(2)"))
textOfMessage=element.getText()
	if(textOfMessage.equalsIgnoreCase(text))
	{
		WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
		WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
		WebUI.closeBrowser()
	}
