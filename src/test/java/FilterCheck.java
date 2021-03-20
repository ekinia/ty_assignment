import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.List;
import static com.codeborne.selenide.Selenide.open;
@Listeners({ScreenShooter.class})
public class FilterCheck {


    TyHomePage page = new TyHomePage();
    @Test
    public void searchSateen() throws InterruptedException {

        page.clickClosePopup();
        page.setSearchText("Sateen");
        page.clickDescription();
        page.wait(3000);
        page.clickDescription();
        page.clickFilterMan();
        List<SelenideElement> titles = page.getListResult();
        for (SelenideElement element : titles) {
            Assert.assertFalse(element.text().contains("Kadın"), "Filtreleme için Erkek seçili olmasına rağmen Kadın ürünleri de listelendi.");
        }

    }
    }
