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

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Manage Templates'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Create New Template'))

FileWriter fw = new FileWriter('console.properties')

Properties pro = new Properties()

pro.setProperty('Template', 'Software_Testing_' + org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(4))

pro.store(fw, 'comments')

FileInputStream fis = new FileInputStream('console.properties')

Input = pro.getProperty('Template')

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input__templateName'), 
    Input)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li__multiselect-search-list-item multiselec_b05554'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li_Management of Companies and Enterprises'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li_Job Family_multiselect-search-list-item _bf01f7'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/li_Telecommunications'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/i_Add page_fa fa-plus icon-grey'))

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Enter Page Name_form-control ng-prist_3b5161'), 
    'Location')

WebUI.click(findTestObject('Template Creation/Page_Mobile Talent  Mobile Recruitment/locationSelector'))

WebUI.click(findTestObject('Template Creation/Page_Mobile Talent  Mobile Recruitment/clickONAddPagePlusButton'))

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Enter Page Name_form-control ng-prist_3b5161'), 
    'Capture')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/Click on Capcture Icon'))

WebUI.click(findTestObject('Template Creation/Page_Mobile Talent  Mobile Recruitment/clickOnCaptureToDisplayTheCaptureFields'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/ClickOnInputFields'))

WebUI.scrollToElement(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/MultiLineQuestion'), 
    3)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/MultiLineQuestion'))

WebUI.scrollToElement(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/ScrollToMultilineSetting'), 
    3)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Required_glyphicon glyphicon-wrench'))

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Question Text_displayName'), 
    'Do you have any degree , Choose one')

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/a_Response'))

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Selection Text_fieldValue'), 
    'Options')

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Score_optionValue'), 
    'Btech')

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/MultilineQuestionNoOption'), 
    'MCA')

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Score_form-control numeric-include-ne_41ab90'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/MultiLineQuestionNoScore'), 
    '0')

WebUI.scrollToElement(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/AddQuestionWithCapture'), 
    3)

WebUI.click(findTestObject('Template Creation/Page_Mobile Talent  Mobile Recruitment/clickOnQuestionniareText'))

WebUI.setText(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/input_Enter Page Name_form-control ng-prist_3b5161'), 
    'Ques')
WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/QuestionniareForm'))



WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/ClickOnInputFields'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/clickOnQuestionniareName'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/ClickOnUploadQuestionnairesToExpand'))

Thread.sleep(2000)

WebUI.click(findTestObject('Template Creation/Page_Mobile Talent  Mobile Recruitment/UploadFileForQuestionnareThrouhVariable'))
Thread.sleep(2000)
File f = new File('Speciman.csv')

String logoPath = f.getAbsolutePath()

Robot rb = new Robot()

StringSelection ss = new StringSelection(logoPath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

rb.keyPress(KeyEvent.VK_CONTROL)

rb.keyPress(KeyEvent.VK_V)

rb.keyRelease(KeyEvent.VK_CONTROL)

rb.keyRelease(KeyEvent.VK_V)

rb.keyPress(KeyEvent.VK_ENTER)

rb.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/clickOnQuestionniareName'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/clickOnUploadButtonAfterUploadingFile'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/clickOnFileUploadConfirmationPopup'))

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/clickOnQuestionniareName'))

Actions ac = new Actions(driver)

ac.sendKeys(Keys.ARROW_UP).perform()

WebUI.verifyTextPresent('Questions has been added to Input Fields.', false)

WebUI.scrollToElement(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Save'), 
    3)

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Save'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/div_Template has been saved successfully'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/div_Template has been saved successfully'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Administration_2'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Manage Templates'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/i_Romit Romit_fa fa-share-alt fa-lg color-g_72fb5f'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/div_Template has been published successfully'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/b_Romit Romit'))

WebUI.click(findTestObject('Object Repository/Template Creation/Page_Mobile Talent  Mobile Recruitment/span_Logout'))

//driver.findElement(By.cssSelector('div#wrapper li.dropdown > a > i')).click()

//driver.findElement(By.cssSelector('div#wrapper li.dropdown.open > ul > li:nth-child(2) > a')).click()

WebUI.closeBrowser()

