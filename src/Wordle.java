import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.List;

abstract public class Wordle {

    // return true if win, false if fail
    public static boolean miniGame(){
        String secretWord = null;

        // may need refactor if we begin to experience bottleneck as dictionary file grows
        List<String> words = new ArrayList<>(); // stores all words from our dictionary file so that we can easily grab random word
       try {
               Scanner wordList = new Scanner(new FileReader("C:\\StudentWork\\IntmJ\\workspace\\jardle\\src\\en_dictionary.csv"));

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

               // test length validity of user input
               if (userTry.length() != 5) {            // user try must be x characters long
                   System.out.println("Valid words are exactly 5 characters long");
                   System.out.println("Try has not counted");
                   tries--;                            //  decrement number of tries, offsetting the loop iteration, because the input was invalid
                   continue;                           // run loop again
               }

               // win logic
               if (userTry.equalsIgnoreCase(secretWord)) {    // the user input can be upper or lower case
                   System.out.println("You win");
                   return true;
               }
               // lose logic
               if (tries == 5) { // upon failing the fifth try, decrement health and give a new puzzle
                   System.out.println("Health damaged, new word selected. Try again");
                   return false;
               }

            // logic to continue guessing word
            String[] colorFeedback = new String[secretWord.length()];                   // array to be filled with the appropriate feedback color code at each userTry letter index
            StringBuilder lettersUnmatched = new StringBuilder().append(secretWord);    // "working space" that replaces matched letters with a '?', ensuring that each letter in secretWord can only be matched once

            final String ANSI_YELLOW = "\033[33m";
            final String ANSI_GREEN = "\033[32m";
            final String ANSI_RESET = "\033[0m";

            // we iterate once through managing only exact matches - to ensure that no green feedback is downgraded to yellow in the case of double letters in the word
            for (int i = 0; i < secretWord.length(); i++){
                if (userTry.charAt(i) == lettersUnmatched.charAt(i))  {
                       colorFeedback[i] = ANSI_GREEN;
                       lettersUnmatched.setCharAt(i, '?');
                   }
               }

            // this second iteration sets yellow clues if match found, else sets grey
            for (int i = 0; i < secretWord.length(); i++){
                // indexOf expects a string and returns the index of the first occurrence of a match, else returns -1
                // get the character at userTry[i], convert it to a string, and pass it to indexOf to search for unmatched chars in the secretWord
                int indexFirstMatch = lettersUnmatched.indexOf(String.valueOf( userTry.charAt(i) ), 0);
                if (colorFeedback[i] == null) {
                    if (indexFirstMatch != -1) {
                        colorFeedback[i] = ANSI_YELLOW;
                        lettersUnmatched.setCharAt(indexFirstMatch, '?');
                    } else {
                        colorFeedback[i] = ANSI_RESET;
                    }
                }
            }
            // format feedback for your guess
            StringBuilder displayFeedback = new StringBuilder(ANSI_RESET.length() * userTry.length() + userTry.length()); // the ansi color codes used all have the same length, bright colors are one character longer
            for (int i = 0; i < userTry.length(); i++) {
                displayFeedback.append(colorFeedback[i]);
                displayFeedback.append(userTry.charAt(i));
            }
            System.out.println("\033[F" + displayFeedback);  // escape character moves cursor to the beginning of the previous line, this overwrites the user input word with the colorized version.
            System.out.print(ANSI_RESET);
           }
          return false;
    }
}