package com.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class google_login {
    private Page page;
    private Locator usernameField;
    private Locator passwordField;
    private Locator loginButton;

    // Construtor para inicializar a página e os elementos
    public Login(Page page) {
        this.page = page;
        this.usernameField = page.locator("#username"); // Usando seletor CSS
        this.passwordField = page.locator("#password");
        this.loginButton = page.locator("#login-button");
    }

    // Método para realizar o login
    public void login(String username, String password) {
        usernameField.fill(username);
        passwordField.fill(password);
        loginButton.click();
    }

    // Método para verificar se o login falhou
    public boolean isLoginErrorVisible() {
        Locator errorMessage = page.locator(".error-message");
        return errorMessage.isVisible();
    }
}
