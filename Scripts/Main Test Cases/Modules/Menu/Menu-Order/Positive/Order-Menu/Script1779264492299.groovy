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

WebUI.navigateToUrl('https://pos.bling.my.id/')

WebUI.setText(findTestObject('Page_Menu/Search/Page_KedaiKopi  Login/input_Username'), username)

WebUI.setText(findTestObject('Page_Login/Valid/Page_Order Cafe  Login/input_Password'), password)

WebUI.click(findTestObject('Page_Login/Valid/Page_Order Cafe  Login/button_Login'))

WebUI.click(findTestObject('Page_Menu/Search-Manual/Page_Create Next App/button_Access Dashboard'))

WebUI.navigateToUrl('https://pos.bling.my.id/admin')

WebUI.click(findTestObject('Page_Menu/Order-Menu/a_Order'))

WebUI.click(findTestObject('Page_Menu/Order-Menu/button_radix-_R_janpfl5tlb'))

WebUI.click(findTestObject('Page_Menu/Order-Menu/button_Dine In'))

WebUI.setText(findTestObject('Page_Menu/Order-Menu/input_Customer Name (1)'), 'bagas')

WebUI.click(findTestObject('Page_Menu/Order-Menu/button_Select Table (1)'))

WebUI.click(findTestObject('Page_Menu/Order/button_Meja Meeting 01 - available (20)'))

WebUI.click(findTestObject('Page_Menu/Order-Menu/button_Select Status (1)'))

WebUI.click(findTestObject('Page_Menu/Order-Menu/Button_Reseved'))

WebUI.click(findTestObject('Page_Menu/Order-Menu/button_Create'))

