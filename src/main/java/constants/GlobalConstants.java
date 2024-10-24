package constants;

public class GlobalConstants {
	
private GlobalConstants() {}
	
	public static final String CONFIG = System.getProperty("user.dir")+"/src/test/resources/config.properties";
	public static final String SCREENSHOT_FOLDER = System.getProperty("user.dir")+"/Screenshots/";
	public static final String EXTENTREPORT_HTML = System.getProperty("user.dir")+"/ExtentReports/extentReports.html";
	public static final String EXTENTREPORT_CONFIG = System.getProperty("user.dir")+"/src/test/resources/extentReport.properties";

}
