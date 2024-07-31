package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class UpdatePenawaran {
	@When("Klik produk dengan status {string}")
	public void klikProdukDenganStatus(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Daftar Jual Saya/Tab Diminati/clickProductCard'), [('title') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Terima")
	public void klikTombolTerima() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnTerima'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Status produk berubah menjadi {string}")
	public void statusProdukBerubahMenjadi(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtProductStatus'), [('expected') : string], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Status")
	public void klikTombolStatus() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnStatus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Berhasil Terjual")
	public void klikTombolBerhasilTerjual() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/clickRadioBtnBerhasilTerjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Kirim")
	public void klikTombolKirim() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnKirim'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Tolak")
	public void klikTombolTolak() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/clickBtnTolak'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik tombol Batalkan Transaksi")
	public void klikTombolBatalkanTransaksi() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/clickRadioBtnBatalkanTransaksi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Muncul Bottom Sheets {string}")
	public void munculBottomSheets(String string) {
		Mobile.callTestCase(findTestCase('Page Objects/Bottom Sheets/verifyTxtBottomSheetsTitle'), [('txtBottomSheetTitleExpected') : string],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tutup Bottom Sheets")
	public void tutupBottomSheets() {
		Mobile.callTestCase(findTestCase('Page Objects/Bottom Sheets/closeBottomSheets'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}