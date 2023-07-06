import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    void test() {
        Configuration.headless = true;
        open("https://www.google.com");
    }
}
