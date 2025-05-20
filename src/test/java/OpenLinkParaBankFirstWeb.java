import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenLinkParaBankFirstWeb {
    @Test
    void LinkParaBankOpen() {
        open("https://parabank.parasoft.com/parabank/index.htm");
    }

    void LinkParaBankOpenLk1 () {
        LinkParaBankOpen();

    }
}
