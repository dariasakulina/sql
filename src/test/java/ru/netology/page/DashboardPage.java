package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {
    private final SelenideElement heading = $("[data-test-id=dashboard]");

    public DashboardPage() {
        heading.shouldHave(text("Личный кабинет")).shouldBe(visible);
    }

}