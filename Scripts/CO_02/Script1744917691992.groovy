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

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Account Login/input_E-Mail Address_email'), 'michael@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account Login/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Account Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_My Account/img_Checkout_img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/button_submit'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_Checkout'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_--- Please Select ---               _b7b082'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Choose'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Choose_1'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Confirm Order'))

WebUI.closeBrowser()

