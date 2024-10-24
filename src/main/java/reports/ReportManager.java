package reports;

import com.aventstack.extentreports.ExtentTest;

public class ReportManager {
	
	private ReportManager () {}

	private static ThreadLocal<ExtentTest> extent_test = new ThreadLocal<>();
	
	public static ExtentTest getExtentTest() {
		return extent_test.get();
	}
	
	public static void setExtentTest(ExtentTest extentTest) {
		extent_test.set(extentTest);
	}

	public static void removeExtentTest() {
		extent_test.remove();
	}

}
