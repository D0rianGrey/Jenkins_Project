import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    void test() {
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
        Configuration.headless = true;
        open("https://www.google.com");
    }
}
