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

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Login/div_Toggle themeOrder CafeWelcomeLogin to access'))

WebUI.setText(findTestObject('Page_Menu/Create/Page_Order Cafe  Login/input_Username'), 'vour@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Menu/Create/Page_Order Cafe  Login/input__'), '8bIcDAq1IGk=')

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Login/button_Login'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Create Next App/button_Access Dashboard'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Dashboard/a_Menu'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/button_Create'))

WebUI.setText(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/input_Insert name here'), 'Vanilla Oat Latte')

WebUI.setText(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/textarea_Insert description here'), 'Perpaduan espresso dan oat milk dengan sentuhan sirup vanilla organik.')

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/button_Select Category'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/div_radix-_r_1e'))

WebUI.setText(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/input_Insert price here'), '35000')

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/input_Insert price here'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/button_Select Category'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/div_radix-_r_1p'))

WebUI.setText(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/input_Insert discount here'), '0')

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/button_Select Availability'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/div_radix-_r_25'))

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/span_bg-muted flex size-full items-center justif'))

WebUI.setText(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/input_image_url'), 'C:\\fakepath\\Iced-Matcha-Latte-recipe.jpg')

WebUI.click(findTestObject('Page_Menu/Create/Page_Order Cafe  Menu Management/button_Create_1'))

