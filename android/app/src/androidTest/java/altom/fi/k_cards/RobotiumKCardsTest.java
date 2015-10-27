package altom.fi.k_cards;

import com.robotium.solo.Solo;
import com.robotium.solo.Solo.Config;


import android.os.Environment;
import android.test.ActivityInstrumentationTestCase2;


/**
 * Created by BBC on 12/08/15.
 */
public class RobotiumKCardsTest extends ActivityInstrumentationTestCase2<Main> {

    private Solo solo;

    public RobotiumKCardsTest() {
        super(Main.class);
    }


    @Override
    public void setUp() throws Exception {
        Config config = new Config();
        config.screenshotSavePath = "/sdcard/test-screenshots/";
        System.out.println("///////////1 " + config.screenshotSavePath);
        solo = new Solo(getInstrumentation(), config);
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }


    public void est01ChangeColor() {
        System.out.println("Starting Change color test...");

        String color = "Change Color";

        solo.unlockScreen();
        assertTrue(solo.searchText("Green - New Thread"));
        solo.clickOnButton(color);

        assertTrue(solo.searchText("Yellow - Same Thread"));
        solo.clickOnButton(color);

        assertTrue(solo.searchText("Red"));
        solo.clickOnButton(color);

        assertTrue(solo.searchText("Blue"));
        solo.clickOnButton(color);
        assertTrue(solo.searchText("Green"));

        System.out.println("Change color test completed successfully.");
    }

    public void test02InfoButton() {
        System.out.println("Starting info button check... ");


        solo.clickOnButton("Info");
        solo.takeScreenshot();
        System.out.println("///////////////2 " + Environment.getExternalStorageDirectory() + "/robotium-screenshots/");

        assertTrue(solo.searchText("about the K-Cards"));
        solo.clickOnButton("OK");

        System.out.println("Info button test completed successfully");
    }

    public void test03CheckTextResize() throws Exception {
        System.out.println("starting text resize check ");
        String add = "Add Name";
        String short_text = "Short";
        String long_text = "LongerTextHere";

        solo.clickOnButton(add);
        solo.clearEditText(0);
        solo.enterText(0, short_text);
        solo.clickOnButton("Add");
        Thread.sleep(500);
        solo.takeScreenshot("01-portret-initial");


        solo.setActivityOrientation(Solo.LANDSCAPE);
        Thread.sleep(500);
        solo.takeScreenshot("02-landscape-short");
        solo.setActivityOrientation(Solo.PORTRAIT);
        Thread.sleep(500);
        solo.takeScreenshot("03-portret-after-resize");

        solo.clickOnButton(add);
        solo.clearEditText(0);
        solo.enterText(0, long_text);
        solo.clickOnButton("Add");
        Thread.sleep(500);
        solo.takeScreenshot("04-portrait-long-intial");

        solo.setActivityOrientation(Solo.LANDSCAPE);
        Thread.sleep(500);
        solo.takeScreenshot("05-landscape-long");
        solo.setActivityOrientation(Solo.PORTRAIT);
        Thread.sleep(500);
        solo.takeScreenshot("06-portrait-long-after-resize");

        System.out.println("text resize check completed successfully");
    }

}
