package com.mac.testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mac.commonFunctions.GenericFunctions;
import com.mac.commonFunctions.PropertyFileUtils;
import com.mac.commonFunctions.ReportFunction;
import com.mac.config.Constants;
import com.mac.pageLibrary.ConfigurationPage;
import com.mac.pageLibrary.CustomerServiceWorkspacePage;
import com.mac.pageLibrary.GenesysCloudPage;
import com.mac.pageLibrary.LoginPage;

public class ConfigurationTest {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	public GenericFunctions genericFunctions;
	ReportFunction reportFunction = new ReportFunction();
	PropertyFileUtils pf = new PropertyFileUtils();
	String ENV = System.getProperty("env");
	String propertyFileName = "Mac";
	CustomerServiceWorkspacePage customerServiceWorkspacePage;
	LoginPage loginPage;
	GenesysCloudPage genesysCloudPage;
	ConfigurationPage configurationPage;

	/***
	 * 
	 * Start Browser & Open Application
	 */
	@BeforeClass(groups = { "CommonTest" })
	public void launch() throws Exception {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String filePath = System.getProperty("user.dir") + "/Results/AutomationReport_ " + timeStamp + ".html";
		File f = new File(filePath);
		if (!f.exists())

		{
			report = ReportFunction.getInstance(filePath);

		}

		test = report.createTest("Application Access -TestCase");
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("./Log4J/log4j.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		PropertyConfigurator.configure(props);

		genericFunctions = new GenericFunctions(driver, test);

		driver = genericFunctions.launchApplication(propertyFileName,
				PropertyFileUtils.getTestData(propertyFileName).get("Browser"),
				PropertyFileUtils.getTestData(propertyFileName).get("LocalHost_URL"));

		loginPage = new LoginPage(driver, test);
		customerServiceWorkspacePage = new CustomerServiceWorkspacePage(driver, test);
		genesysCloudPage = new GenesysCloudPage(driver, test);
		configurationPage = new ConfigurationPage(driver, test);

	}

	/***
	 *
	 * Login Genesys Cloud And Microsoft
	 */

	@Test(priority = 0)
	public void genesysAndmicrosoftLogin() throws Exception {

		test = report.createTest("Verify the Login Functionality For Genesys And Microsoft Testcase");
		loginPage.setTestLogger(test);

		loginPage.Localhost(PropertyFileUtils.getTestData(propertyFileName).get("Advance"),
				PropertyFileUtils.getTestData(propertyFileName).get("Unsafe"));

		loginPage.GenesysCloudLogin(PropertyFileUtils.getTestData(propertyFileName).get("Genesis_URL"),
				PropertyFileUtils.getTestData(propertyFileName).get("GenesysUserName"),
				PropertyFileUtils.getTestData(propertyFileName).get("GenesysPassword"),
				PropertyFileUtils.getTestData(propertyFileName).get("login"));

		loginPage.MicrosoftLogin(PropertyFileUtils.getTestData(propertyFileName).get("Microsoft_URL"),
				PropertyFileUtils.getTestData(propertyFileName).get("MicrosoftUserName"),
				PropertyFileUtils.getTestData(propertyFileName).get("Next"),
				PropertyFileUtils.getTestData(propertyFileName).get("MicrosoftPassword"),
				PropertyFileUtils.getTestData(propertyFileName).get("signin"),
				PropertyFileUtils.getTestData(propertyFileName).get("Staysignin"),
				PropertyFileUtils.getTestData(propertyFileName).get("IVR_URL"));

	}

	/***
	 *
	 * Login With Credential
	 */

	@Test(priority = 1)
	public void LoginWithCredd() throws Exception {

		test = report.createTest("Varyfying IVR Login Functionality");
		loginPage.setTestLogger(test);
		loginPage.LoginWithCredd(PropertyFileUtils.getTestData(propertyFileName).get("IVR_URL"),PropertyFileUtils.getTestData(propertyFileName).get("IVRUserName"),
				PropertyFileUtils.getTestData(propertyFileName).get("IVRPassword"));
	}

	/***
	 *
	 * Open Configuration Page
	 */

	@Test(priority = 2)
	public void OpenConfigurationPage() throws Exception {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(2));
		Thread.sleep(Constants.SleepWaitTime);

		test = report.createTest("Open Configuration");
		configurationPage.setTestLogger(test);
		configurationPage.OpenConfigurationPage(
				PropertyFileUtils.getTestData(propertyFileName).get("Advance_Setting_URL"),
				PropertyFileUtils.getTestData(propertyFileName).get("Solution_InteractionSync_URL"));
	}

	/***
	 *
	 * Check Project Name
	 */

	@Test(priority = 3)
	public void ConfigurationName() throws Exception {

		test = report.createTest("Mac_85 Configuration Name");
		configurationPage.setTestLogger(test);
		configurationPage.ConfigurationName(PropertyFileUtils.getTestData(propertyFileName).get("String"));
	}

	/***
	 *
	 * Check CCp, CCp Login URL
	 */

