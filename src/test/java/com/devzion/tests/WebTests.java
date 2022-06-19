package com.devzion.tests;

import com.devzion.pages.ZionPages;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.step;


public class WebTests extends TestBase {
    ZionPages zionPages = new ZionPages();
    String mainPagePreview = "Enterprise Software Development";
    String careerAtHeader = "Career";
    String teamAtHeader = "Team";
    String checkTextOnQaPage = "Support of automated functional and regression testing";


    @Test
    @DisplayName("Checking the text on the main page")
    @Severity(SeverityLevel.TRIVIAL)
    @Owner("valendr1")
    void checkZionMainPageTest() {
        step("Checking the text on the main page", () -> {
            zionPages.mainPageTextCheck(mainPagePreview);
        });

    }

    @Test
    @DisplayName("Check QA At Career Page")
    @Severity(SeverityLevel.TRIVIAL)
    @Owner("valendr1")
    void checkQaAtCareerPageTest() {
        step("Click career at header", () -> {
            zionPages.clickLinkAtHeader(careerAtHeader);
        });
        step("Click QA at list", () -> {
            zionPages.clickPositionAtList();
        });

        step("Checking for text in the description", () -> {
            zionPages.checkDescription(checkTextOnQaPage);
        });
    }

    @ParameterizedTest(name = "Checking the Benefit {0} in the List")
    @ValueSource(strings = {
            "Education",
            "Dedicated Team",
            "Healthcare",
            "Sports"
    })
    @Severity(SeverityLevel.TRIVIAL)
    @Owner("valendr1")
    void checkWhyAreWeChooseZionTest(String benefits) {
        step("Click team at header", () -> {
            zionPages.clickLinkAtHeader(teamAtHeader);
        });

        step("Checking the Benefit" + benefits +" in the List", () -> {
            zionPages.checkBenefits(benefits);
        });

    }


}
