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



class PagiNationSteps {
	@Given("Buka {string}")
	public void buka(String url) {
		WebUI.navigateToUrl(url)
	}

	@When("Berhasil menampilkan halaman Beranda")
	public void berhasilMenampilkanHalamanBeranda() {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Klik selanjutnya {string}")
	public void klikSelanjutnya(String btnMext) {
		WebUI.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);", null)
		WebUI.delay(5)
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonNext'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
	}

	@When("Klik sebelumnya {string}")
	public void klikSebelumnya(String btnPrev) {
		WebUI.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);", null)
		WebUI.delay(5)
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/clickButtonPrevious'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
	}

	@Then("Berhasil menampilkan URL {string}")
	public void berhasilMenampilkanURL(String urlPage) {
		WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyUrl'), [('urlExpectedVar') : urlPage], FailureHandling.STOP_ON_FAILURE)
	}

	//		@Then("Berhasil menampilkan halaman Beranda")
	//		public void BerhasilMenampilkanHalamanBeranda() {
	//			WebUI.callTestCase(findTestCase('Page Objects/Homepage/verifyTitlePage'), [:], FailureHandling.STOP_ON_FAILURE)
	//		}
}