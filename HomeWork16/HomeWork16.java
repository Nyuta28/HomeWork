package HomeWork16;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class HomeWork16 {

    public static String browser = "chrome";
    public static WebDriver driver;
    public static String model = "Lenovo";
    public static String name = "Sorry";
    public static String phone = "931106818";
    public static String email = "pro14@codecademy.com";
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

        driver.manage().window().maximize();


        driver.get("https://allo.ua/");
        TimeUnit.SECONDS.sleep(6);


        driver.findElement(By.id("search-form__input")).sendKeys(model);

        driver.findElement(By.xpath("//*[@id=\"header-mega-menu\"]/div[1]/div/div[1]/div[3]/div/ul/li[4]/div/div/form/button[2]")).click();

        TimeUnit.SECONDS.sleep(5);

        driver.findElement(By.xpath("//*[@id=\"label-id-666265\"]")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("buy-button_666265")).click();

        Thread.sleep(4000);

        driver.findElement(By.className("order-now")).click();

        driver.findElement(By.id("onepage-customer-name")).sendKeys(name);
        driver.findElement(By.id("onepage-customer-telephone")).sendKeys(phone);
        driver.findElement(By.id("onepage-customer-email")).sendKeys(email);
        driver.findElement(By.id("second-step-button")).click();

        Thread.sleep(8000);
        driver.findElement(By.className("onepage_order_select")).click();
        Thread.sleep(4000);
        driver.findElement(By.className("custom_select_list")).findElements(By.tagName("li")).get(0).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath(xPathNovaPoshtaSelect)).click();
        Thread.sleep(4000);
        driver.findElement(By.className("custom_select_list")).findElements(By.tagName("li")).get(0).click();


        Thread.sleep(4000);
        driver.findElements(By.className("custom_select_field")).get(2).click();
        Thread.sleep(4000);
        driver.findElements(By.className("custom_select_field")).get(2).findElements(By.tagName("li")).get(2).click();
        Thread.sleep(4000);


        driver.findElement(By.id("submit-order")).click();

        String titleOfThePage = driver.getTitle();
        System.out.println("Title of the page is: " + titleOfThePage);


    }
}
