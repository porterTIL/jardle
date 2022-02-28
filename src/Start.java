import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static void Title() {
        System.out.println("       _               _ _      ");
        System.out.println("      | |             | | |     ");
        System.out.println("      | | __ _ _ __ __| | | ___ ");
        System.out.println("  _   | |/ _` | '__/ _` | |/ _ ");
        System.out.println(" | |__| | (_| | | | (_| | |  __/");
        System.out.println("  \\____/ \\__,_|_|  \\__,_|_|\\___|");
    }

    //still want to put a delay between lines of instructions

    public static void printInstructions() {
        System.out.println("Welcome to Jardle!");
        System.out.println("The task is to guess the five letter word within six tries.");
        System.out.println("The guesssed letters will be either grey, yellow, or green.");
        System.out.println("Green letters are in the correct position.");
        System.out.println("Yellow letters are in the word, but in the wrong place.");
        System.out.println("Grey letters are not located within the word.");
        System.out.println("After solving each word, follow the directions to choose the next room and monster to defeat!");
        System.out.println("Failing to solve the word in six tries means you lose (and start over)!");
        System.out.println("GOOD LUCK!");
    }

    //start new game...  somehow.
    public static void startGame() {

    }
}
