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

WebUI.click(findTestObject('Page_Menu/Menu-manual/Page_KedaiKopi  Dashboard/a_Menu'))

WebUI.click(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/button_Create'))

WebUI.setText(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/input_Insert name here'), 'Chuangki')

WebUI.clearText(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/textarea_Insert description here'))

WebUI.click(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/button_Select Category'))

WebUI.click(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/div_radix-_r_1k'))

WebUI.setText(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/input_Insert price here'), '10000')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/input_Insert discount here'), '10')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/input_image_url'), '/Users/zero/Downloads/7003-sulsel.png')

WebUI.click(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/button_Select Availability'))

WebUI.delay(1)

// Cari elemen tombol Create
WebElement btnCreate = WebUiCommonHelper.findWebElement(findTestObject('Page_Menu/Create-Menu/Page_KedaiKopi  Menu Management/button_Create_1'), 10)

// 1. Paksa klik tombol Create
WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(btnCreate))

// 2. Tunggu maksimal 5 detik sampai pesan error muncul di layar
WebUI.waitForElementVisible(findTestObject('Object Repository/Path/Ke/Object/text_Error_Description'), 5)

// 3. Verifikasi bahwa pesan error benar-benar tampil (Script akan PASSED jika error muncul)
WebUI.verifyElementVisible(findTestObject('Object Repository/Path/Ke/Object/text_Error_Description'))

// Opsional: Verifikasi teks error-nya sesuai dengan yang diharapkan
WebUI.verifyElementText(findTestObject('Object Repository/Path/Ke/Object/text_Error_Description'), 'Description is required')

