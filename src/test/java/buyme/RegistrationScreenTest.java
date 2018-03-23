package buyme;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationScreenTest extends TestBase {

    @Test
    //buyme.sveta@gmail.com
    public void titleTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.navigate().to("https://buyme.co.il");
        WebElement registrationBtn = driver.findElement(By.cssSelector("li.top-bar-item.my-account span.seperator-link"));
        wait.until(driver -> registrationBtn.isDisplayed());
        Thread.sleep(3000);
        registrationBtn.click();
        WebElement register = driver.findElement(By.cssSelector("span.header-link.bold"));
        wait.until(driver -> register.isEnabled());
        register.click();
        WebElement name = driver.findElement(By.cssSelector("input[placeholder='שם פרטי']"));
        name.sendKeys("sveta");
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='מייל']"));
        email.sendKeys("buyme.sveta@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder='סיסמה']"));
        password.sendKeys("123456");
        WebElement passwordAgain = driver.findElement(By.cssSelector("input[placeholder='אימות סיסמה']"));
        passwordAgain.sendKeys("123456");
        WebElement checkBox = driver.findElement(By.cssSelector("div#register-block > form > div:nth-child(5) label"));
        checkBox.click();
        WebElement completeReg = driver.findElement(By.cssSelector("button.db.fluid.btn.btn-theme"));
        completeReg.click();
        System.out.println("");
    }
}