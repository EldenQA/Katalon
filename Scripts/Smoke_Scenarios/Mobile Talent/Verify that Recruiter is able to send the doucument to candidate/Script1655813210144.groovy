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
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.maximizeWindow()

Actions ac = new Actions(driver)

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('MTP Locators/MobileTalentPoolLocatorOnDashboardBar'))

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), GlobalVariable.hiredCandidate)

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/tabLocators'), 1)

List<WebElement> tabs = driver.findElements(By.cssSelector('a[data-toggle=\'tab\']'))

int countOfTabs = tabs.size()

for (int i = 0; i < countOfTabs; i++) {
    textOnTabs = tabs.get(i).getText()

    System.out.println(textOnTabs)

    if (textOnTabs.equalsIgnoreCase('On-Boarding')) {
        tabs.get(i).click()

        break
    }
}

WebUI.scrollToElement(findTestObject('MTP Locators/uploadDocumentLocator'), 1)

WebUI.click(findTestObject('MTP Locators/uploadDocumentLocator'))

WebUI.click(findTestObject('MTP Locators/documentNameLocator'))

WebUI.setText(findTestObject('MTP Locators/documentNameLocator'), 'Document' + RandomStringUtils.randomAlphabetic(5))

//driver.findElement(By.cssSelector("[type='file']")).click()
WebUI.click(findTestObject('Upload Document/fileUploadLocator'))

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

ac.sendKeys(Keys.PAGE_DOWN).perform()

WebUI.click(findTestObject('Upload Document/nextButtonLocatorAfterUpload'))

//WebUI.dragAndDropToObject(findTestObject('Upload Document/dragSignatureLocation1'), findTestObject('Upload Document/dragSignatureLocation2'))
WebUI.dragAndDropByOffset(findTestObject('Upload Document/dragSignatureLocation1'), -400, 300)

ac.sendKeys(Keys.PAGE_DOWN).perform()

ac.sendKeys(Keys.PAGE_DOWN).perform()

WebUI.click(findTestObject('Upload Document/saveLocator'))

WebUI.click(findTestObject('MTP Locators/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/filterByNameLocator'), 1)

WebUI.sendKeys(findTestObject('MTP Locators/filterByNameLocator'), GlobalVariable.hiredCandidate)

WebUI.scrollToElement(findTestObject('MTP Locators/searchLocator'), 1)

WebUI.click(findTestObject('MTP Locators/searchLocator'))

WebUI.scrollToElement(findTestObject('MTP Locators/tabLocators'), 1)

List<WebElement> tabsAfterUpload = driver.findElements(By.cssSelector('a[data-toggle=\'tab\']'))

int countOfTabsAfterUpload = tabsAfterUpload.size()

for (int k = 0; k < countOfTabsAfterUpload; k++) {
    textOnTabsafterUpload = tabsAfterUpload.get(k).getText()

    System.out.println(textOnTabsafterUpload)

    if (textOnTabsafterUpload.equalsIgnoreCase('On-Boarding')) {
        tabsAfterUpload.get(k).click()

        break
    }
}

WebUI.scrollToElement(findTestObject('MTP Locators/sendDocumentLocator'), 0)

WebUI.click(findTestObject('MTP Locators/sendDocumentLocator'))

ac.sendKeys(Keys.PAGE_DOWN).perform()

WebUI.click(findTestObject('MTP Locators/sendEmailLocator'))

WebUI.click(findTestObject('MTP Locators/confirmSendEmailLocator'))

WebElement successMessage = driver.findElement(By.cssSelector('div[class=\'growl-item alert ng-scope alert-success icon alert-dismissable\']'))

successMessageText = successMessage.getText()

System.out.println(successMessageText)

//WebUI.verifyTextPresent(successMessageText, true)
if (WebUI.verifyTextPresent(successMessageText, true)) {
    WebUI.closeBrowser()
}

