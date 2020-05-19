package HomeWork19;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;



public class HomeWork19 {


    public static String browser = "chrome";
    public static WebDriver driver;
    public static String model = "Lenovo";
    public static String name = "Sorry";
//    public static String phone = "931206787";
//    public static String email = "pro19@codecademy.com";
    public static String xPathNovaPoshtaSelect = "//*[@id=\"order_entity_1\"]/div[4]/div[2]/div[2]/div";


    public static void main(String[] args) throws InterruptedException {

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        long unixTime = Instant.now().getEpochSecond();

        //1 589909316
        String phone = Long.toString(unixTime).substring(1);
        String email = "pro" +phone+ "@codecademy.com";
        driver.manage().window().maximize();

        driver.get("https://allo.ua/");

        WebDriverWait explicitWait = new WebDriverWait(driver,20);

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .withMessage("User defined timeout") //задается по надобности
                .ignoring(NoSuchElementException.class); //что именно игнорировать при поллинге

        explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("search-form__input")));
        driver.findElement(By.id("search-form__input")).sendKeys(model);

        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"search-form__submit-button search-form__submit-button--active\"]")));
        driver.findElement(By.xpath("//*[@class=\"search-form__submit-button search-form__submit-button--active\"]")).click();

        //TODO: implicit timeout not working
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"label-id-666265\"]")).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(By.name("buy-button_666265")));
        driver.findElement(By.name("buy-button_666265")).click();

        //Thread.sleep(4000);
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.className("order-now")));

        driver.findElement(By.className("order-now")).click();


        explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("onepage-customer-name")));

        driver.findElement(By.id("onepage-customer-name")).sendKeys(name);
        driver.findElement(By.id("onepage-customer-telephone")).sendKeys(phone);
        driver.findElement(By.id("onepage-customer-email")).sendKeys(email);
        driver.findElement(By.id("second-step-button")).click();

        //Thread.sleep(8000);
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.className("onepage_order_select")));

        driver.findElement(By.className("onepage_order_select")).click();
        //Thread.sleep(4000);
        driver.findElement(By.className("custom_select_list")).findElements(By.tagName("li")).get(0).click();
        //Thread.sleep(4000);

        driver.findElement(By.xpath(xPathNovaPoshtaSelect)).click();
        //Thread.sleep(44000);
        driver.findElement(By.className("custom_select_list")).findElements(By.tagName("li")).get(0).click();


        //Thread.sleep(4000);
        driver.findElements(By.className("custom_select_field")).get(2).click();
        //Thread.sleep(4000);
        driver.findElements(By.className("custom_select_field")).get(2).findElements(By.tagName("li")).get(2).click();

        //TODO: not working, ajax present
        Thread.sleep(3000);
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("submit-order")));
        driver.findElement(By.id("submit-order")).click();

        String titleOfThePage = driver.getTitle();
        System.out.println("Title of the page is: " + titleOfThePage);



    }

    
}
