package org.example;

import org.exceptions.WrongLoginException;
import org.exceptions.WrongPasswordException;

public class Parameter {
    private String login;
    private String password;
    private String confirmPassword;

    public Parameter(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void parameter(String login, String password, String confirmPassword){
        if (login.length() > 20){
            throw new WrongLoginException("Логин должен быть не более 20 сиволов");
        }
        if (password.length() > 20){
            throw new WrongPasswordException("Пароль должен быть не более 20 символов");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
