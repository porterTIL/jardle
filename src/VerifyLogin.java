package verifyLogin;

import java.io.File;
import java.util.Scanner;

public class VerifyLogin {

    private static Scanner x;

    public static void main(String[] args) {
        String username = "Amy123";
        String password = "password";
        String filepath = "members.txt";
    }

    public static void verifyLogin(String username, String password, String filepath){
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";

        try {
            x = new Scanner (new File(filepath));
            x.useDelimiter("[,\n]");

            while(x.hasNext() && !found){
                tempUsername = x.next();
                tempPassword = x.next();

                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                    found = true;
                }
            }
        }
        catch (Exception e) {

        }
    }

}
