import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

System.setProperty("webdriver.gecko.driver","/opt/Katalon_Studio/configuration/resources/drivers/chromedriver_linux64/chromedriver")
//DesiredCapabilities cap = new DesiredCapabilities();
//cap.setBrowserName("firefox");
//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

//Webdriver dr= DriverFactory.getWebDriverServerUrl(null)
WebUI.openBrowser('https://qas.arconline.io/')

//WebUI.navigateToUrl('https://qas.arconline.io/')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Arc Skoru  Sustainability perf/button_ACCEPT AND CLOSE'))

WebUI.setText(findTestObject('Object Repository/Page_Arc Skoru  Sustainability perf/input__name'), 'usgbcarc@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Arc Skoru  Sustainability perf/input__pass'), 'k35wbLuhoDOfiKYe0IaeNQ==')

WebUI.click(findTestObject('Object Repository/Page_Arc Skoru  Sustainability perf/input_Forgot Password_field_po'))

WebUI.click(findTestObject('Object Repository/Page_Arc Skoru  Sustainability perf/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Arc Skoru  Sustainability perf/span_Projects'))

WebUI.closeBrowser()



