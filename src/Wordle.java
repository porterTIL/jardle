import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wordle {
    String secretWord;
    String [] userGuesses = new String[5];

    Wordle(){
        List<String> words  = new ArrayList<>();
        System.out.println("To play wordle: enter a five letter word. Hit enter to continue");
        try {
            Scanner wordList = new Scanner(new FileReader("src/en_dictionary.csv"));

            while (wordList.hasNext()) {
                secretWord = wordList.next();
                words.add(secretWord);
            }
            String[] array = words.toArray(new String[0]);
            secretWord = array[(int) (Math.random() * array.length)];

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
            if (userTry.equalsIgnoreCase(this.secretWord)){
                System.out.println("You win");
                return;
            }
            System.out.println("You entered string: " + userTry);
        }
    }
}