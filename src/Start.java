public class Start {
    public static final String ANSI_YELLOW_LETTER = "\u001B[33m";
    public static final String ANSI_GREEN_LETTER = "\u001B[32m";
    public static final String ANSI_RED_LETTER = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void title() {
        System.out.println("       _               _ _      ");
        System.out.println("      | |             | | |     ");
        System.out.println("      | | __ _ _ __ __| | | ___ ");
        System.out.println("  _   | |/ _` | '__/ _` | |/ _ ");
        System.out.println(" | |__| | (_| | | | (_| | |  __/");
        System.out.println("  \\____/ \\__,_|_|  \\__,_|_|\\___|");
    }

    // TODO: add a delay before printing next instruction
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
        } catch(InterruptedException e) {}
    }

    // TODO: hit any key to start new game
    static void newGame() {
        Game.enterDungeon();
    }
}
