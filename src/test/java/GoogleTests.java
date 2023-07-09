import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

//    @BeforeEach
//    void setUp() {
//        String chromeDriverPath = System.getenv("CHROMEDRIVER_PATH");
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
////        DesiredCapabilities capabilities = new DesiredCapabilities();
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--disable-dev-shm-usage");
////        options.addArguments("--start-maximized");
////        options.addArguments("--no-sandbox");
////        options.addArguments("disable-infobars");
////        options.addArguments("--disable-extensions");
////        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
////        capabilities.setAcceptInsecureCerts(true);
////        Configuration.browserCapabilities = capabilities;
////        Configuration.screenshots = true;
////        Configuration.webdriverLogsEnabled = true;
////        Configuration.headless = true;
////        Configuration.browser = "chrome";
//        ChromeOptions options = new ChromeOptions();
//        options.addArgument("--disable-gpu");
//        options.addArgument("--no-sandbox");
//        options.setBinary(chromeDriverPath);
//        ChromeDriver driver = new ChromeDriver(options);
//    }
//
//    @Test
//    void test1() {
////        open("https://www.google.com");
//
//    }

    @Test
    void test() {
//        String chromeDriverPath = System.getenv("CHROMEDRIVER_PATH");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-gpu");
//        options.addArguments("--no-sandbox");
//        options.setBinary(chromeDriverPath);
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        ChromeDriver driver = new ChromeDriver(options);
//        driver.get("https://www.google.com");
//        System.setProperty("GOOGLE_CHROME_BIN", "/app/.apt/usr/bin/google-chrome");
//        System.setProperty("CHROMEDRIVER_PATH", "/app/.chromedriver/bin/chromedriver");
//        String chromeDriverPath = System.getenv("CHROMEDRIVER_PATH");
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        Configuration.browser = "chrome";
//        Configuration.headless = true;
//        open("https://www.google.com");

        String chromeDriverPath = System.getenv("CHROMEDRIVER_PATH");
        String chromeChromeBinary = System.getenv("GOOGLE_CHROME_BIN");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-dev-shm-usage");
        options.setBinary(chromeChromeBinary);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        Configuration.browserCapabilities = options;
        open("https://www.google.com");
    }
}
