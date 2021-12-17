package addToCart

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import registration.Credentials_Objects

public class CheckOut extends CheckOut_Objects {

	Credentials_Objects credentials_objects = new Credentials_Objects()

	@Keyword
	def purchaseFlow() {

		//SignIn
		WebUI.click(credentials_objects.btn_signin())
		WebUI.setText(credentials_objects.text_email(), "fave123@test.com")
		WebUI.setText(credentials_objects.text_password(), "123456")
		WebUI.click(credentials_objects.btn_submit_login())

		//Search product and add to cart
		WebUI.click(super.btn_home())
		WebUI.click(super.btn_select_women_dress())
		WebUI.scrollToPosition(0, 350)
		WebUI.delay(5)
		WebUI.click(super.btn_change_to_gridview())
		WebUI.delay(5)
		WebUI.click(super.btn_more())
		WebUI.click(super.btn_select_size())
		WebUI.click(super.btn_selected_size_M())

		WebUI.click(super.btn_addtocart())
		WebUI.verifyElementPresent(super.text_verify_information('Product successfully added to your shopping cart'), 0)
		WebUI.click(super.btn_checkout())

		//Summary
		WebUI.verifyElementPresent(super.text_verify_item('Printed Dress'), 0)
		WebUI.verifyElementPresent(super.text_verify_size('M'), 0)
		WebUI.verifyElementPresent(super.text_verify_price('$26.00'), 0)
		WebUI.click(super.btn_proceed_address())

		//Address
		WebUI.verifyElementPresent(super.text_verify_address('Fave qa'), 0)
		WebUI.verifyElementPresent(super.text_verify_address('Qakland'), 0)
		WebUI.verifyElementPresent(super.text_verify_address('South valley, Maryland 90212'), 0)
		WebUI.verifyElementPresent(super.text_verify_address('United States'), 0)
		WebUI.verifyElementPresent(super.text_verify_address('601234675'), 0)
		WebUI.click(super.btn_proceed_carrier())

		//Shipping
		WebUI.click(super.btn_tick_checkbox())
		WebUI.click(super.btn_proceed_payment())

		//Selecting payment method
		WebUI.click(super.btn_select_payment_type())
		WebUI.click(super.btn_confirm_order())
	}
}