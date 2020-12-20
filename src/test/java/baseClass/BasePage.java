package baseClass;

import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static AppiumDriver<MobileElement> driver;



    public void launchApp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9");
        cap.setCapability("udid","8d80c858");
        cap.setCapability("deviceName","Redmi");
        cap.setCapability("appPackage","com.scandit.demoapp");
        cap.setCapability("appActivity","com.scandit.demoapp.MainActivity");

        URL url = new URL("http://127.0.0.1:4724/wd/hub");

        driver = new AndroidDriver<MobileElement>(url,cap);
        String id = driver.getSessionId().toString();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

    }

    public  void launchCameraApp() throws MalformedURLException {


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","9");
        cap.setCapability("udid","emulator-5556");
        cap.setCapability("deviceName","Redmi");
        cap.setCapability("appPackage","com.radcam.gallery");
        cap.setCapability("appActivity","com.android.gallery3d.app.GalleryActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(url,cap);
        String id = driver.getSessionId().toString();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

    }

}
