package buyme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class LandingPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private String url = "https://buyme.co.il";

    public LandingPage(WebDriver webDriver) {
        this.driver = webDriver;
        wait = new WebDriverWait(webDriver, 10);
    }

    //"buyme.sveta@gmail.com"
    //"123456"

    public void login(String username, String password) {
        clickLoginRegister(url);
        WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='מייל']"));
        emailField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='סיסמה']"));
        passwordField.sendKeys(password);
        WebElement completeReg = driver.findElement(By.cssSelector("button.db.fluid.btn.btn-theme"));
        completeReg.click();
    }

    public void registration(String name, String username, String password) {
        clickLoginRegister(url);
        WebElement register = driver.findElement(By.cssSelector("span.header-link.bold"));
        wait.until(driver -> register.isEnabled());
        register.click();
        WebElement nameField = driver.findElement(By.cssSelector("input[placeholder='שם פרטי']"));
        nameField.sendKeys(name);
        WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='מייל']"));
        emailField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='סיסמה']"));
        passwordField.sendKeys(password);
        WebElement passwordAgain = driver.findElement(By.cssSelector("input[placeholder='אימות סיסמה']"));
        passwordAgain.sendKeys(password);
        WebElement checkBox = driver.findElement(By.cssSelector("div#register-block > form > div:nth-child(5) label"));
        checkBox.click();
        WebElement completeReg = driver.findElement(By.cssSelector("button.db.fluid.btn.btn-theme"));
        completeReg.click();

    }

    public boolean isLoggedIn() {
        throw new NotImplementedException();
    }

    private void clickLoginRegister(String url) {
        driver.navigate().to(url);
        WebElement registrationBtn = driver.findElement(By.cssSelector("li.top-bar-item.my-account span.seperator-link"));
        wait.until(driver -> registrationBtn.isDisplayed());
        sleep(1);
        registrationBtn.click();
    }

    private void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
