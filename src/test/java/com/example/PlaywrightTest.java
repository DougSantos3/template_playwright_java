package com.example;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class PlaywrightTest {
    Playwright playwright;
    Browser browser;
    Page page;

    @BeforeEach
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @Test
    public void openGoogleHomePage() {
        page.navigate("https://www.google.com");
        Assertions.assertTrue(page.title().contains("Google"));
    }

    @AfterEach
    public void teardown() {
        browser.close();
        playwright.close();
    }
}
