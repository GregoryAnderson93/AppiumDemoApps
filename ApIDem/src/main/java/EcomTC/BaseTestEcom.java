package EcomTC;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeMethod;

import java.net.URL;
import java.time.Duration;

import static Infra.DriverFactory.Url;
import static Infra.DriverFactory.startAppiumServer;

public class BaseTestEcom {

        public AndroidDriver driver;
@BeforeMethod
        public void startAppium() {
        startAppiumServer();
        AppiumTest();
    }

    public void AppiumTest() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("emulator-5554");

        options.setCapability("platformName", "Android");
        options.setCapability("appium:automationName", "UIAutomator2");
        options.setCapability("appium:app", "C:\\\\Users\\\\MY PC\\\\Desktop\\\\Appium\\\\APKFiles\\\\resources//General-Store.apk");
        //options.setCapability("appium:platformVersion", "9.0");
        try {

            driver = new AndroidDriver(new URL(Url), options);
            System.out.println("Application Launch");

            //System.out.println("Below android driver");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getStackTrace());

        }
    }

    public void longPressAction(WebElement elementLongPress)
    {
        ((JavascriptExecutor)driver).executeScript
                ("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)elementLongPress).getId(),
                        "duration",2000));
    }

    public void scrollToEndAction()
    {
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        }while(canScrollMore);
    }
    public void swipeAction(WebElement firstImageElement, String direction)
    {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)firstImageElement).getId(),

                "direction", direction,
                "percent", 0.75
        ));
    }

    public void dragDropAction(WebElement dragElement, int xCoordinate, int yCoordinate)
    {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) dragElement).getId(),
                "endX", xCoordinate,
                "endY", yCoordinate
        ));
    }

}