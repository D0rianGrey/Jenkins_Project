import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    void test() {
        open("https://www.google.com");
    }
}
