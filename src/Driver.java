public class Driver {
    public static void main(String[] args) {
        Wordle wordle = new Wordle();
        for (String word : wordle.userGuesses){
            System.out.println(word);
        }
    }
}
