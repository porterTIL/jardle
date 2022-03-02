abstract public class Game {
    static Avatar player = new Avatar();
    static Map map = new Map();

   static void enterDungeon(){
       map.startRoom();
   }
    static void monsterEncounter(){
        if(Wordle.miniGame() == false){
            player.playerHealth();
            if (player.playerHP == 0){
                player.deadPlayer();
            }
            monsterEncounter();
        }
        System.out.println("You have defeated this monster");
    }
}