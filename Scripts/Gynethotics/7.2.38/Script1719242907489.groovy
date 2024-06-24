import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert as SoftAssert
import com.kms.katalon.core.testdata.CSVData as CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert()

def driver = DriverFactory.getWebDriver()

String baseUrl = GlobalVariable.TestPatientAccountPage.toString()

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open(GlobalVariable.TestPatientAccountPage.toString())

selenium.click('xpath=//div[@id=\'page-content\']/div[2]/span/div/ul/li[4]/a/span')

selenium.click('xpath=//div[@id=\'page-content\']/div[2]/span/div[5]/div[2]/div/form/button')

selenium.open('https://clinic-uat.cosm.care/gynethotics/order')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'RXK\'])[1]/following::*[name()=\'svg\'][1]')

selenium.click('xpath=/html/body/div[1]/div/main/div/div[2]/div/div/div[6]/div/a[2]')

selenium.click('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[9]/div/div/div[2]/div/a/div')

selenium.click('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[3]/div/div')

selenium.type('xpath=//input[@type=\'text\']', '121')

selenium.click('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[4]/div/div')

selenium.type('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[4]/div/div/div[3]/div/input', 
    '100')

selenium.click('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[5]/div/div/div[2]/div/a[3]/div')

selenium.click('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[9]/div/div/div[2]/div/a/div')

selenium.click('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[10]/div/div[2]/div/div/div/div')

selenium.type('xpath=//div[@id=\'page-content\']/div/div/div[4]/div[2]/div/div/div[2]/div[2]/div[10]/div/div[2]/div/div/div/div/div[3]/div/input', 
    '23')

selenium.click('link=Continue...')

softAssertion.assertEquals('A40, L121, W100, T23, Ta16, Tp16, KL', selenium.getText('xpath=/html/body/div[1]/div/main/div/div[2]/div/div/div[5]/div/div[1]/table/tbody/tr[2]/td[3]/a'))

