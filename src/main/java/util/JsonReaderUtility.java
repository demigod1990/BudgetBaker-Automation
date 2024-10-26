package util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import logsetup.Log;

public class JsonReaderUtility {
	
	public static Object[] readFile(String filePath, String testCaseName) {
		
		HashMap<String, Object> map = null;
	    Object[][] dataObject = null;
	    
	    try {
	        // Read the entire JSON file into a map
	        map = new ObjectMapper().readValue(new File(filePath), new TypeReference<HashMap<String, Object>>() {});
	        
	        // Check if the map contains the test case data
	        if (map.containsKey(testCaseName)) {
	            // Retrieve the data for the specific test case
	            List<Map<String, String>> testDataList = (List<Map<String, String>>) map.get(testCaseName);
	            
	            // Initialize dataObject with the size of the testDataList and variable number of parameters
	            int numOfParameters = testDataList.get(0).size(); // Assume all data sets have the same number of parameters
	            dataObject = new Object[testDataList.size()][numOfParameters];
	            
	            // Fill the dataObject dynamically with all key-value pairs for each test case
	            for (int i = 0; i < testDataList.size(); i++) {
	                Map<String, String> data = testDataList.get(i);
	                int j = 0;
	                for (Map.Entry<String, String> entry : data.entrySet()) {
	                    dataObject[i][j] = entry.getValue(); // Populate each parameter dynamically
	                    j++;
	                }
	            }
	        } else {
	            Log.error("Test case name not found in the JSON file: " + testCaseName);
	        }

	    } catch (IOException e) {
	        Log.error("Reading from JSON file failed.");
	        e.printStackTrace();
	    }

	    return dataObject;
		
	}

}
