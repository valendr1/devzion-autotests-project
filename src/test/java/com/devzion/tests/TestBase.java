package com.devzion.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import com.devzion.config.CredentialsConfig;
import com.devzion.helpers.Attach;
import com.devzion.pages.ZionPages;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;


import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    ZionPages zionPages = new ZionPages();

    static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
    static String login = config.login();
    static String password = config.password();
    static String selenoidSign = "https://" + login + ":" + password + "@selenoid.autotests.cloud/wd/hub";

    @BeforeAll
    static void startup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        String chooseBrowser = System.getProperty("chooseBrowser", "chrome");
        String setBrowserSize = System.getProperty("setBrowserSize", "1920x1080");
        Configuration.browser = chooseBrowser;
        Configuration.browserSize = setBrowserSize;

        Configuration.remote = selenoidSign;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        System.out.println(chooseBrowser);
        System.out.println(setBrowserSize);

    }

    @BeforeEach
    public void openMainPage() {
        zionPages.openMainPage();
    }

    @AfterEach
    public void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}