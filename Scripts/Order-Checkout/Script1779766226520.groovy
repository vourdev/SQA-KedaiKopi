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

WebUI.setText(findTestObject('Page_Menu/Menu-manual/Manual-Order-Checkout-SPY/input_Email__R_1inpfl5tlb_-form-item'), 'vour@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Menu/Order-Checkout/Manual-Order-Checkout-SPY/input_Password__R_2inpfl5tlb_-form-item'), '8bIcDAq1IGk=')

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Login'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Access Dashboard'))

WebUI.navigateToUrl('https://pos.bling.my.id/admin')

WebUI.click(findTestObject('Page_Menu/Order-Checkout/a_radix-_r_s'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_radix-_r_cr'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Dine In'))

WebUI.setText(findTestObject('Page_Menu/Order-Checkout/input_Insert customer name here'), 'yani')

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Select Table'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/div_radix-_r_ep'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Select Status'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/div_radix-_r_f8'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Create'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_radix-_r_fc'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/a_Detail'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Create'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_inline-flex items-center justify-center g'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Order'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_radix-_r_fr'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/a_Detail'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_radix-_r_fr'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/a_Detail'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_radix-_r_fr'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/a_Detail'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Pay'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/iframe_snap-midtrans'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/div_payment-page-text horizontal'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/div_Copy'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Check status'))

WebUI.click(findTestObject('Page_Menu/Order-Checkout/button_Back To Order'))

