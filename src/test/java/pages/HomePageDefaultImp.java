package pages;


import baseClass.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDefaultImp extends BasePage implements HomePage {


    @AndroidFindBy(id ="QR code")
    MobileElement qrButton;

    public HomePageDefaultImp(){

        PageFactory.initElements(driver,this);

    }

    public void clickOnQR() {

        qrButton.click();


    }
}
