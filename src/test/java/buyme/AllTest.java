package buyme;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllTest extends TestBase {

    @Test
    public void loginTest (){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.login("buyme.sveta@gmail.com", "123456");
        Assert.assertTrue("Not logged in!", landingPage.isLoggedIn());
        System.out.println("");
    }

    @Test
    public void registrationTest (){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.registration("Sveta", "sveta7777777@gmail.com", "PassWord1");
    }
}