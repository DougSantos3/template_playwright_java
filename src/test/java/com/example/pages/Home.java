package com.example.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Home {

    private Page page;
    private Locator acceptAllCookie;
    private Locator rejectAllCookie;
    private Locator managePreferences;
    private Locator closeCookie;
    private Locator buttonLoginIn;

    // Construtor para inicializar a página e os elementos
    public Home(Page page) {
        this.page = page;
        this.acceptAllCookie = page.locator("button[id='onetrust-accept-btn-handler']");
        this.rejectAllCookie = page.locator("button[id='onetrust-reject-all-handler']");
        this.managePreferences = page.locator("button[id='onetrust-pc-btn-handler']");
        this.closeCookie = page.locator("button[class*='onetrus'");
        this.buttonLoginIn = page.locator("a[data-uuid*='login']");
    }

    // Método para realizar o login
    public void toDo(String variable1, String variable2) {
        acceptAllCookie.fill(variable1);
        managePreferences.fill(variable2);
        Home.this.buttonLoginIn.click();
    }

    // Método para verificar se o login falhou
    public boolean isLoginErrorVisible() {
        Locator errorMessage = page.locator(".error-message");
        return errorMessage.isVisible();
    }
}
