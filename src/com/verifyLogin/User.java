package com.verifyLogin;

import java.io.File;
import java.util.Scanner;

public class User {

    public static void verifyLogin(){
        boolean verified = false;
        String dbUsername;
        String dbPassword;
        String filepath = "C:\\Java StudentWork pt1\\IntroJava\\workspace\\jardle\\src\\com\\verifyLogin\\users.txt";

        // scanner for entering user input for username and password
        Scanner fetchUsername = new Scanner(System.in);
        System.out.println("Enter your username.");
        String username = fetchUsername.next();

        Scanner fetchPwd = new Scanner(System.in);
        System.out.println("Enter password.");
        String password = fetchPwd.next();

        // try-catch for dealing w file handling
        try {
        // this scanner reads the txt doc and defines how to read the file (un & pwd separated by comma)
            Scanner passwordFile = new Scanner(new File(filepath));
            // tells scanner that each field is separated by comma
            passwordFile.useDelimiter("[,\n]");

            // read txt doc to look for username and password
            while(passwordFile.hasNext() && !verified){
                dbUsername = passwordFile.next();
                dbPassword = passwordFile.next();

                    // reads records in txt file,
                    if(dbUsername.trim().equals(username.trim()) && dbPassword.trim().equals(password.trim())){
                    verified = true;
                }
            }
            passwordFile.close();
            System.out.println(verified);
            // if statement to handle wrong login info, prompts user to exit or try again
            if(!verified){
                System.out.println("Wrong username or password. Press 'q' to exit or 'c' to try again");
                while(true){
                    Scanner errorScanner = new Scanner(System.in);
                    String userInput = errorScanner.next();
                    if (userInput.equals("c")){
                        verifyLogin();
                    }
                    if (userInput.equals("q")){
                        System.exit(0);
                    }
                   if (!userInput.equals("c") && !userInput.equals("q")){
                        System.out.println("Invalid input. Wrong username or password. Press 'q' to exit or 'c' to try again");
                        errorScanner.close();
                    }
                }
            }
        }
        // if exception, stacktrace will retrace to find where exception was thrown in class structure
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
