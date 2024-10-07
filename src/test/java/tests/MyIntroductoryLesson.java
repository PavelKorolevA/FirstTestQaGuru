package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class MyIntroductoryLesson {
    public String selenide = "//*[contains(@class,'gLFyf')]";
    public String search = "//*[contains(@class,'eKjLze')]";


    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        Selenide.$x(selenide).setValue("selenide").pressEnter();
        Selenide.$x(search).shouldHave(text("https://ru.selenide.org"));


    }
}
