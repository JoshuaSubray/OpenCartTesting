import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/opencart41/upload/')

WebUI.click(findTestObject('Object Repository/Page_Your Store/img_Checkout_img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_Currency'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_Currency'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_123456789'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/span_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us/span_Wish List (0)'))

WebUI.click(findTestObject('Object Repository/Page_Account Login/span_Shopping Cart'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/span_Checkout'))

