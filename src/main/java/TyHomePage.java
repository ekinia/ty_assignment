import com.codeborne.selenide.*;
import org.openqa.selenium.Keys;
import java.util.List;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class TyHomePage extends BasePage {

    private List<SelenideElement> listResult = $$(".prdct-desc-cntnr-name");
    private SelenideElement txtSearch = $(".search-box-container").find(".search-box");
    private SelenideElement btnClosePopup = $(".fancybox-item.fancybox-close");
    private SelenideElement chkFilterMan = $$(".fltr-item-wrppr").findBy(text("Erkek"));
    private SelenideElement lblDescription = $(".dscrptn");
    public TyHomePage(){
        open("http://www.trendyol.com/");
    }

    public void clickClosePopup() {
        btnClosePopup.click();
    }
    public void setSearchText(String searchText) {
        txtSearch.sendKeys(searchText);
        txtSearch.sendKeys(Keys.ENTER);
    }
    public void clickFilterMan() {
        chkFilterMan.click();
    }
    public List<SelenideElement> getListResult() {
        return listResult;
    }
    public void clickDescription() {
        lblDescription.doubleClick();
    }
    public void wait(int millisecond) throws InterruptedException {
        Thread.sleep(millisecond);
    }
}