package stepdefinition;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class swaglabLoginPage {
    AndroidDriver driver;

    @Given("user open the swaglab app in android")
    public void user_open_the_swaglab_app_in_android() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("29221JEGR00379");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
//        options.setApp("/Users/aravindbalaji/Documents/Appium/Sample App/android-app.apk");
        options.setAppActivity("com.swaglabsmobileapp.MainActivity");
        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppWaitForLaunch(true);
        options.setAppWaitDuration(Duration.ofMillis(50000));

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @When("user enter the user name {string}")
    public void user_enter_the_user_name(String username) {
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys(username);

    }

    @When("user enter the password {string}")
    public void user_enter_the_password(String password) {
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys(password);

    }

    @When("user click on the login button")
    public void user_click_on_the_login_button() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
    }

    @Then("user can see the dashboard")
    public void user_can_see_the_dashboard() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text=\"ADD TO CART\"]")).size()>=1);
    }

    @Then("user close the app")
    public void user_close_the_app() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
