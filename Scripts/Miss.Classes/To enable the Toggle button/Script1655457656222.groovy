import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
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
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Account_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

List<WebElement> allTabsOnAdministration = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

count = allTabsOnAdministration.size()

for (int p = 0; p < count; p++) {
    tabNames = allTabsOnAdministration.get(p).getText()

    System.out.println(tabNames)

    if (tabNames == 'SMS - BOT') {
        allTabsOnAdministration.get(p).click()

        break
    }
}
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

    List<WebElement> allTabsOnAdministration1 = driver.findElements(By.cssSelector('ul li span[class =\'ng-scope\']'))

    count = allTabsOnAdministration1.size()

    for (int l = 0; l < count; l++) {
        tabNames1 = allTabsOnAdministration1.get(l).getText()

        System.out.println(tabNames1)

        if (tabNames1 == 'Manage Accounts') {
            allTabsOnAdministration.get(l).click()

            break
        }
    }
    
    WebUI.setText(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/searchAccountLocator'), 
        'Test Account')

    WebUI.click(findTestObject('Send Message(Bot-ON)/Page_Mobile Talent  Mobile Recruitment/searchButtonLocatorOnManageAccount'))

    List<WebElement> accountNames = driver.findElements(By.cssSelector('td a[ng-click = "vm.getAccountDetails(account.id)"]'))

    count1 = accountNames.size()

    for (int i = 0; i < count; i++) {
        accountNamesText = accountNames.get(i).getText()

        System.out.println(accountNamesText)

        if (accountNamesText == 'Test Account') {
            driver.findElement(By.cssSelector('i[data-title=\'Account Settings\']')).click()

            break
        }
    }
    
    List<WebElement> toggleButtonNamesAccountSetting = driver.findElements(By.cssSelector('div[class=toggle-label]'))

    int countToggleButtons = toggleButtonNamesAccountSetting.size()

    for (int k = 0; k < countToggleButtons; k++) {
        countToggleButtonsText = toggleButtonNamesAccountSetting.get(k).getText()

        System.out.println(countToggleButtonsText)

        if (countToggleButtonsText == 'Enable Automated SMS') {
            WebUI.click(findTestObject('Toggle Button/Page_Mobile Talent  Mobile Recruitment/label_Yes'))
        }
    }

if (false) {
    driver.findElement(By.xpath('//span[text()=\'All Jobs\']')).click()
}

