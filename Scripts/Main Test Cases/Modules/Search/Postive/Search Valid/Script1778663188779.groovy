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

WebUI.click(findTestObject('Page_Menu/Search-Manual/Page_Create Next App/button_Access Dashboard'))

WebUI.navigateToUrl('https://pos.bling.my.id/admin')

WebUI.click(findTestObject('Page_Menu/Search-Manual/Page_KedaiKopi  Order Management/a_Order'))

WebUI.navigateToUrl('https://pos.bling.my.id/order')

WebUI.setText(findTestObject('Page_Menu/Search-Manual/Page_KedaiKopi  Order Management/input_Table Map_filetext-foreground placeho_9a23fe'), 
    'VOURCAFE-1778568320969')

WebUI.verifyElementVisible(findTestObject('Page_Menu/Search-Manual/Page_KedaiKopi  Order Management/td_No Result Data'))

WebUI.delay(2)

WebUI.closeBrowser()

