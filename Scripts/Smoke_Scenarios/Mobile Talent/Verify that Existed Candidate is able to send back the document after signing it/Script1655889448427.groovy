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

WebUI.callTestCase(findTestCase('Smoke_Scenarios/Mobile Talent/Verify that Recruiter is able to send the doucument to candidate'), [:], 
FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.candidateAppUser)

WebUI.setEncryptedText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.candidateAppPassword)

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

Thread.sleep(2000)

WebUI.click(findTestObject('candidate App/Page_/hambergerIconOnCandidateAppLocator'))

List<WebElement> allListElements = driver.findElements(By.cssSelector('div[class=\'mat-list-text\']'))

int listCount = allListElements.size()

for (int i = 0; i < listCount; i++) {
    textOfALLOptions = allListElements.get(i).getText()

    if (textOfALLOptions.equalsIgnoreCase('My Jobs')) {
        allListElements.get(i).click()

        break
    }
}

List<WebElement> allAppliedJobElements = driver.findElements(By.cssSelector('div[class=\'mat-card-header-text\']'))

int listallAppliedJobCount = allAppliedJobElements.size()

for (int k = 0; k < listallAppliedJobCount; k++) {
    textOfAllAppliedJob = allAppliedJobElements.get(k).getText()

    if (textOfAllAppliedJob.equalsIgnoreCase('Software Engineer_Perl Developer')) {
        allAppliedJobElements.get(k).click()

        break
    }
}

List<WebElement> allTabs = driver.findElements(By.cssSelector('div[class=\'mat-tab-label-content\']'))

int listallTabsCount = allTabs.size()

for (int l = 0; l < listallTabsCount; l++) {
    textOfAllTabs = allTabs.get(l).getText()

    if (textOfAllTabs.equalsIgnoreCase('On-Boarding')) {
        allTabs.get(l).click()

        break
    }
}
Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/candidate App/Page_/button_View'))

Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/candidate App/Page_/li_Signature'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/div_Clear Canvas_mat-checkbox-inner-contain_2f2c24'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/canvas_concat(id(, , signature-pad, , ))_si_5e9dd4'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/span_Add'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/button_Submit'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/span_Confirm'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/div_Document submitted successfully'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/mat-icon_menu'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/span_Log Out'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_/a_Click here to login again'))

WebUI.setText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Mobile Talent Pool'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_All Candidates_fa fa-search'))

WebUI.setText(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/input_Name_Name'), 
    'vinayak pathak')

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/button_Search'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/a_On-Boarding'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Signed_fas fa-eye icon-grey ng-scope'))


WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/button_Close'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/td_Signed'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fas fa-caret-down caret-down-arrow'))

WebUI.click(findTestObject('Object Repository/candidate App/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

WebUI.closeBrowser()


