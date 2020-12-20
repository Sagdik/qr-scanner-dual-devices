package pages;

import baseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class GalleryPage extends BasePage {

//    @AndroidFindBy(id ="com.android.permissioncontroller:id/continue_button")
//    MobileElement continueButton;
//
//    @AndroidFindBy(id = "android:id/button1")
//    MobileElement OkButton;
//
//    @AndroidFindBy(id ="com.radcam.gallery:id/gl_root_view")
//    MobileElement imageButton;
//
//    @AndroidFindBy(id ="com.radcam.gallery:id/gl_root_view")
//    MobileElement selectImageButton;

    public GalleryPage(){

        PageFactory.initElements(driver,this);

    }

    public void selectImage() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("android:id/button1")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("com.radcam.gallery:id/gl_root_view")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("com.radcam.gallery:id/gl_root_view")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("com.radcam.gallery:id/gl_root_view")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("com.radcam.gallery:id/gl_root_view")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(5000);



    }
}
