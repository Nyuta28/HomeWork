package HomeWork24.TestListeneOnFailure;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void doWrongLogin(){
        driver.findElement(By.id("NoIdElement")).sendKeys("test@test.com");
    }

    @Test
    public void doWrongLogin2(){
        driver.findElement(By.id("NoIdElement")).sendKeys("test@test.com");
    }

    @Test
    public void loginLoaded(){
        String titleText = driver.findElement(By.className("h000-mktg")).getText();

        System.out.println(titleText);
    }
}
