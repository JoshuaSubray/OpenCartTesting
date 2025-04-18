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

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Phones  PDAs'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/div_HTC Touch HD      HTC Touch - in High D_260281'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/a_HTC Touch HD'))

WebUI.setText(findTestObject('Object Repository/Page_HTC Touch HD/input_Your Name_author'), 'Edwin Tuckers')

WebUI.click(findTestObject('Object Repository/Page_HTC Touch HD/div_Your Review             Note HTML is no_774c84'))

WebUI.setText(findTestObject('Object Repository/Page_HTC Touch HD/textarea_Your Review_text'), 'There is something wrong with this phone but im not sure what it was')

WebUI.click(findTestObject('Object Repository/Page_HTC Touch HD/input_Bad Good_rating'))

WebUI.click(findTestObject('Object Repository/Page_HTC Touch HD/input_Bad Good_rating_1'))

WebUI.click(findTestObject('Object Repository/Page_HTC Touch HD/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_HTC Touch HD/button_btn-close'))

WebUI.closeBrowser()

