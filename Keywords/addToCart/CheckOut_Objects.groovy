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

public class CheckOut_Objects {

	//Buttons
	def btn_home() {

		TestObject btn_home = findTestObject('Buttons/addToCart/btn_home')
	}

	def btn_select_women_dress() {

		TestObject btn_select_women_dress = findTestObject('Buttons/addToCart/btn_select_dress')
	}

	def btn_dress() {

		TestObject btn_dress = findTestObject('Buttons/addToCart/btn_dress')
	}

	def btn_more() {

		TestObject btn_more = findTestObject('Buttons/addToCart/btn_more')
	}

	def btn_select_size() {

		TestObject btn_select_size = findTestObject('Buttons/addToCart/btn_select_size')
	}

	def btn_selected_size_M() {

		TestObject btn_selected_size_M = findTestObject('Buttons/addToCart/btn_selected_size_m')
	}

	def btn_addtocart() {

		TestObject btn_addtocart = findTestObject('Buttons/addToCart/btn_addtocart')
	}

	def btn_checkout() {

		TestObject btn_checkout = findTestObject('Buttons/addToCart/btn_checkout')
	}

	def btn_tick_checkbox() {

		TestObject btn_tick_checkbox = findTestObject('Buttons/addToCart/btn_tick_checkbox')
	}

	def btn_select_payment_type() {

		TestObject btn_select_payment_type = findTestObject('Buttons/addToCart/btn_select_payment_type')
	}

	def btn_confirm_order() {

		TestObject btn_confirm_order = findTestObject('Buttons/addToCart/btn_confirm_order')
	}

	def btn_change_to_gridview() {

		TestObject btn_change_to_gridview = findTestObject('Buttons/addToCart/btn_gridview')
	}

	def btn_proceed_carrier() {

		TestObject btn_proceed_carrier = findTestObject('Buttons/addToCart/btn_proceed_address')
	}

	def btn_proceed_address() {

		TestObject btn_proceed_address = findTestObject('Buttons/addToCart/btn_proceed_summary')
	}

	def btn_proceed_payment() {

		TestObject btn_proceed_payment = findTestObject('Buttons/addToCart/btn_proceed_carrier')
	}


	//Text Fields
	def text_verify_information(String text) {

		TestObject text_verify_information = findTestObject('Text Fields/addToCart/textfield_verify_text', [('text') : text])
	}

	def text_verify_item(String text) {

		TestObject text_verify_item = findTestObject('Text Fields/addToCart/textfield_verify_item', [('text') : text])
	}

	def text_verify_size(String text) {

		TestObject text_verify_size = findTestObject('Text Fields/addToCart/textfield_verify_size', [('text') : text])
	}

	def text_verify_price(String text) {

		TestObject text_verify_price = findTestObject('Text Fields/addToCart/textfield_verify_price', [('text') : text])
	}

	def text_verify_address(String text) {

		TestObject text_verify_address = findTestObject('Text Fields/addToCart/textfield_verify_address', [('text') : text])
	}

}
