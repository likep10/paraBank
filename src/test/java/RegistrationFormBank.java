import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


 public class RegistrationFormBank {
    @Test
    public void OpenLinkParaBank() {
        open("https://parabank.parasoft.com/parabank/index.htm");
    }
    @Test
    void NegativeTestRegistrationLoginFormBank () {
        OpenLinkParaBank();
        $(new ByText("Register")).click();
        $(By.name("customer.firstName")).setValue("Igor1");
        $(By.name("customer.lastName")).setValue("Kaz1");
        $(By.name("customer.address.street")).setValue("Krylova1");
        $(By.name("customer.address.city")).setValue("Nov1");
        $(By.name("customer.address.state")).setValue("Novos1");
        $(By.name("customer.address.zipCode")).setValue("1234567");
        $(By.name("customer.ssn")).setValue("0987654");
        $(By.name("customer.username")).setValue("Kryl1");
        $(By.name("customer.password")).setValue("Krylov1234");
        $("#repeatedPassword").setValue("Krylov1234");
        $("input[value='Register']").click();
        $(".error")
                .shouldHave(text("This username already exists."));

    }
    @Test
    void CorrectTestRegistrationFormBank () {
        OpenLinkParaBank();
        $(By.name("customer.firstName")).setValue("Igor");
        $(By.name("customer.lastName")).setValue("Kaz");
        $(By.name("customer.address.street")).setValue("Krylova");
        $(By.name("customer.address.city")).setValue("Nov");
        $(By.name("customer.address.state")).setValue("Novos");
        $(By.name("customer.address.zipCode")).setValue("123456");
        $(By.name("customer.ssn")).setValue("098765");
        $(By.name("customer.username")).setValue("Kryl");
        $(By.name("customer.password")).setValue("123");
        $(By.name("repeatedPassword")).setValue("123");
        $("input[value='Register']").click();
        sleep(2000);
//        $("p.error")
//                .shouldBe(visible)
//                .shouldHave(text("Please enter a username and password."));





        sleep(2000);
    }
}
