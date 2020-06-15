package HomeWork20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork20 {

    public static String browser = "chrome";
    public static WebDriver driver;

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

        driver.get("https://auto.ria.com/");

        //Drop-down example1
        driver.findElement(By.id("categories")).sendKeys("Мото");

        TimeUnit.SECONDS.sleep(5);

        //Drop-down example2

        driver.get("https://www.wikipedia.org/");
        WebElement dropDown = driver.findElement(By.id("searchLanguage"));
        Select select = new Select(dropDown);
        select.selectByValue("es");

        List<WebElement> values = driver.findElements(By.tagName("option"));
        System.out.println("Elements in dropdown of language: " + values.get(5).getText());

        for( int i = 0; i<values.size(); i++){
            System.out.println(values.get(i).getAttribute("lang"));
        }

        TimeUnit.SECONDS.sleep(5);

        //Links
        driver.get("https://www.wikipedia.org/");
        /* List<WebElement> links =  driver.findElements(By.tagName("a"));
        System.out.println(" Total links are: " + links.size());

        for(WebElement link: links){
            System.out.println(link.getText() + "------ url's----- from wiki" + link.getAttribute("href"));
        }
        */

        WebElement blockOfCode = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
        List<WebElement> linksFroBlockOfCode = blockOfCode.findElements(By.tagName("a"));
        System.out.println("Size of block of links:" + linksFroBlockOfCode.size());

        for(WebElement link: linksFroBlockOfCode){
            System.out.println(link.getText() + " it is url " + link.getAttribute("href"));
        }
        //Checkboxes
        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
        WebElement blockOfCheckboxes =
                driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));

        List<WebElement> checkboxes = blockOfCheckboxes.findElements(By.name("sports"));
        for(WebElement checkbox: checkboxes){
            checkbox.click();
        }




    }
}
