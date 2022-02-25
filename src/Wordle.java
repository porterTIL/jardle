import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordle {
    String secretWord;
    String [] userGuesses = new String[5];

    Wordle(){
        System.out.println("To play wordle: enter a five letter word. Hit enter to continue");
        try {
            Scanner generateWord = new Scanner(new File("C:\\StudentWork\\IntmJ\\workspace\\jardle\\src\\en_dictionary.csv")).useDelimiter(",");
            secretWord = generateWord.next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (int tries = 0; tries < 6; tries++) {
            Scanner userInput = new Scanner(System.in);
            String userTry = userInput.nextLine();
            if ( userTry.length() != 5 ){
                System.out.println("Valid words are exactly 5 characters long");
                System.out.println("Try has not counted");
                tries--;
                continue;
            }
            if (userTry.equals(secretWord)){
                System.out.println("You win");
                return;
            }
            System.out.println("You entered string: " + userTry);
        }
    }
}