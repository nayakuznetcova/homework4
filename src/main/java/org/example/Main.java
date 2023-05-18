package org.example;

import org.exceptions.WrongLoginException;
import org.exceptions.WrongPasswordException;

import static org.example.Parameter.parameter;

public class Main {
    public static void main(String[] args) {
        try {
            parameter("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}