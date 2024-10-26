package dataproviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import util.JsonReaderUtility;

public class Dataprovider {
	
	@DataProvider (name = "suiteDataProvider")
	public static Object[] getData(Method method)  {
		String testName = method.getName();
		String dataFilePath = System.getProperty("user.dir")+"/src/test/resources/SuiteTestData.json";						
		return JsonReaderUtility.readFile(dataFilePath, testName);
				
	}

}
