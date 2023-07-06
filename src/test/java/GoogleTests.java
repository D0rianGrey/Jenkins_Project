import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @BeforeEach
    void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setAcceptInsecureCerts(true);
        Configuration.browserCapabilities = capabilities;
        Configuration.screenshots = true;
        Configuration.webdriverLogsEnabled = true;
        Configuration.headless = true;
    }

    @Test
    void test() {
        open("https://www.google.com");
    }
}
