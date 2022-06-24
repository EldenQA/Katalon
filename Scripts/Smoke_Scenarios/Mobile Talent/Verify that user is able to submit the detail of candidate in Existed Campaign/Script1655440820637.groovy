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
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

Actions ac = new Actions(driver)

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()

Thread.sleep(2000)

driver.findElement(By.cssSelector('span[data-title=\'Search\']')).click()

WebElement element2 = driver.findElement(By.xpath('//*[@id=\'jobTitle\']'))

element2.sendKeys(GlobalVariable.JobName)

for (int i = 0; i <= 2; i++) {
    ac.sendKeys(Keys.PAGE_DOWN).perform()
}

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/i_Search_fa fa-search'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/div_Software_Testing_geuT'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Mobile Talent  Mobile Recruitment/micrositeLinkLocator'))

WebUI.switchToWindowIndex(1)

ac.sendKeys(Keys.PAGE_DOWN).perform()

driver.findElement(By.cssSelector('a[class=\'carrot-flat-button ng-scope\']')).click()

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_First Name_id5236'), 
    'Dinesh')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Last Name_id5237'), 
    'Yadav')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/input_Email_id5238'), 
    ('d' + RandomStringUtils.randomAlphabetic(4)) + '@yopmail.com')

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/div_Mobile Number_iti-flag mx'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/span_India ()'))

driver.findElement(By.cssSelector('input[question=\'Mobile Number\']')).sendKeys('1325' + RandomStringUtils.randomNumeric(
        6))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/label_Do you have any degree , Choose one'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/select_OptionYESNO'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/select_OptionsBtechMCA'), 
    'Yes', true)

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/resumeUpload'))

Thread.sleep(2000)

File f = new File('Sample File For Resume.pdf')

String logoPath = f.getAbsolutePath()

//This Robot class is for handling the keys
Robot rb = new Robot()

StringSelection ss = new StringSelection(logoPath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

Thread.sleep(1000)

rb.keyPress(KeyEvent.VK_CONTROL)

rb.keyPress(KeyEvent.VK_V)

rb.keyRelease(KeyEvent.VK_CONTROL)

rb.keyRelease(KeyEvent.VK_V)

rb.keyPress(KeyEvent.VK_ENTER)

rb.keyRelease(KeyEvent.VK_ENTER)

//WebUI.uploadFile(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/resumeUpload'), 
//    'D:\\\\Final_Elden_Auto\\\\Sample File For Resume.pdf')

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/termsAndConditions'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/button_Connect Now'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Software_Testing_geuT_micrositeCapture/p_Thank you for completing this form We loo_f59a68'))

WebUI.verifyElementText(findTestObject('Registration/Page_Software_Testing_geuT_micrositeCapture/thankyouPopupContinueButton'), 
    'Continue')

WebUI.closeBrowser()

