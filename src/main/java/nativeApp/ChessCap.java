package nativeApp;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChessCap {
	
	public static AndroidDriver<AndroidElement> cap() throws MalformedURLException {
		
		 DesiredCapabilities dc = new DesiredCapabilities();

		 // Set the device name (you can replace "cy" with the actual device name if needed)
		   
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME, "cy");

		 // Specify the platform as Android
		    
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		 // Set the app package name (this is the package for the Chess app)
		  
		 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "uk.co.aifactory.chessfree");

		 // Set the app's main activity to launch
		  
		 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "uk.co.aifactory.chessfree.ChessFreeActivity");

		 // Initialize the AndroidDriver with the Appium server's URL and the desired capabilities
		  
		 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);

		 // Return the initialized driver
		   
		 return driver;
		 
	}
}
