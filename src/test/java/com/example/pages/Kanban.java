package com.example.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Kanban {
    private Page page;
    private Locator param1;
    private Locator param2;
    private Locator param3;

    // Construtor para inicializar a página e os elementos
    public Kanban(Page page) {
        this.page = page;
        this.param1 = page.locator("");
        this.param2 = page.locator("");
        this.param3 = page.locator("");
    }

    // Método para realizar o login
    public void metodA(String variable1, String variable2) {
        param1.fill(variable1);
        param2.fill(variable2);
        param3.click();
    }

    // Método para verificar se o login falhou
    public boolean metodB() {
        Locator errorMessage = page.locator(".error-message");
        return errorMessage.isVisible();
    }
}
