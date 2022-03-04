import java.util.Scanner;

public class Start {
    public static final String ANSI_YELLOW_LETTER = "\u001B[33m";
    public static final String ANSI_GREEN_LETTER = "\u001B[32m";
    public static final String ANSI_RED_LETTER = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void printInstructions() {
        try {
            Thread.sleep(1000);
            System.out.println("Welcome to Jardle! \n");
            Thread.sleep(1000);
            System.out.println("The task is to guess the five letter word within six tries.");
            Thread.sleep(1000);
            System.out.println("The guessed letters will be either grey, " + ANSI_YELLOW_LETTER + "yellow" + ANSI_RESET
                    + ", or " + ANSI_GREEN_LETTER + "green" + ANSI_RESET + ".");
            Thread.sleep(1000);
            System.out.println(ANSI_GREEN_LETTER + "Green" + ANSI_RESET + " letters are in the correct position.");
            Thread.sleep(1000);
            System.out.println(ANSI_YELLOW_LETTER + "Yellow" + ANSI_RESET + " letters are in the word, but in the wrong place.");
            Thread.sleep(1000);
            System.out.println("Grey letters are not located within the word.");
            Thread.sleep(1000);
            System.out.println("After solving each word, follow the directions to choose the next room and monster to defeat!");
            Thread.sleep(1000);
            System.out.println("Failing to solve the word in six tries means you lose " + ANSI_RED_LETTER +
                    "(and START OVER)!" + ANSI_RESET);
            Thread.sleep(1000);
            System.out.println(ANSI_YELLOW_LETTER + "GOOD LUCK!" + ANSI_RESET);
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
    }

    public static void clearRules() {
        Scanner clear = new Scanner(System.in);
        System.out.println("Press any key and hit enter to clear rules");

        String input = clear.nextLine();
        System.out.println(System.lineSeparator().repeat(50));
    }
    static void newGame() {
        Game.enterDungeon();
    }
}
