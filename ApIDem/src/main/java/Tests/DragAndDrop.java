package Tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {

    @Test
    public void DragDropTest() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

        WebElement dragElement1 = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

        dragDropAction(dragElement1,644,577);

        String result = driver.findElement(By.id("io.appium.android.apis:id/drag_text")).getText();
        Assert.assertEquals(result, "Dot : io.appium.android.apis.view.DraggableDot{9d52915 VFED..CL. ...P..I. 0,145-434,579 #7f09007b app:id/drag_dot_1}");
    }
}