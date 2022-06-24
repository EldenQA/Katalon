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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mobile-recruit.com/login')

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'atsharma@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/MTP Locators/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'p4y+y39Ir5OTdtOb306gDg==')

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

for (int i=0 ; i<=100; i++)
{
	WebUI.click(findTestObject('MTP Locators/Notification'))
	
	WebUI.click(findTestObject('MTP Locators/notificationText'))
}
