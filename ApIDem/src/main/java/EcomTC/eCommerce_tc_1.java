package EcomTC;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerce_tc_1 extends BaseTestEcom {

    @Test
    public void FillForm() throws InterruptedException {

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        /*WebElement toast2 = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please enter your name\"]"));
        String actualToast = toast2.getText();
        Assert.assertEquals(actualToast, "Please enter your name");*/

        String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");

        Assert.assertEquals(toast, "Please enter your name");

        /*driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Customer");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();

        driver.findElement(AppiumBy.
                androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
*/
        Thread.sleep(3000);

    }

}
