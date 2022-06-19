package com.devzion.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ZionPages {
    ElementsCollection header = $$(".t199__menu div");
    ElementsCollection benefitsList = $$(".t497__container div");
    SelenideElement mainPagePreview = $(".t181__wrapper");
    SelenideElement findQaAtList = $("[field=li_title__1607676328331]");
    SelenideElement description = $(".t032__descr.t-descr.t-descr_lg");


    public ZionPages openMainPage(){
        open("https://devzion.com");
        return this;
    }

    public ZionPages mainPageTextCheck(String previewText) {
        mainPagePreview.shouldHave(text(previewText));
        return this;
    }

    public ZionPages clickLinkAtHeader(String page){
        header.find(text(page)).$("a").click();
        return this;
    }

    public ZionPages clickPositionAtList(){
        findQaAtList.click();
        switchTo().window(1);
        return this;
    }

    public ZionPages checkDescription(String desc){
        description.shouldHave(text(desc)).shouldBe(visible);
        return this;
    }

    public ZionPages checkBenefits(String benefit){
        benefitsList.find(text(benefit)).$(".t497__name").shouldHave(text(benefit)).shouldBe(visible);
        return this;
    }
}
