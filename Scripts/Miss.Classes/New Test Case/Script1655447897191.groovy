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

WebUI.click(findTestObject('Object Repository/Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/candidateCountLocator'))

WebUI.click(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/searchFilterOnCPPLocator'))

WebUI.scrollToElement(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'), 
    2)

WebUI.sendKeys(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/filterByNameLocator'), 
    GlobalVariable.candidateName)

WebUI.scrollToElement(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/searchLocator'), 
    2)

WebUI.click(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/Page_Mobile Talent  Mobile Recruitment/searchLocator'))

WebUI.scrollToElement(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/span_SMS'), 
    2)

WebUI.click(findTestObject('Object Repository/Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/span_SMS'))

List<WebElement> allMessage = driver.findElements(By.cssSelector('div.chat-history ul li div.message.other-message'))

int beforeSentcount = allMessage.size()

int expectedCount = beforeSentcount + 1

System.out.println(beforeSentcount)

WebUI.setText(findTestObject('Object Repository/Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/textarea_Test Account_message-to-send'), 
    'hi this is message from automation')

WebUI.scrollToElement(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/sendButtonLocator'), 
    1)

WebUI.click(findTestObject('Object Repository/Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/sendButtonLocator'))

List<WebElement> allMessage2 = driver.findElements(By.cssSelector('div.chat-history ul li div.message.other-message'))

int afterSentCount = allMessage2.size()

System.out.println(afterSentCount)

if (expectedCount == afterSentCount) {
    System.out.println('Message Sent Successfully')
}

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/span_Manage Accounts'))

WebUI.setText(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/input_Create New Account_form-control ng-pr_ad5695'), 
    'Test Account')

WebUI.sendKeys(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/input_Create New Account_form-control ng-pr_ad5695'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/i_QA Testing Team_fa fa-cogs fa-lg icon-gre_e7871b'))

WebUI.click(findTestObject('Verify that Recruiter is able to send the message to Candidate when Automated bot is on/Page_Mobile Talent  Mobile Recruitment/toggleButtonOff'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.click(findTestObject('Object Repository/Toggle Button/Page_Mobile Talent  Mobile Recruitment/div_Enable Candidate Excel Download    Enab_7336b9'))

WebUI.closeBrowser()
