package Helper;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Properties properties = new Properties();

    @BeforeMethod
    public void setup() throws InterruptedException {
        loadProperties(); // Load properties before setting up the driver
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\SahilSubba\\Downloads\\edgeDriver\\msedgedriver.exe"); // Replace with the actual path

        driver = new EdgeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));

    }

    private void loadProperties() {

        try (FileInputStream fileInput = new FileInputStream("C:\\Users\\SahilSubba\\IdeaProjects\\test1\\config.properties")) {
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit(); // Clean up the WebDriver after all tests
        }
    }
}