package com.verifyLogin;

import java.util.Scanner;

public class UserDriver {
    private static Scanner x;

    public static void main(String[] args) {
        String username = "Amy123";
        String password = "password";
        String filepath = "C:\\Java StudentWork pt1\\IntroJava\\workspace\\jardle\\src\\com\\verifyLogin\\users.txt";

        User.verifyLogin(username, password);
    }
}
