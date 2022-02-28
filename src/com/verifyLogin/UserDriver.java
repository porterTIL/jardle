package com.verifyLogin;

import java.io.File;
import java.util.Scanner;


public class UserDriver {

    private static Scanner x;

    public static void main(String[] args) {
        String username = "Amy123";
        String password = "password";
        String filepath = "users.txt";

        verifyLogin(username, password, filepath);
    }

    public static void verifyLogin(String username, String password, String filepath){
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";

        // try-catch for dealing w file handling
        try {
            // this scanner reads the txt doc and defines how to read the file (un & pwd separated by comma)
            x = new Scanner (new File(filepath));
            x.useDelimiter("[,\n]");

            // read txt doc to look for username and password
            while(x.hasNext() && !found){
                tempUsername = x.next();
                tempPassword = x.next();

                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                    found = true;
                }
            }
            x.close();
            System.out.println(found);
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }

}
