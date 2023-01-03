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
import com.github.javafaker.Faker as Faker

WebUI.openBrowser('https://bioskoponline.com/')

Faker faker = new Faker()

String test = faker.funnyName()

WebUI.click(findTestObject('Page_Bioskop Online/button_Daftar'))

WebUI.setText(findTestObject('Page_Bioskop Online/input__email'), 'testingemail@gmail.com')

WebUI.setText(findTestObject('Page_Bioskop Online/input__name'), 'testing')

WebUI.setText(findTestObject('Page_Bioskop Online/input__phone'), '081245631579')

WebUI.setText(findTestObject('Page_Bioskop Online/input__kata_sandi_encrypted'), 'Katasand1')

'Harus masukan OTP manual lalu click lanjutkan sendiri'
WebUI.click(findTestObject('Page_Bioskop Online/button_Lanjutkan'))

