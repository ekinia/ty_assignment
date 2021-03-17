
import com.codeborne.selenide.*;


import static com.codeborne.selenide.Selenide.*;

public class TyHomePage extends BasePage{
    private SelenideElement searchField = $(".search-box-container").find(".search-box");
    private SelenideElement PopUpClose =$(".fancybox-item.fancybox-close");
    public void closePopUp() {
        PopUpClose.click();

    }

    //send Sateen
    public void enterSearchTerm(String text) {
        searchField.val(text).pressEnter();
    }


}