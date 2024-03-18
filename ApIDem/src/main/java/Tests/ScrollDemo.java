package Tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollDemo extends BaseTest {

    @Test
    public void ScrollDemoTest() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        /*driver.findElement(AppiumBy.
        androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));*/
        //Shortcut is using Google engine script UiAutomator instead of appium ui automator

        //Appium Ui automator - needs coordinates no element data -
        /*boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        }while(canScrollMore);*/

        scrollToEndAction();
    }
}