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

WebUI.openBrowser('https://pos.bling.my.id/')

WebUI.setText(findTestObject('Page_Menu/Search/Page_KedaiKopi  Login/input_Username'), username)

WebUI.setText(findTestObject('Page_Login/Valid/Page_Order Cafe  Login/input_Password'), password)

WebUI.click(findTestObject('Page_Menu/Search-Manual/Page_KedaiKopi  Login/button_Login'))

WebUI.waitForElementVisible(findTestObject('Page_Login/Valid/Page_Create Next App/button_Access Dashboard'), 10)

WebUI.navigateToUrl('https://pos.bling.my.id/admin/table')

WebUI.click(findTestObject('Page_KedaiKopi  Table Management/button_Create'))

WebUI.setText(findTestObject('Page_KedaiKopi  Table Management/input_Insert name here'), 'Testing Meja')

WebUI.setText(findTestObject('Page_KedaiKopi  Table Management/textarea_Insert description here'), 'Testing Meja Description')

WebUI.setText(findTestObject('Page_KedaiKopi  Table Management/input_Insert capacity here'), '10')

WebUI.click(findTestObject('Page_KedaiKopi  Table Management/button_Select Status'))

WebUI.click(findTestObject('Page_KedaiKopi  Table Management/button_Available1'))

WebUI.click(findTestObject('Page_KedaiKopi  Table Management/button_Create_1'))

WebUI.delay(2)

WebUI.closeBrowser()

