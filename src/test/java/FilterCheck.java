import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.ScreenShooter;
import extensions.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@Listeners({ ScreenShooter.class })
public class FilterCheck {
    @Test()
    public void searchbook() throws InterruptedException {

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        //Configuration.holdBrowserOpen = true;
        //open Trendyol
        open("http://www.trendyol.com/");
        Thread.sleep(5000);
        $(".fancybox-item.fancybox-close").click();

        Thread.sleep(5000);
        //search Sateen
        $(".search-box-container").find(".search-box").sendKeys("Sateen");
        Thread.sleep(5000);
        $(".search-box-container").find(".search-icon").click();

        //Filter man
        $$(".fltr-item-wrppr").findBy(text("Erkek")).click();
        //Thread.sleep(6000);
        //List a = $$(".prdct-desc-cntnr-name");
        List<SelenideElement> titles =  $$(".prdct-desc-cntnr-name");
        for(SelenideElement element : titles)
        {
            Assert.assertFalse(element.text().contains("Kadın"),"Erkek filtresinde kadın ürünü olmamalı.");
        }



    }
}
