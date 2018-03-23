import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void titleTest() {
        driver.get("http://google.com");
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("How to get better in selenium webdriver");
        element.submit();
        String expTitle = "How to get better in selenium webdriver - חיפוש ב-Google";
        String actTitle = driver.getTitle();
        Assert.assertEquals("Title is incorrect", expTitle, actTitle);
    }
}
