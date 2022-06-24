import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import javax.swing.ListSelectionModel as ListSelectionModel
import javax.swing.text.html.CSS as CSS
import javax.swing.text.html.FormView as FormView
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
import org.openqa.selenium.remote.DriverCommand as DriverCommand
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('MTP Locators/MobileTalentPoolLocatorOnDashboardBar'))

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 
    1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), 'Elden QA')

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/EmailTabLocator'), 1)

WebUI.click(findTestObject('MTP Locators/EmailTabLocator'))

//*This will calculate the number of mails on current page beforeSending
List<WebElement> allEmailSent = driver.findElements(By.cssSelector('div[class="th-head"]'))

int size = allEmailSent.size()

int expectedSize = size + 1

System.out.println(size)
//*
WebUI.click(findTestObject('MTP Locators/ComposeEmailLocator'))

WebUI.click(findTestObject('MTP Locators/subjectOfEmailLocator'))

WebUI.sendKeys(findTestObject('MTP Locators/subjectOfEmailLocator'), 'This email is from Recruiter')

Actions ac = new Actions(driver)

ac.sendKeys(Keys.PAGE_DOWN).perform()

WebUI.sendKeys(findTestObject('MTP Locators/emailBodyLocator'), 'this is the email body ')

Thread.sleep(1000)

WebUI.click(findTestObject('MTP Locators/uploadButtonOnComposeEmailLocator'), 
    FailureHandling.STOP_ON_FAILURE)
//This would upload the png file 
File f = new File('download.png')

String logoPath = f.getAbsolutePath()

//This Robot class is for handling the keys 
Robot rb = new Robot()

StringSelection ss = new StringSelection(logoPath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

rb.keyPress(KeyEvent.VK_CANCEL)

rb.keyRelease(KeyEvent.VK_CANCEL)

Thread.sleep(1000)

rb.keyPress(KeyEvent.VK_CONTROL)

rb.keyPress(KeyEvent.VK_V)

rb.keyRelease(KeyEvent.VK_CONTROL)

rb.keyRelease(KeyEvent.VK_V)

rb.keyPress(KeyEvent.VK_ENTER)

rb.keyRelease(KeyEvent.VK_ENTER)

ac.sendKeys(Keys.PAGE_DOWN).perform()

List<WebElement> allButtonsOnEmailPopup = driver.findElements(By.cssSelector('div[class=\'modal-footer\'] button'))

int a = allButtonsOnEmailPopup.size()

for (int b = 0; b < a; b++) {
    allButtonText = allButtonsOnEmailPopup.get(b).getText()

    System.out.println(allButtonText)

    if (allButtonText.equalsIgnoreCase('Send Email')) {
        Thread.sleep(1000)

        allButtonsOnEmailPopup.get(b).click()

        break
    }
}

List<WebElement> allEmailSentAfter = driver.findElements(By.cssSelector('div[class="th-head"]'))

int sizeAfterSendingTheEmail = allEmailSentAfter.size()
System.out.println(sizeAfterSendingTheEmail)
if (sizeAfterSendingTheEmail == expectedSize) 
	
	{
	System.out.println('Email Sent Successfully')
}
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))
WebUI.closeBrowser()
