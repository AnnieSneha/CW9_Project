//const { expect } = require("chai");

describe('Chess APP Test Suite', () => {


    it.only('Test Script 1',async () => {

        // Initial Pause for the App to Load
        
        await driver.pause(5000);

        // Click OK to Start

        const okButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/YesButton")');

        await okButton.click();

        // Click Play Button

        const playButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/ButtonPlay")');

        await playButton.click(); 

        // Close Promotions

        await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/CrossProm_ExitButton")').click();

        await driver.pause(5000);

        // Select Difficulty Level

        const easyButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/EasyButton")');

        await easyButton.waitForDisplayed({ timeout: 5000 });

        await easyButton.click();

        await expect(easyButton).toBeExisting();

        // Select to Play as White
        
        const whiteOption = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/PlayAsWhite")');
       
        await whiteOption.click();

        // Select Tutor and Danger Options
       
        await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Tutor0")').click();
       
        await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Danger1")').click();

        // Continue the Game
       
        const continueButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/ContinueButton")');
       
        await continueButton.click();

        // Select Advanced Mode
       
        const advancedButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Button_Advanced")');
       
        await advancedButton.click();

        // Setup Game Settings
       
        await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Mode1")').click();
       
        await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Handicap0")').click();
       
        await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/GameTimer1")').click();
       
        await advancedButton.click();

        // Start New Game
      
       const newGameButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/NewGameSettings_ContinueButton")');
      
       await newGameButton.click();

       // Confirmation and Menu Interactions
      
       await continueButton.click();  // Confirmation click
      
       await continueButton.click();
      
       const menuButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/ButtonMenu")');
      
       await menuButton.click();

       // Navigate Through Menu (Statistics, Achievements, Leaderboards)
      
       await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/menuitem998")').click();
      
       await $('android=new UiSelector().text("Statistics")').click();
      
       await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Stats_ExitButton")').click();
      
       await driver.pause(5000);
      
       await menuButton.click();
      
       await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/menuitem998")').click();
      
       await $('android=new UiSelector().text("Achievements")').click();
      
       await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/NoButton")').click();

       await menuButton.click();
      
       await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/menuitem998")').click();
      
       await $('android=new UiSelector().text("Leaderboards")').click();
      
       await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/NoButton")').click();

       // Board & Pieces Customization
      
       await menuButton.click();
      
       const optButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/menuitem999").instance(0)');
      
       await optButton.click();
      
       await $('android=new UiSelector().text("Boards & Pieces")').click();

      
      // Adjust Board, Pieces, and Background
      
      const boardRightButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Board_Right")');
      
      for (let i = 0; i < 2; i++) {
      
        await boardRightButton.click();  // Click Board Right 5 times
      
    }
      
    const piecesRightButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Pieces_Right")');
    
        for (let i = 0; i < 2; i++) {
    
        await piecesRightButton.click();  // Click Pieces Right 3 times
    
    }

       const backgroundRightButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Background_Right")');
       
       for (let i = 0; i < 2; i++) {
       
        await backgroundRightButton.click();  // Click Background Right 3 times
       
    }
       //await driver.pause(2000)
      // Switch to 3D and 2D views
       const threeDButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Graphic_3D")');
    
       await threeDButton.waitForDisplayed({ timeout: 5000 });  // Wait up to 5 seconds for the button to be displayed
    
       await threeDButton.click();
    
       const twoDButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Graphic_2D")');
    
       await twoDButton.waitForDisplayed({ timeout: 5000 }); 
   
       await twoDButton.click();

       const settingsExitButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Settings_ExitButton")');
    
       await settingsExitButton.click();
	
    // Return to Menu and Adjust Options
    // await menuButton.waitForDisplayed({ timeout: 6000 }); 
    //    await menuButton.click();
    //    await optButton.waitForDisplayed({ timeout: 5000 }); 
    //    await optButton.click();
    //    await $('android=new UiSelector().text("Options")').click();

    //    Checkbox Interactions
    //    await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Settings_CheckBox13")').click();
    //    await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/Settings_CheckBox12")').click();
    //    await settingsExitButton.click();

       //await menuButton.waitForDisplayed({ timeout: 5000 }); 
       await driver.pause(5000);
       
       await menuButton.click();
       
       const lastoptButton = await $('android=new UiSelector().description("Options")');
       
       await lastoptButton.waitForDisplayed({ timeout: 10000 });
       
       await lastoptButton.click();  
       
       // Click on 'Save Game…' and clear the save field
       
       const saveGame = await $('android=new UiSelector().text("Save Game…")');
       
       await saveGame.click();
       
     //await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/editText1")').setValue("annie");
       
       // Click the 'Save' button
       
       const saveButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/SaveButton")');
       
       await saveButton.click();
       
       // Click 'Okay' after saving
       
       const okayButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/ContinueButton")');
       
       await okayButton.click();
       
       // Go back to the menu and offer a draw
       
       await menuButton.click();
       
       await lastoptButton.click();
       
       const offerDraw = await $('android=new UiSelector().text("Offer Draw")');
       
       await offerDraw.click();
       
       // Confirm the offer draw dialog
       
       const yesButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/YesButton")');
       
       await yesButton.click();
       
       await okayButton.click();
       
       // Resign from the game
       
       await menuButton.click();
       
       await lastoptButton.click();  
       
       const resignButton = await $('android=new UiSelector().text("Resign")');
       
       await resignButton.click();
       
       await yesButton.click();
       
       // End the game and return to the main menu
       
       const endGameButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/ButtonEndGame")');
       
       await endGameButton.click();
       
       const mainMenuButton = await $('android=new UiSelector().resourceId("uk.co.aifactory.chessfree:id/MainMenu")');
       
       await mainMenuButton.click();
       
       // Navigate back and exit the app
       
       await driver.back(); // To go back
       
       await driver.pressKeyCode(4); // Press 'Back' key

   });  
        
});