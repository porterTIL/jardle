import java.util.Scanner;
import java.awt.Color;

public class Avatar {
    int playerHP = 3;
    String playerName;
    // String playerInventory;
    Scanner scan = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_LETTER = "\u001B[31m";
    public static final String ANSI_CYAN_LETTER = "\u001B[36m";

    public void playerStart() {
        System.out.println("Please enter your player names: ");
        playerName = scan.nextLine();
        System.out.println("Welcome " + playerName + " , to the world of\n");
        System.out.println(ANSI_CYAN_LETTER + ".----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \n" +
                "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                "| |     _____    | || |      __      | || |  _______     | || |  ________    | || |   _____      | || |  _________   | |\n" +
                "| |    |_   _|   | || |     /  \\     | || | |_   __ \\    | || | |_   ___ `.  | || |  |_   _|     | || | |_   ___  |  | |\n" +
                "| |      | |     | || |    / /\\ \\    | || |   | |__) |   | || |   | |   `. \\ | || |    | |       | || |   | |_  \\_|  | |\n" +
                "| |   _  | |     | || |   / ____ \\   | || |   |  __ /    | || |   | |    | | | || |    | |   _   | || |   |  _|  _   | |\n" +
                "| |  | |_' |     | || | _/ /    \\ \\_ | || |  _| |  \\ \\_  | || |  _| |___.' / | || |   _| |__/ |  | || |  _| |___/ |  | |\n" +
                "| |  `.___.'     | || ||____|  |____|| || | |____| |___| | || | |________.'  | || |  |________|  | || | |_________|  | |\n" +
                "| |              | || |              | || |              | || |              | || |              | || |              | |\n" +
                "| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                " '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' "
                + ANSI_RESET);
    }

    public void playerHealth() {
        playerHP = playerHP - 1;
    }

    public void deadPlayer() {
        System.out.println("You have " + ANSI_RED_LETTER + "DIED!");
        System.exit(0);
    }
}
