import java.util.Scanner;
import java.awt.Color;

public class Avatar {
    int playerHP = 3;
    String playerName;
    Scanner scan = new Scanner(System.in);

    public static final String ANSI_RED_LETTER = "\u001B[31m";
    public static final String ANSI_YELLOW_LETTER = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN_LETTER = "\u001B[36m";

    public void playerStart() {
        try {
            System.out.println("Please enter your player names: ");
            playerName = scan.nextLine();
            System.out.println("Welcome " + ANSI_CYAN_LETTER + playerName + ANSI_RESET + " , to the world of\n");
            Thread.sleep(3000);
            System.out.println(ANSI_YELLOW_LETTER +
                    " ▄▄▄██▀▀▀▄▄▄       ██▀███  ▓█████▄  ██▓    ▓█████ \n" +
                    "   ▒██  ▒████▄    ▓██ ▒ ██▒▒██▀ ██▌▓██▒    ▓█   ▀ \n" +
                    "   ░██  ▒██  ▀█▄  ▓██ ░▄█ ▒░██   █▌▒██░    ▒███   \n" +
                    "▓██▄██▓ ░██▄▄▄▄██ ▒██▀▀█▄  ░▓█▄   ▌▒██░    ▒▓█  ▄ \n" +
                    " ▓███▒   ▓█   ▓██▒░██▓ ▒██▒░▒████▓ ░██████▒░▒████▒\n" +
                    " ▒▓▒▒░   ▒▒   ▓▒█░░ ▒▓ ░▒▓░ ▒▒▓  ▒ ░ ▒░▓  ░░░ ▒░ ░\n" +
                    " ▒ ░▒░    ▒   ▒▒ ░  ░▒ ░ ▒░ ░ ▒  ▒ ░ ░ ▒  ░ ░ ░  ░\n" +
                    " ░ ░ ░    ░   ▒     ░░   ░  ░ ░  ░   ░ ░      ░   \n" +
                    " ░   ░        ░  ░   ░        ░        ░  ░   ░  ░\n" +
                    "                            ░                    "
                    + ANSI_RESET);

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    //Tracks player health
    public void playerHealth() {
        playerHP = playerHP - 1;
    }
    // Perma kills player if their health drops below 1
    public void deadPlayer() {
        System.out.println("You have " + ANSI_RED_LETTER + "DIED!");
        System.out.println("Welcome to Valhalla!" + ANSI_RESET);
        System.out.println(ANSI_RED_LETTER +
                "                                                         @                                                                                     @\n" +
                "                                                         @@                                                                                   @@\n" +
                "                                                         @@@                                                                                 @@@\n" +
                "                                                         @@@@                                  @@@@@@@@@@@                                  @@@@\n" +
                "                                                         @@@@@@                               @@@@     @@@@                               @@@@@@\n" +
                "                                                         @@@@@@@                             @@@@       @@@@                             @@@@@@@\n" +
                "                                                         @@@  @@@@@                   @@@@@@@@@@@       @@@@@@@@@@                    @@@@@  @@@\n" +
                "                                                         @@@     @@@@@@@@          @@@@@@    @@@@       @@@@    @@@@@@          @@@@@@@@     @@@ \n" +
                "                                                         @@@@        @@@@@@@@@@@@@@@@        @@@@       @@@@        @@@@@@@@@@@@@@@@        @@@@\n" +
                "                                                          @@@@                @@@@@          @@@@       @@@@          @@@@@                 @@@@\n" +
                "                                                           @@@@              @@@@@           @@@@       @@@@            @@@@@             @@@@\n" +
                "                                                             @@@@@         @@@@              @@@@       @@@@             @@@@         @@@@@\n" +
                "                                                               @@@@@@@@@@@@@@@               @@@@       @@@@              @@@@@@@@@@@@@@@ \n" +
                "                                                                     @@@@@@@@                @@@@       @@@@                @@@@@@@@  \n" +
                "                                                                         @@@                 @@@@       @@@@                 @@@  \n" +
                "                                                                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@ \n" +
                "                                                                      @@@                                                       @@@ \n" +
                "                                                                      @@@  @@@   @@@   @@@   @@@   @@@   @@@   @@@   @@@   @@@  @@@ \n" +
                "                                                                      @@@   @     @     @     @     @     @     @     @     @   @@@ \n" +
                "                                                                      @@@                                                       @@@\n" +
                "                                                                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "                                                                        @@@@                                                 @@@@\n" +
                "                                                                        @@@@                                                 @@@@\n" +
                "                                                                        @@@@  @@@@@@@@@@@@@@@@@@@       @@@@@@@@@@@@@@@@@@@  @@@@\n" +
                "                                                                              @@@@           @@@@       @@@@          @@@@   @@@@\n" +
                "                                                                        @@@@   @@@@         @@@@         @@@@        @@@@    @@@@ \n" +
                "                                                                        @@@@     @@@@@@@@@@@@@    @@@@@    @@@@@@@@@@@@      @@@@ \n" +
                "                                                                        @@@@                     @@@@@@@                     @@@@\n" +
                "                                                                         @@@@                  @@@@   @@@@                  @@@@\n" +
                "                                                                          @@@@@@@@            @@@@@@@@@@@@@            @@@@@@@@\n" +
                "                                                                             @@@@@@@          @@@@@@@@@@@@@          @@@@@@@ \n" +
                "                                                                                @@@@                                 @@@@\n" +
                "                                                                                @@@@    @@@    @@@    @@@@    @@@    @@@@\n" +
                "                                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n" +
                "                                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "                                                                                 @@@@   @@@    @@@    @@@@    @@@   @@@@\n" +
                "                                                                                 @@@@@                             @@@@\n" +
                "                                                                                   @@@@                           @@@@\n" +
                "                                                                                    @@@@@@     @@@@   @@@@     @@@@@\n" +
                "                                                                                       @@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "                                                                                            @@@@@@@@@@@@@@@@@@\n" +
                "                                                                                               @@@@   @@@@\n" +
                "                                                                                               @@@@   @@@@\n" +
                "                                                                                               @@@@   @@@@\n" +
                "                                                                                               @@@@   @@@@");
        System.exit(0);
    }
}
