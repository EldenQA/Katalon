import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.swing.ListSelectionModel as ListSelectionModel
import javax.swing.text.html.CSS
import javax.swing.text.html.FormView

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
import org.apache.commons.lang.RandomStringUtils

import java.awt.List
import java.io.BufferedReader as BufferedReader
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
Properties pro = new Properties()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mobile-recruit.com/login')

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Username_username'), 
    'romgupta@qasource.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/input_Password_password'), 
    'kz7p4/CQ+93m2i5idrXw6Q==')

WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Mobile Talent  Mobile Recruitment/button_Login'))
WebUI.click(findTestObject('Object Repository/Job_Creation/Page_Bebo Talent  Mobile Recruitment/span_Launch New Job'))

FileWriter fw = new FileWriter("console.properties");
pro.setProperty("JobName" , 'Automation_JobID_' + RandomStringUtils.randomNumeric(4))
pro.store(fw, "comments")
FileInputStream fis = new FileInputStream("console.properties");
Input = pro.getProperty("JobName")

WebUI.setText(findTestObject('Object Repository/Job_Creation/Page_Bebo Talent  Mobile Recruitment/input__campaignName'), 
    Input)
WebDriver driver = com.kms.katalon.core.webui.driver.DriverFactory.getWebDriver()
driver.findElement(By.cssSelector('select[name=\'campaignIndustryID\'] > option[value=\'4\']')).click()
driver.findElement(By.cssSelector('select[name=\'campaignFamilyId\'] > option[value=\'21\']')).click()
driver.findElement(By.cssSelector('select[name=\'campaignFunctionId\'] > option[value=\'47\']')).click()


pro.load(new FileInputStream('README.md'))
keyValue = pro.getProperty('Message')
driver.findElement(By.cssSelector('.placeholder-text')).sendKeys(keyValue)
driver.findElement(By.cssSelector('input[name=\'qualification\']')).sendKeys('master')
WebElement element = driver.findElement(By.cssSelector('span[aria-valuetext=\'0\']'))

int value = element.getSize().width
Actions action = new Actions(driver)
action.dragAndDropBy(element, value, 0).build().perform()
WebElement element_1 = driver.findElement(By.cssSelector('span[aria-valuetext=\'10\']'))

int value2 = element_1.getSize().width

action.dragAndDropBy(element_1, value2, 0).build().perform()

driver.findElement(By.cssSelector('div[name=\'manSkillList\'] input[aria-label=\'Select box\']')).sendKeys('java')
driver.findElement(By.cssSelector('div[name=\'manSkillList\'] input[aria-label=\'Select box\']')).sendKeys(Keys.ENTER)
driver.findElement(By.cssSelector('input[name=primary-0]')).click()

Thread.sleep(3000)

driver.findElement(By.cssSelector('div[name=\'altSkillList\'] input[aria-label=\'Select box\']')).click()
driver.findElement(By.cssSelector('div[name=\'altSkillList\'] input[aria-label=\'Select box\']')).sendKeys('selenium')
driver.findElement(By.cssSelector('div[name=\'altSkillList\'] input[aria-label=\'Select box\']')).sendKeys(Keys.ENTER)
driver.findElement(By.cssSelector('input[id=\'ch-a-0\']')).click()
driver.findElement(By.cssSelector('select[name=\'campaignDepartmentId\'] option[value=\'3\']')).click()
driver.findElement(By.cssSelector('[name= \'campaignDesignationId\'] option[value=\'178\']')).click()
driver.findElement(By.cssSelector('[name= \'campaignProjectId\'] option[value=\'26\']')).click()
driver.findElement(By.cssSelector('[name= \'postitonCount\'] ')).sendKeys('4')
driver.findElement(By.cssSelector('select[name=\'campaignQuarter\'] option[value=\'Apr-Jun 2023\']')).click()

Date date = new Date()

SimpleDateFormat df = new SimpleDateFormat('MM/dd/yyyy')

currentDate = df.format(date)

driver.findElement(By.cssSelector('[name=\'dueDate\']')).sendKeys(currentDate)

driver.findElement(By.cssSelector('[name=\'dueDate\']')).sendKeys(Keys.ENTER)

WebUI.click(findTestObject('Job_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next'))
pro.load(new FileInputStream('console.properties'))
keyValue = pro.getProperty('Template')
driver.findElement(By.cssSelector('span [class = \'fa fa-search\']')).click()
driver.findElement(By.cssSelector('input[type = \'Text\']')).sendKeys(keyValue)
driver.findElement(By.cssSelector('button[type=\'button\'] i[class=\'fa fa-search\']')).click()



By buttonBy = By.cssSelector("div[class='select-template']") 
By selectTemplateBy = By.cssSelector("button[class='btn btn-yellow']")
WebElement button_s = driver.findElement(buttonBy)
action.moveToElement(button_s).perform()
Thread.sleep(3000)
WebElement selectTemplate = driver.findElement(selectTemplateBy)
action.click(selectTemplate).perform()


WebUI.click(findTestObject('Job_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next'))
driver.findElement(By.cssSelector("label[class='css-label radGroup1']")).click()
WebUI.click(findTestObject('Job_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next'))
WebUI.click(findTestObject('Job_Creation/Page_Bebo Talent  Mobile Recruitment/button_Next'))
driver.findElement(By.cssSelector(".ng-scope > .ng-scope > .btn.btn-black.ng-scope")).click()


