package nativeApp;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class ChessTest extends ChessCap {
	
AndroidDriver<AndroidElement>driver;
	
@BeforeTest

    public void setup() throws MalformedURLException {
    
	// Initialize the driver with capabilities
    
	driver = cap();
    
    // Set implicit wait time for locating elements
    
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	@Test
	
	public void tc1() {
	    // Log that the Chess app is opened
		
	    System.out.println("Chess App is Opened");

	    // Click the "Yes" button to proceed
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/YesButton")).click();

	    // Click the "Play" button to start the game
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ButtonPlay")).click();

	    // Create an explicit wait for up to 10 seconds
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);

	    // Wait until the Continue Button is present
	    
	    MobileElement continueButton = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("uk.co.aifactory.chessfree:id/CrossProm_ExitButton")));

	    // Get the X and Y coordinates of the Continue Button
	    
	    int x = continueButton.getCenter().getX();
	    
	    int y = continueButton.getCenter().getY();

	    // Perform a tap action at the specified coordinates
	    
	    TouchAction touchAction = new TouchAction<>(driver);
	    
	    touchAction.tap(PointOption.point(x, y)).perform();

	    // Select "Easy" difficulty to start the game
	    
	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/EasyButton']")).click();

	    // Choose to play as Black
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/PlayAsBlack")).click();

	    // Decline the Tutor option
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/Tutor0")).click();

	    // Confirm "Danger" prompt and proceed
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/Danger1")).click();
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ContinueButton")).click();

	    // Continue with the new game settings
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/NewGameSettings_ContinueButton")).click();
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ContinueButton")).click();
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ContinueButton")).click();

	    // Open the menu
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ButtonMenu")).click();

	    // Activate "Tutor Mode" from the menu
	    
	    driver.findElement(MobileBy.AccessibilityId("Tutor Mode")).click();
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ContinueButton")).click();

	    // Open the menu again
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ButtonMenu")).click();

	    // Access the "More" menu options
	    
	    driver.findElement(MobileBy.xpath("(//android.widget.TextView[@content-desc='More'])[2]")).click();

	    // Open the "Boards & Pieces" settings
	    
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Boards & Pieces']")).click();

	    // Change the chessboard style by clicking the right arrow 3 times
	    
	    MobileElement boardRight = driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/Board_Right"));
	    
	    for (int i = 0; i < 3; i++) {
	    
	    	boardRight.click();
	    
	    }

	    // Change the chess pieces style by clicking the right arrow 3 times
	    
	    MobileElement piecesRight = driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/Pieces_Right"));
	    
	    for (int i = 0; i < 3; i++) {
	    
	    	piecesRight.click();
	    }

	    
	    // Change the background style by clicking the right arrow 3 times
	    
	    MobileElement backgroundRight = driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/Background_Right"));
	    
	    for (int i = 0; i < 3; i++) {
	    
	    	backgroundRight.click();
	    
	    }

	    // Exit the settings menu
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/Settings_ExitButton")).click();

	    // Open the menu again
	    
	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/ButtonMenu']")).click();

	    // Open the "Options" menu
	    
	    driver.findElement(MobileBy.AccessibilityId("Options")).click();

	    // Select "Save Game…" option
	    
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Save Game…']")).click();

	    // Clear the default game name and input a new name "annie"
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/editText1")).clear();
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/editText1")).sendKeys("annie");

	    // Hide the keyboard after entering the name
	    
	    driver.hideKeyboard();

	    // Save the game
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/SaveButton")).click();

	    // Continue after saving the game
	    
	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ContinueButton")).click();

	    // Open the menu and select "Save & Quit"
	    
	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/ButtonMenu']")).click();
	    
	    driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Save & Quit']")).click();
	}

	@Test
	
	public void tc2() {
		
       driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/YesButton")).click(); //okay
      
    	    System.out.println("Chess App is Opened");

    	    // Click the Play button
    	    
    	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/ButtonPlay")).click();

    	    // Wait up to 10 seconds for the Continue button to appear
    	    
    	    WebDriverWait wait = new WebDriverWait(driver, 10);
    	    
    	    MobileElement continueButton = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("uk.co.aifactory.chessfree:id/CrossProm_ExitButton")));

    	    // Get the location of the Continue button and tap on it
    	    
    	    int x = continueButton.getCenter().getX();
    	    
    	    int y = continueButton.getCenter().getY();
    	    
    	    TouchAction touchAction = new TouchAction(driver);
    	    
    	    touchAction.tap(PointOption.point(x, y)).perform();

    	    // Click the Multilevel button
    	    
    	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/MediumButton']")).click();

    	    // Click the Multilevel Back button
    	    
    	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/Multiplayer_Back' and @text='BACK']")).click();

    	    // Click the Load button
    	   
    	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/LoadButton']")).click();

    	    // Click the Load Back button
    	    
    	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/Load_BackButton']")).click();

    	    // Click the Achievements button
    	    
    	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/AchievementsButton']")).click();

    	    // Dismiss the NoButton alert
    	    
    	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/NoButton")).click();

    	    // Click the Leaderboards button
    	    
    	    driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='uk.co.aifactory.chessfree:id/LeaderboardsButton']")).click();

    	    // Dismiss the NoButton alert again
    	    
    	    driver.findElement(MobileBy.id("uk.co.aifactory.chessfree:id/NoButton")).click();
    	

	}
	
	@Test
	
	public void tc3() {
			
			driver.openNotifications(); 
			
			driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click(); //check
			
			driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click(); //uncheck
			
		    driver.pressKey(new KeyEvent(AndroidKey.HOME));
			
		
	}
	
	
	
	

}
