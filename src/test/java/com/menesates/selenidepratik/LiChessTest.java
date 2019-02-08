package com.menesates.selenidepratik;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LiChessTest {

    @BeforeClass
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        System.setProperty("selenide.browser","firefox");
    }



    @Test
    public void openLichess(){
        open("https://lichess.org/");


        // selenium da yok diyorlar
        $(byText("Play with the machine")).click();
        //$(By.name("q")).setValue("Hello World").pressEnter();
        $(By.xpath("//*[@id=\"hooks_wrap\"]/div[1]/form/div[5]/button[3]/i")).click();

    }

    /*@Test
    public void testShould(){
        open("http://google.com");

        $(By.name("q")).setValue("Hello World").pressEnter();




    }*/

}