	@Test(priority = 4)
	public void CheckCcpAndCcpLoginUrl() throws Exception {

		test = report.createTest("Mac_55 Check CCp, CCp Login URL");
		configurationPage.setTestLogger(test);
		configurationPage.CheckCcpAndCcpLoginUrl(PropertyFileUtils.getTestData(propertyFileName).get("CCP_URl"),
				PropertyFileUtils.getTestData(propertyFileName).get("CCP_Login_Url"));

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@Test(priority = 5)
	public void CallingFromGenesysCloud1() throws Exception {

		test = report.createTest("Verifying Calling From Genesys Cloud");
		genesysCloudPage.setTestLogger(test);
		genesysCloudPage.CallingFromGenesysCloud();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));

	}

	/***
	 *
	 * Recieve Call / New Session Template
	 */

	@Test(priority = 6)

	public void NewSessionTemplate() throws Exception {

		test = report.createTest("Mac_52 Verifying New Session Template Title");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.NewSessionTemplate();
		Thread.sleep(Constants.SleepWaitTime2);

	}

	/***
	 *
	 * End Call
	 */

	@Test(priority = 7)

	public void EndCall() throws Exception {

		test = report.createTest("End Call");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.EndCall();

	}

	/***
	 *
	 * Toggle On Off
	 */

	@Test(priority = 8)
	public void ToggleOnOff() throws Exception {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));

		test = report.createTest("Varyfying Click on Toggle For On & OFF");
		configurationPage.setTestLogger(test);
		configurationPage.ToggleOnOff();

		driver.switchTo().window(tabs.get(2));

		driver.navigate().refresh();

		Thread.sleep(Constants.SleepWaitTime);

		ChromeOptions chromeOptions = new ChromeOptions();

		driver.switchTo().alert().accept();
		chromeOptions.addArguments("use-fake-ui-for-media-stream");
		chromeOptions.addArguments("use-fake-device-for-media-stream");

		Thread.sleep(Constants.SleepWaitTime);
		driver.switchTo().window(tabs.get(1));
	}

	/***
	 *
	 * Calling From Genesys Cloud
	 */

	@Test(priority = 9)
	public void CallingFromGenesysCloud() throws Exception {

		test = report.createTest("Varyfying Calling From Genesys Cloud");
		genesysCloudPage.setTestLogger(test);
		genesysCloudPage.CallingFromGenesysCloud();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));

	}

	@Test(priority = 10)
	public void ToggleOffNoRecordsFound() throws Exception {

		test = report.createTest("Mac_52 Varyfying record or Session Name when Toggle is off");
		configurationPage.setTestLogger(test);
		configurationPage.ToggleOffNoRecordsFound();

	}

	@Test(priority = 11)

	public void EndCall1() throws Exception {

		test = report.createTest("End Call");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.EndCall();

	}

	/***
	 *
	 * Test Mac Ticket 47
	 */

	@Test(priority = 12)
	public void Create_New_Queue() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(3));
		Thread.sleep(Constants.SleepWaitTime);
		jse.executeScript("window.scroll(0,-1000)");

		test = report.createTest("Mac_47 Create New Queue");
		configurationPage.setTestLogger(test);
		configurationPage.Create_New_Queue(PropertyFileUtils.getTestData(propertyFileName).get("QueueName"));
	}

	/***
	 *
	 * Test Mac Ticket 74
	 */

	@Test(priority = 13)
	public void AddNewEntity() throws Exception {

		test = report.createTest("Mac_74 Add New Entity");
		configurationPage.setTestLogger(test);
		configurationPage.AddNewEntity(PropertyFileUtils.getTestData(propertyFileName).get("contact"));
	}

	@Test(priority = 14)
	public void DeleteEntity() throws Exception {

		test = report.createTest("Mac_74 Delete Entity");
		configurationPage.setTestLogger(test);
		configurationPage.DeleteEntity();
	}

	/***
	 *
	 * Test Mac Ticket 81
	 */

	@Test(priority = 15)
	public void ToggleOnOff1() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(2));
		Thread.sleep(Constants.SleepWaitTime);
		driver.switchTo().window(tabs.get(3));

		test = report.createTest("Mac_81 Check Pop up when Toggle is off ");
		configurationPage.setTestLogger(test);
		configurationPage.ToggleOnOff();
	}

	@Test(priority = 16)
	public void CallingFromGenesysCloud11() throws Exception {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(2));

		driver.navigate().refresh();

		Thread.sleep(Constants.SleepWaitTime);

		ChromeOptions chromeOptions = new ChromeOptions();

		driver.switchTo().alert().accept();
		chromeOptions.addArguments("use-fake-ui-for-media-stream");
		chromeOptions.addArguments("use-fake-device-for-media-stream");

		test = report.createTest("Verifying Calling From Genesys Cloud");
		genesysCloudPage.setTestLogger(test);
		genesysCloudPage.CallingFromGenesysCloud();

		driver.switchTo().window(tabs.get(2));

	}

	@Test(priority = 17)

	public void NewSessionTemplate1() throws Exception {

		test = report.createTest("Mac81 Verifying New Session Template Title");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.NewSessionTemplate();

	}

	@Test(priority = 18)								

	public void EndCall2() throws Exception {

		test = report.createTest("End Call");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.EndCall();

	}

	/***
	 *
	 * Delete Queue
	 */

