package com.example.page_object;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {
    private Page page;
    private Locator field1;
    private Locator field2;
    private Locator button;

    // Construtor para inicializar a página e os elementos
    public HomePage(Page page) {
        this.page = page;
        this.field1 = page.locator("");
        this.field2 = page.locator("");
        this.button = page.locator("");
    }

    // Método para realizar o login
    public void toDo(String variable1, String variable2) {
        field1.fill(variable1);
        field2.fill(variable2);
        HomePage.this.button.click();
    }

    // Método para verificar se o login falhou
    public boolean isLoginErrorVisible() {
        Locator errorMessage = page.locator(".error-message");
        return errorMessage.isVisible();
    }
}
