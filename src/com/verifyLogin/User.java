package com.verifyLogin;

import java.io.File;
import java.util.Scanner;


public class User {


    private static Scanner x;


    /**
     */
    public static void verifyLogin(String username, String password){
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";
        String filepath = "C:\\Java StudentWork pt1\\IntroJava\\workspace\\jardle\\src\\com\\verifyLogin\\users.txt";

        // try-catch for dealing w file handling
        try {
            // this scanner reads the txt doc and defines how to read the file (un & pwd separated by comma)

            x = new Scanner (new File(filepath));
            x.useDelimiter("[,\n]");

            // read txt doc to look for username and password
            while(x.hasNext() && !found){
//                System.out.println(tempPassword);
//                System.out.println(tempUsername);
                tempUsername = x.next();
                tempPassword = x.next();
                System.out.println(tempPassword);
                System.out.println(tempUsername);

                    if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                    found = true;
                }
            }
            x.close();
            System.out.println("found");
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }

}
