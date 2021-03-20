import com.codeborne.selenide.Configuration;


public class BasePage {
    public BasePage() {
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        //Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
    }
}

