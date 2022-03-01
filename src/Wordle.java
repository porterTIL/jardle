import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract public class Wordle {

    // return true if passed, false if fail
    // TODO: add difficulty as parameter
    public static boolean miniGame(){
        String secretWord = null;

        // TODO: implement userGuesses so that box colors of each guess will be displayed in chart at round conclusion
        String[] userGuesses = new String[5];

        // may need refactor if we begin to experience bottleneck as dictionary file grows
        List<String> words = new ArrayList<>(); // stores all words from our dictionary file so that we can easily grab random word
       try {
               // TODO: the filePath for the fileReader is not consistent across systems
               Scanner wordList = new Scanner(new FileReader("jardle/src/en_dictionary.csv"));

               while (wordList.hasNext()) {                    // loop through dictionary and add all words to ArrayList
                   secretWord = wordList.next();
                   words.add(secretWord);
               }
               String[] array = words.toArray(new String[0]); // convert dictionary ArrayList to a fixed array
               secretWord = array[(int) (Math.random() * array.length)]; // get a secret word to act as solution from our array

           } catch (FileNotFoundException e) {
               e.printStackTrace();
           System.out.println("Fatal error: dictionary file not found.");
           System.exit(1);
           }

           for (int tries = 0; tries < 6; tries++) { // player gets 6 tries to guess the given word

               Scanner userInput = new Scanner(System.in); // create scanner to take player input
               String userTry = userInput.nextLine(); // read line from scanner to compare against the secret word

               // test validity of user input
               // TODO: on more difficult levels the word may be longer
               // TODO: make sure that userTry is a word in the library
               if (userTry.length() != 5) {            // user try must be x characters long
                   System.out.println("Valid words are exactly 5 characters long");
                   System.out.println("Try has not counted");
                   tries--;                            //  decrement number of tries, offsetting the loop iteration, because the input was invalid
                   continue;                           // run loop again
               }
               // win logic
               if (userTry.equalsIgnoreCase(secretWord)) {    // the user input can be upper or lower case
                   // TODO: implement more logic for win scenario - provide data about battle and overall character state; add win screen
                   System.out.println("You win");
                   return true;
               }
               // lose logic
               if (tries == 5) { // upon failing the fifth try, decrement health and give a new puzzle
                   System.out.println("Health damaged, new word selected. Try again");
                   return false;
               }
               // logic to continue guessing word
               // TODO: provide feedback to userInput by coloring letters
               System.out.println("You entered string: " + userTry);
           }
          return false;
    }
}