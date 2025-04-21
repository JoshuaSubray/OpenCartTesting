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

WebUI.navigateToUrl('http://localhost/opencart41/upload/')

WebUI.click(findTestObject('Object Repository/Page_Your Store/button_submit'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/label_Guest Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_First Name_firstname'), 'edgar')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Last Name_lastname'), 'eduard')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_E-Mail_email'), 'edgar.eduar@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Company_shipping_company'), 'company')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Address 1_shipping_address_1'), 'address 2')

WebUI.click(findTestObject('Object Repository/Page_Checkout/div_Address 2'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_City_shipping_city'), 'city 1')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Post Code_shipping_postcode'), 'postcode')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_--- Please Select ---               _c8e2c4'), 
    '3526', true)

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Choose'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Choose_1'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Continue_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Confirm Order'))

WebUI.closeBrowser()

