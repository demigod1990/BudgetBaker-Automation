package drivermanager;

import org.apache.logging.log4j.spi.DefaultThreadContextMap;

import decorators.Driver;


public class DriverManager {
	
public static final ThreadLocal<Driver> threadlocal = new ThreadLocal<>();
	
	//Method to get the thread local driver. Should be used to get the driver 
	//throughout the project for parallel threads to work as expected
	public static Driver getDriver() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return threadlocal.get();	
	}
	
	// Method to set the Thread local driver. Type driver of type Driver is accepted  
	public static void setDriver(Driver driver) {
		threadlocal.set(driver);
	}
	
	// Methods to remove the driver after execution
	public static void removeDriver() {
		threadlocal.get().quit();
		threadlocal.remove();
	}

}