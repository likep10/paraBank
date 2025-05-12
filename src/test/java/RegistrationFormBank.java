import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationFormBank {
    @Test
    void OpenLinkParaBank() {
        open("https://parabank.parasoft.com/parabank/index.htm");
        $(new ByText("Register")).click();
    }
    @Test
    void NegativeTestRegistrationFormBank () {
        OpenLinkParaBank();
        $(By.name("customer.firstName")).setValue("Igor");
        $(By.name("customer.lastName")).setValue("Kaz");
        $(By.name("customer.address.street")).setValue("Krylova");
        $(By.name("customer.address.city")).setValue("Nov");
        $(By.name("customer.address.state")).setValue("Novos");
        $(By.name("customer.address.zipCode")).setValue("123456");
        $(By.name("customer.ssn")).setValue("098765");
        $(By.name("customer.username")).setValue("Kryl");
        $(By.name("customer.password")).setValue("Krylova123");
        $(By.name("repeatedPassword")).setValue("Krylova");
        $("input.button[type='submit']").click();
        $("p.error")
                .shouldBe(visible)
                .shouldHave(text("Please enter a username and password."));





        sleep(2000);
    }
}
