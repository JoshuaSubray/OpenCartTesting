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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.opencart.com.gr/')

WebUI.click(findTestObject('Object Repository/Page_Your Store/i_Ex Tax 101.00_fa fa-shopping-cart'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Contact Us'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/span_1 item(s) - 75.46'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/button_1 item(s) - 75.46'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/button_1 item(s) - 75.46'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/strong_View Cart'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/a_Contact Us'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/button_1 item(s) - 75.46'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/i_Checkout_fa fa-share'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_1 item(s) - 75.46'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/strong_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/a_Contact Us'))

