package testCases;

import baseClass.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import pages.GalleryPage;
import pages.HomePageDefaultImp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class QrScannerTestCases extends BasePage {

    GalleryPage galleryPage;


    @BeforeClass()
    public void launchGalleryApp() throws MalformedURLException, InterruptedException {

        launchCameraApp();
        galleryPage = new GalleryPage();
        galleryPage.selectImage();
        System.out.println("BeforeClass");
    }

    @BeforeMethod()
    public void startScannerApp() throws MalformedURLException {
        launchApp();
        System.out.println("BeforeMethod");
    }


    @Test(invocationCount = 1)
    public void performAppgallery() throws InterruptedException, MalformedURLException {

        Thread.sleep(2000);

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='QR code']")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

        Thread.sleep(5000);

    }

    @AfterMethod
    public void closeScannerApp(){

        System.out.println();
        driver.quit();
    }

    @AfterClass
    public void closeApp(){
        driver.quit();
    }
}