//	@Test(priority = 19)
	public void DeleteQueue() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));

		test = report.createTest("Delete Queue ");
		configurationPage.setTestLogger(test);
		configurationPage.DeleteQueue();
	}

	@Test(priority = 20)
	public void SearchSession() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

//		driver.switchTo().window(tabs.get(2));
//		Thread.sleep(Constants.SleepWaitTime);
		driver.switchTo().window(tabs.get(3));

		test = report.createTest("Mac 89 Search Session Template  ");
		configurationPage.setTestLogger(test);
		configurationPage.SearchSession();
	}

	@Test(priority = 21)
	public void ToggleOnOffActivitiFieldMaping() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(3));

		test = report.createTest("Toggle on off");
		configurationPage.setTestLogger(test);
		configurationPage.ToggleOnOffActivitiFieldMaping();
	}

	/***
	 *
	 * Mac 95
	 */

	@Test(priority = 22)
	public void CallingFromGenesysCloud2() throws Exception {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(2));

		driver.navigate().refresh();
		Thread.sleep(Constants.SleepWaitTime);

		ChromeOptions chromeOptions = new ChromeOptions();

		driver.switchTo().alert().accept();
		chromeOptions.addArguments("use-fake-ui-for-media-stream");
		chromeOptions.addArguments("use-fake-device-for-media-stream");

		driver.switchTo().window(tabs.get(1));

		test = report.createTest("Verifying Calling From Genesys Cloud");
		genesysCloudPage.setTestLogger(test);
		genesysCloudPage.CallingFromGenesysCloud();

		driver.switchTo().window(tabs.get(2));

	}

	/*** 
	 *
	 * Recieve Call / New Session Template
	 */

	@Test(priority = 23)

	public void NewSessionTemplate3() throws Exception {

		test = report.createTest("Mac_95 Verifying New Session Template Title");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.NewSessionTemplate();
		Thread.sleep(Constants.SleepWaitTime2);

	}


	@Test(priority = 24)

	public void DashboardName() throws Exception {

		test = report.createTest("Mac_95 Verifying Dashboard Title");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.DashboardName();
		Thread.sleep(Constants.SleepWaitTime2);

	}
	
	@Test(priority = 25)

	public void DefaultSession() throws Exception {

		test = report.createTest("Change Session to Default");
		configurationPage.setTestLogger(test);
		configurationPage.DefaultSession();
		Thread.sleep(Constants.SleepWaitTime2);
	}
	
	@Test(priority = 26)

	public void SearchAndScreenPop() throws Exception {

		test = report.createTest("Mac_167 Verifying Dashboard Title");
		configurationPage.setTestLogger(test);
		configurationPage.SearchAndScreenPop();
		Thread.sleep(Constants.SleepWaitTime2);
	}
	
	@Test(priority = 27)
	public void CallingFromGenesysCloud3() throws Exception {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

		test = report.createTest("Verifying Calling From Genesys Cloud");
		genesysCloudPage.setTestLogger(test);
		genesysCloudPage.CallingFromGenesysCloud();

		driver.switchTo().window(tabs.get(2));

	}

	@Test(priority = 28)

	public void NewSessionTemplate2() throws Exception {
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));


		test = report.createTest("Mac_167 Verifying Dashboard Title");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.NewSessionTemplate();
		Thread.sleep(Constants.SleepWaitTime2);

	}
	
	@Test(priority = 29)

	public void EndCall3() throws Exception {

		test = report.createTest("End Call");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.EndCall();

	}
	
	/*** 
	 *
	 * Recieve Call / New Session Template
	 */

	@Test(priority = 30)

	public void CollapseButton() throws Exception {

		test = report.createTest("Mac_137 Verifying collapse Button Functionality");
		configurationPage.setTestLogger(test);
		configurationPage.CollapseButton();
		Thread.sleep(Constants.SleepWaitTime2);

	}
	

	@Test(priority = 31)
	public void CallingFromGenesysCloud4() throws Exception {

		test = report.createTest("Verifying Calling From Genesys Cloud");
		genesysCloudPage.setTestLogger(test);
		genesysCloudPage.CallingFromGenesysCloud();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));

	}

	/***
	 *
	 * Recieve Call / New Session Template
	 */

	@Test(priority = 32)

	public void RecordSessionTemplate() throws Exception {

		test = report.createTest("Mac_147 Verifying Record Session Template Title");
		customerServiceWorkspacePage.setTestLogger(test);
		customerServiceWorkspacePage.RecordSessionTemplate();
		Thread.sleep(Constants.SleepWaitTime2);

	}

	/***
	 *
	 * Close Browser & Application
	 */

	@org.testng.annotations.AfterClass(groups = { "CommonTest" })
	public void tearDown() {
		test = report.createTest("Application Close -TestCase");
		driver.quit();
		test.log(Status.PASS, "Close the Browser Successfully ");
		try {
			report.flush();

		} catch (Exception e) {
		}
	}
}
