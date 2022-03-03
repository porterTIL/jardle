import java.util.Scanner;


public class Map {
    Scanner playerScanner = new Scanner(System.in);
    int choice = 0;
    public static final String ANSI_GREEN_LETTER = "\u001B[32m";
    public static final String ANSI_PURPLE_LETTER = "\u001B[35m";
    public static final String ANSI_YELLOW_LETTER = "\u001B[33m";
    public static final String ANSI_BLUE_LETTER = "\u001B[34m";
    public static final String ANSI_RED_LETTER = "\u001B[31m";
    public static final String ANSI_CYAN_LETTER = "\u001B[36m";
    public static final String ANSI_WHITE_LETTER = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    Avatar avatar = new Avatar();

    // TODO: add an image of the map (using an rpg dungeon builder?) to work folder
    // if an area has monster in it, launch a wordle mini-game
    // Start room does not have monster and player will be able to choose first three areas
    public void startRoom() {
        try {
            Thread.sleep(2000);
            System.out.println("Welcome, warrior! You are in the entrance of the dungeon that you are going to traverse.");
            Thread.sleep(2000);
            System.out.println("I am called Brynhildr. What is your name?");
            Thread.sleep(2000);
            avatar.playerStart();

            do {
                System.out.println("As you enter, there are three directions you can go.  Which way would you like to head first, " + ANSI_CYAN_LETTER + avatar.playerName + ANSI_RESET + "?");
                Thread.sleep(1000);
                System.out.println("1: Head straight through the foyer.");
                Thread.sleep(500);
                System.out.println("2: Turn right into the dining hall.");
                Thread.sleep(500);
                System.out.println("3: Go left into the library.");
                choice = playerScanner.nextInt();
                if (choice == 1) {
                    area1();
                    break;
                } else if (choice == 2) {
                    area2();
                    break;
                } else if (choice == 3) {
                    area3();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {
        }
    }

    public void area1() {
        try {
            System.out.println("You tentatively explore the foyer and are careful not to disturb anything.");
            Thread.sleep(2000);
            //System.out.println("You encounter a" + ANSI_GREEN_LETTER + " GHOST!");
            //Thread.sleep(1000);
            System.out.println("                                 .*(&@@@%(*                                     \n" +
                    "                        @@@@/                  .@@@@                            \n" +
                    "                    /@@#                              @@                        \n" +
                    "                  ,@@        *@@#                        @.                     \n" +
                    "                 *@&      .@@   @@            *@@#        &@                    \n" +
                    "                 @@      @@      @/         &%   &@        @(                   \n" +
                    "                 @(     @&       @*        @(     @        &@                   \n" +
                    "                 @*     (@,    #@*         @@    (@        @@         @   @#    \n" +
                    "  @   %(  @   %( @/         ,,              #@(.@@         @&   .@@@/#     @    \n" +
                    "  ,%    @&   .@* *@                                       .@, *&      &   @(@&  \n" +
                    "    ,@.   **      @                                       @@   #@@@@*   (     @ \n" +
                    " /%        @      ,&           *@@&(,..,(&@@,            *@        @.   @@,  && \n" +
                    "  &@%&@%&  (#      %,       *@               #@          @%       .@   /@       \n" +
                    "        @,  *@      @       @&                 @&       %@       ,&   .@,       \n" +
                    "         @*   /@.   .@        @@/               @      ,@.     %#    @@         \n" +
                    "          ,@.      . (*          (@@@,          @.     @#         *@*           \n" +
                    "             ,@@#((#@(@.              (@&       @.    #@@%#(#&@(                \n" +
                    "                       @                 &@.   ,@     @/                        \n" +
                    "                       #(                  /@@@@.    (@                         \n" +
                    "                        @                            @@                         \n" +
                    "                        /%                           @*                         \n" +
                    "                         @                           @*                         \n" +
                    "                         @                           @#                         \n" +
                    "                         @                           @@                         \n" +
                    "                         @                            @@                        \n" +
                    "                        &#                             @@                       \n" +
                    "                       @(                               &@,                     \n" +
                    "                     @@                                   @@*                   \n" +
                    "                 @@,                                        @@                  \n" +
                    "                &@                                    @@     @/                 \n" +
                    "                 %@@@@@@.*&       *@@        @@%      @,  ,/                   \n" +
                    "                          @#    /@#  @@     @/  @@@@@@.    " + ANSI_RESET);
            System.out.println("While you cautiously glance at the artwork on the wall, a " + ANSI_GREEN_LETTER + "GHOST " + ANSI_RESET + "appears and blocks your path!  Solve the Jardle puzzle to defeat it.");
            Game.monsterEncounter();
            do {
                System.out.println("Moving on, you have two options:");
                System.out.println("1: Continue down the hall and into the dining hall, or ");
                System.out.println("2: turn to go into the kitchen.");
                choice = playerScanner.nextInt();
                if (choice == 1) {
                    area2();
                    break;
                } else if (choice == 2) {
                    area4();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {

        }
    }

    public void area2() {
        try {
            System.out.println("In the dining hall, the table seems to stretch on forever.  \n" +
                    "There is fine silverware set out for guests, but the plates are covered in dust and the centerpieces have long since wilted. \n" );
            Thread.sleep(2000);
            System.out.println("As you investigate the room, an " + ANSI_GREEN_LETTER + "IMP" + ANSI_RESET + " appears before you!  Quick, slay it by solving a Jardle to slay it.");
            Thread.sleep(1000);
            System.out.println(ANSI_PURPLE_LETTER + "                             ###    ##         /######                         \n" +
                    "                             (#(  ((( ((       ((      ((                       \n" +
                    "                             /  /(    ((      / /  .((  /                       \n" +
                    "          //  ////          //      //        // /*     /                       \n" +
                    "       ////(  * //         /,    /*        //       ////                        \n" +
                    "      /*  ,  //**         */    *         /     **               *  * */.       \n" +
                    "        ***** ***         *     *        *     **              **** ** */       \n" +
                    "          ,*   *          **   .*       **    ,*               ***,      **     \n" +
                    "           *   **          *    *       *     *                 .*   *          \n" +
                    "           *,    ,,       ***   .,*    ..     ,,,,,,          ,,   *,           \n" +
                    "             ,       ,,,.                            ,,,,,,,     *,             \n" +
                    "                ,,.                        ,,,              .,,,                \n" +
                    "                 ,,      ,,,,   ,     ,,,,   .   ,.     ,,                      \n" +
                    "                ,        ,   ,,,         ,*  ,    ,      ,,                     \n" +
                    "               ,  *   ,,                           *      ,                     \n" +
                    "              ,   ,  ,                              , .,  ,                     \n" +
                    "              ,       ,.                          **  ,   *                     \n" +
                    "              *       *                            *      *                     \n" +
                    "               *     *        *****,  /****       **     **                     \n" +
                    "                /     **/,  *                * /        //                      \n" +
                    "                 /(         //       ////    ./        //                       \n" +
                    "                    /(          /                    (/                         \n" +
                    "                      (((                         ((#                           \n" +
                    "                    ##      *#####/    /####.     #                             \n" +
                    "                 (###     ##                 #    #####                         \n" +
                    "                *#%%#(    %*                %%    %%.%#                         \n" +
                    "                   %%%(%   %               %%  %%%%%" + ANSI_RESET);
            System.out.println("Good luck, " + ANSI_CYAN_LETTER + avatar.playerName + ANSI_RESET + "!");
            Game.monsterEncounter();
            do {
                System.out.println("Where to next, warrior?");
                System.out.println("1: Creep back into the foyer, or");
                System.out.println("2: try the library?");

                choice = playerScanner.nextInt();
                if (choice == 1) {
                    area1();
                    break;
                } else if (choice == 2) {
                    area3();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {}
    }

    // Rest Area Zone
    // Potential health recovery options
    public void area3() {
        try {
            System.out.println("You push open the door to the library and flinch when it creaks.  However, ");
            Thread.sleep(2000);
            do {
                System.out.println("nothing is in the room, other than the smell of old books.  This seems like a good time to take a rest!");
                Thread.sleep(1000);
                System.out.println("So,now where to?");
                System.out.println("1: Go back to the dining hall,");
                System.out.println("2: or see what is in the next room?");

                int choice = playerScanner.nextInt();
                if (choice == 1) {
                    area2();
                    break;
                } else if (choice == 2) {
                    area6();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {}
    }

    public void area4() {
        try {
            System.out.println("As you continue on, you find yourself in the kitchen.  You're a little uneasy.  There are too many hiding spaces here...");
            Thread.sleep(2000);
            System.out.println("Out of a cabinet pops a " + ANSI_GREEN_LETTER + "GOBLIN!");
            Thread.sleep(1000);
            System.out.println(ANSI_RED_LETTER + "                                  #.(#   ###(                                   \n" +
                    "       (((//((            ( /(( .(    /((    (,(/( (                (((         \n" +
                    "   // // // ////    ///*  /     //                 /             ////  ////*    \n" +
                    "   **          **    /   ./                  ./    .   **       //       /////  \n" +
                    "      *,    **       *.    ***,* *        /* * * *    ****        **       ,*.  \n" +
                    "       ***    **  **  ,   *.*  ** *       * ,* * *      **     ***    ***       \n" +
                    "          **     ,,,,      ,,, ,*,          ,***,    .,,,*,*,,     .,,          \n" +
                    "            ,,,                ,,,,,,,,,,,,,,,,                .,,,             \n" +
                    "                ,,,,        , ,,,,        .,    ,       ,,,,,,                  \n" +
                    "                 ,,        *     .              ,      ,,                       \n" +
                    "                 ,,,,,     ,    ,.   ,**   ,,  *,    ,,,                        \n" +
                    "                    ,        ***,         ,**,       ,,*                        \n" +
                    "                  *******                           *                           \n" +
                    "                        /, /                    /////*                          \n" +
                    "                           /   ///////( // /(   //                              \n" +
                    "                           (   ,(          ((   ((                              \n" +
                    "                           (    (          ##   #(##/                           \n" +
                    "                     ##### #    #          ##  %#     ##                        \n" +
                    "                    %   .//,   %%          %%*(###%%%%%%" + ANSI_RESET);
            System.out.println("Hurry!  Use your Jardle puzzle solving skills to defeat it!");
            Game.monsterEncounter();
            do {
                System.out.println("Where to now, " + ANSI_CYAN_LETTER + avatar.playerName + ANSI_RESET + "?");
                System.out.println("1: Head back to the foyer!");
                System.out.println("2: Or see what is behind door number two?");

                int choice = playerScanner.nextInt();
                if (choice == 1) {
                    area1();
                    break;
                } else if (choice == 2) {
                    area5();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {}
    }

    // Rest Area Zone
    // Potential health recovery options
    public void area5() {
        try {
            System.out.println("When you shove open the double doors, you're greeted by a wide open space.  The dusty wood floors suggest that this was the ballroom once upon a time...");
            Thread.sleep(2000);
            do {
                System.out.println("You glance around.  The room is blissfully empty.");
                Thread.sleep(1000);
                System.out.println("Which way are you heading now?");
                System.out.println("1: Head through the side door.");
                System.out.println("2: Try the door at the back of the room.");

                int choice = playerScanner.nextInt();
                if (choice == 1) {
                    area4();
                    break;
                } else if (choice == 2) {
                    area8();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {}
    }

    public void area6() {
try {
    System.out.println("When you open the door, you're greeted by an overgrown jungle, surrounded by more windows than walls.\n"
    + "This must have been the old conservatory.");

    Thread.sleep(2000);
    System.out.println("Out from one of the bushes pops a" + ANSI_GREEN_LETTER + " HULKING MONSTER!");
    Thread.sleep(1000);
    System.out.println(ANSI_YELLOW_LETTER + "                       #,     ##                                                \n" +
            "                       ,((                                                      \n" +
            "                     (   ((*  (                                                 \n" +
            "                    /       / /                                                 \n" +
            "                   /         /     //       **/                                 \n" +
            "                  /      *       /              **                              \n" +
            "                  *     .      *      /**  *      *                             \n" +
            "                  *       *   ,    * *    *          *  **   /*                 \n" +
            "                  *             **   *     *   **   * *        *                \n" +
            "                   **                **         ,  **    *     *                \n" +
            "                     ,                  *   ,       .     ,,,                   \n" +
            "                      .    .      .           ,, ,        ,,.  ,                \n" +
            "                         .     ,                .  ,       , ,                  \n" +
            "                         ,         *   * , , , ,  ,                             \n" +
            "                        .                        ,                              \n" +
            "                         ,     ,*               ,*                              \n" +
            "                        ,                       *                               \n" +
            "                        *                                                       \n" +
            "                         .       .*              .                              \n" +
            "                         *          *        .                                  \n" +
            "                        .    ,                  /                               \n" +
            "                   /*                     *     /                               \n" +
            "                  (                           /(                                \n" +
            "                 (        (       (.  (         (                               \n" +
            "                /                (     (        (                               \n" +
            "                 #    #  ######        #     #  #                               \n" +
            "                                                  #                             \n" +
            "                                     %               #                          \n" +
            "                                         %%.   ,#(,%" + ANSI_RESET);
    System.out.println("Quick!  Defeat the beast!  You got this!");
    Game.monsterEncounter();
    do {
        System.out.println("Whew, made it. Which way do you want to go now?");
        System.out.println("1: Through the side door and into the library.");
        System.out.println("2: Pick the lock on the door on the other side of the room.");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area3();
            break;
        } else if (choice == 2) {
            area9();
            break;
        } else {
            System.out.println("Enter only option number");
        }
    } while (true);
}catch (InterruptedException e) {}
    }

    public void area7() {
        try {
            System.out.println("Inside the butler's pantry it is dark.  Shelves filled with expired staples line the walls.");
            Thread.sleep(2000);
            System.out.println("Out from behind a bag of rice pops a" + ANSI_GREEN_LETTER + " BOGEY!");
            Thread.sleep(1000);
            System.out.println(ANSI_PURPLE_LETTER + "                        #                                                       \n" +
                    "                       #(.#,                              ###                   \n" +
                    "                       (.   (((( ((*  ((((*((.  ((((((((    ((                  \n" +
                    "                       .( (                              .  (/                  \n" +
                    "                       //  /  /////                ///  (     /                 \n" +
                    "                    .*///    *  /  /             /  * ./     /,*////            \n" +
                    "           **/               /   .*              /    /              ,//        \n" +
                    "      **.           .             **  *  .*  *. ,*                 **   **      \n" +
                    "    **     *                    *   ,         ***  **         **,          *    \n" +
                    "   *     ,           ,**.      *                    ..                 *    **  \n" +
                    " .,        ,,                  ,  .,,   *,*    *,   ,       *,,               , \n" +
                    " ,             ,,               ,,       ,,,,    ,,.                   ,       ,\n" +
                    ",,,,                                                       ,,   ,,.         ,  ,\n" +
                    "   .,,,*        .,*..*..                        .            *,    .,    ,,,   .\n" +
                    "       ,,,,.,,,.    *  . .        *. . ..            . . *   . **    .,.,       \n" +
                    "                   * ., .        .   . .  .    . . .       .     ,              \n" +
                    "                  ,                      ,                        ,             \n" +
                    "                 *,       .      *       *                        *,            \n" +
                    "                 *                                      *    *     *            \n" +
                    "                 *   *                                       *     *            \n" +
                    "                 /                               .                 /            \n" +
                    "                 /              /                /                 /            \n" +
                    "                  (       ,            (                (         (             \n" +
                    "                   (       /                            .        (              \n" +
                    "                    #                         .               ,#                \n" +
                    "              ,#######%                                      #/                 \n" +
                    "             %                 %&.        .,#&#%              %#/               \n" +
                    "                (%&&&&&%%%%%%%%%%%         *%/,                  %" + ANSI_RESET);
            System.out.println("Solve the Jardle to defeat the " + ANSI_GREEN_LETTER + " BOGEY!" );
            Game.monsterEncounter();
            do {
                System.out.println("There's only one way to go from here.");
                System.out.println("1: Sneak into to the parlor.");


                int choice = playerScanner.nextInt();
                if (choice == 1) {
                    area8();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {}
    }

    public void area8() {
        try{
        System.out.println("The walls in the parlor are covered in cobwebbed tapestries.  The furniture has a thick layer of dust.");
        Thread.sleep(2000);
        System.out.println("Out of a corner darts an" + ANSI_GREEN_LETTER + " SLIMEBLOB!");
        Thread.sleep(1000);
        System.out.println(ANSI_PURPLE_LETTER + "                                                           ,@@.         /@@                                                  \n" +
                "                                                       &@                     @.                                             \n" +
                "                                                    #&                           @                                           \n" +
                "                                                  @      #@    &          .@  &@   @                                         \n" +
                "                                                 @     &&      %          @      @   @                                       \n" +
                "                                               @      @*       @          @       @   #                                      \n" +
                "                                              @       @        @           @      @    *                                     \n" +
                "                                             ..       @,      @              @@@@@      @                                    \n" +
                "                                             @   @     ,@  @@         @@@@        %@@    @                                   \n" +
                "                                             /                                  ,        @                                   \n" +
                "                                            @                                    @     ( &                                   \n" +
                "                                            @,       .                                   @                                   \n" +
                "                                            &@       .                                   @                                   \n" +
                "                                             @   .   @       * @          #              *                                   \n" +
                "                                             #%     @@             #     &              @                                    \n" +
                "                                              @                      @                 @                                     \n" +
                "                                               @           @    @     @.        @     ..                                     \n" +
                "                                                @                .              @  &  @                                      \n" +
                "                                                 @         #/   @                @(  @                                       \n" +
                "                                                  @   @                              @                                       \n" +
                "                                                  @    /                             @                                       \n" +
                "                                                  ,.    @@      @             *#     %#                                      \n" +
                "                                               // @        #%   @                      @                                     \n" +
                "                                              ,. #           @  @     &@@@       @      /@                                   \n" +
                "                                                @             &@      &  .      @         @                                  \n" +
                "                                                /       &@&@          @   @      @  @     @                                  \n" +
                "                                               @      @     ,         @   .       @@@@@ .#@                                  \n" +
                "                                                @@ @@.      @         &    @.     @     (#                                   \n" +
                "                                                 @     @     #      .  &     @@, @   @                                       \n" +
                "                                            * *  @     .&   @@%  @ @   &@    @@@    @                                        \n" +
                "                                                  @@,/@ @%  @  &      @  &@@@         / .*/                                  \n" +
                "                                         */////////*.        @@@@,  @@         */*  /////*                                   \n" +
                "                                  ,/*                         *                       ,///                                   \n" +
                "                                                        */// " + ANSI_RESET);
            System.out.println("You got this, " + ANSI_CYAN_LETTER + avatar.playerName + ANSI_RESET + ", just solve the Jardle to defeat the creature.");
        Game.monsterEncounter();
        do {
            System.out.println("Where to now?");
            System.out.println("1: Back to the ballroom,");
            System.out.println("2: or to the butler's pantry.");

            int choice = playerScanner.nextInt();
            if (choice == 1) {
                area5();
                break;
            } else if (choice == 2) {
                area7();
                break;
            } else {
                System.out.println("Enter only option number");
            }
        } while (true);
    } catch (InterruptedException e) {}
    }
// Potential boss room
    public void area9() {
        try {
            System.out.println("This door is locked, but it doesn't take long to pick the old lock.\n" +
                    "This must be the master suite.  A large bed and dressers fill most of the room.");
            Thread.sleep(2000);
            System.out.println("Out from under the bed comes an " + ANSI_GREEN_LETTER + "ELDRITCH MONSTER!");
            Thread.sleep(1000);
            System.out.println(ANSI_GREEN_LETTER + "                                                                         @ %                                                 \n" +
                    "                                                                                                                             \n" +
                    "                                                                        .                                                    \n" +
                    "                              %      @                       ,              &   .@@               @ *%       @               \n" +
                    "                                    %% .                             @       @              . ,       @                      \n" +
                    "                         & ,            @&@                *@@@&                         &&   @                              \n" +
                    "                             %            (@          @ ./  .*.     .@                 / @                                   \n" +
                    "                               #@@* .&@@   @           @           @   @             ,@        .& .,.       ((               \n" +
                    "                  @        @     @@@@*     @      @  @               *   .        @           &@         %.   % %            \n" +
                    "             , %    %    @               @   @      @       %@@       .  &     @   @          /  #                           \n" +
                    "          %   .         @                  @     (  @      @@@@@             #                  @  @                         \n" +
                    "                   (   @  @       @@@@@     @  @  @                   @  @     /     ,@ @        @  @                        \n" +
                    "                   @   @  ,       /@@@@     &  @   @                 @  @   @  @     @@@@@         @@                        \n" +
                    "                                               @    ,,  @         &   @     (  #                 (  @      ,                 \n" +
                    "             ./          #  .             @   @        /@          @         @  /               @  &     @                   \n" +
                    "                          #,  .@       @    @ @        ,            ,         @,  ..          @   @   @. @#                  \n" +
                    "                             ,@.        @%   @,                               &  @             @.                            \n" +
                    "            &#*      (@*          @ @.         ,,     @             #       (         /@@@@&       /@@@&&%%%&@@              \n" +
                    "                      @    ,        /                   @@      @   @  .                @       @        .@%                 \n" +
                    "                   @ .#@@@    %.      @      @                                 @@@   @ @     #         ,%%                   \n" +
                    "              @ .     .,**(@     , @      &     @@@,      ,(##(*.       %@@              @         /@(  #@#@@                \n" +
                    "           %@@        /            %      @ @@   @@   @        @     / *@(@  ,@      &  @         @                          \n" +
                    "                 @(  .. #/  @    #@  @@   @  @     @   &@@*      #@@@   @    /  @        @    @ @ % @                        \n" +
                    "                          ,  @    ,      @ @  % .&                        *@&  @ @          . &    #                         \n" +
                    "                                 @        (                                       @  %    @  /@                              \n" +
                    "                          @      @      @ @                                     / @       @   @                              \n" +
                    "                                 &      @ #       @          @ %   @    @         @       *                                  \n" +
                    "                                 @ #     @ @                    *        .     @          @                                  \n" +
                    "                                 @        % @   @   @      %                  & .*        @                                  \n" +
                    "                                     @     @  @                   @      *  @  @        / *                                  \n" +
                    "                                  @          @  @/(   @     @@&@    #   @@   @           @                                   \n" +
                    "                                   @            @&   %@%   *     #@(     @@             @                                    \n" +
                    "                                    @                @@@@@#*,,/#@@@@@(       @         @                                     \n" +
                    "                                     @   &@@.   @&                       #@ *         @                                      \n" +
                    "                                      @   @@#   @       ,#@@@@@@#,          @        #                                       \n" +
                    "                                       @         @                         @         .                                       \n" +
                    "                                       .@          @                      @          ,                                       \n" +
                    "                                     %%@           @@                   @@     % @  @@@                                      \n" +
                    "                                      @##  @ @ @                              @@@    .*" + ANSI_RESET);
            System.out.println("Defeat the monster to proceed.");
            Game.monsterEncounter();
            do {
                System.out.println("Which direction now?");
                System.out.println("1: Back to the conservatory.");
                System.out.println("2: ESCAPE OUT THE WINDOW!");

                int choice = playerScanner.nextInt();
                if (choice == 1) {
                    area6();
                    break;
                } else if (choice == 2) {
                    exit();
                    break;
                } else {
                    System.out.println("Enter only option number");
                }
            } while (true);
        } catch (InterruptedException e) {}
    }

    public void exit() {
        System.out.println(ANSI_BLUE_LETTER + "Congratulation " + avatar.playerName + "! You made it out of the dungeon!" + ANSI_RESET);
        System.out.println(ANSI_RED_LETTER +

                "                                                                                            %                                                                                                           \n" +
                "                                                                                           %,                                                                                                           \n" +
                "                                                                                           ,,,@                 " + ANSI_YELLOW_LETTER + "(/                                                                                      \n" +
                "                                                                                           " + ANSI_RED_LETTER + "/,,,,,            " + ANSI_YELLOW_LETTER + "*((                                                                                        \n" +
                "                                                                                           " + ANSI_RED_LETTER + "/,,,,,@          " + ANSI_YELLOW_LETTER + "(((,                                                                                        \n" +
                "                                                                                            " + ANSI_RED_LETTER + "#,,,,,/       " + ANSI_YELLOW_LETTER + ",((((                                                                                         \n" +
                "                                                                                             " + ANSI_RED_LETTER + "*,,,,&       " + ANSI_YELLOW_LETTER + "(((((,                                                                                        \n" +
                "                                                                                              " + ANSI_RED_LETTER + "*,,,/      " + ANSI_YELLOW_LETTER + "@((((((                                                                                        \n" +
                "                                                                                               " + ANSI_RED_LETTER + "@,@      " + ANSI_YELLOW_LETTER + ".((((((((                                                                                       \n" +
                "                                                                                               " + ANSI_RED_LETTER + "*%       " + ANSI_YELLOW_LETTER + "@(((((((((/                                                                                     \n" +
                "                                                                                               " + ANSI_RED_LETTER + "*        " + ANSI_YELLOW_LETTER + "#((((((((((@                                                                                    \n" +
                "                                                                                                       " + ANSI_YELLOW_LETTER + ",(((((((((((((@                                                                                  \n" +
                "                                                                  " + ANSI_RED_LETTER + ".                                    " + ANSI_YELLOW_LETTER + "#(((((((((((((((/                                                                                \n" +
                "                                                                 " + ANSI_RED_LETTER + "&/                                    " + ANSI_YELLOW_LETTER + "&((((((((((((((((@                                                                               \n" +
                "                                                                " + ANSI_RED_LETTER + "@,,@                           " + ANSI_YELLOW_LETTER + "(.      @(((((((((((((((((#                             " + ANSI_RED_LETTER + "                                                 \n" +
                "                                                                " + ANSI_RED_LETTER + ",,,,,*                      " + ANSI_YELLOW_LETTER + "*(((      @(((((((((((((((((((&                                                                             \n" +
                "                                                                " + ANSI_RED_LETTER + "&,,,,,#                    " + ANSI_YELLOW_LETTER + "#((((@   @((((((((((((((((((((((*                                                                            \n" +
                "                                                                 " + ANSI_RED_LETTER + "&,,,,,@                 " + ANSI_YELLOW_LETTER + "@(((((((((((((((((((((((((((((((((@               " + ANSI_RED_LETTER + ",                                                            \n" +
                "                                                                  " + ANSI_RED_LETTER + "#,,,,&                " + ANSI_YELLOW_LETTER + "#(((((((((((((((((((((((((((((((((((              " + ANSI_RED_LETTER + "/,                                                            \n" +
                "                                                                    " + ANSI_RED_LETTER + "@,,@              " + ANSI_YELLOW_LETTER + ",((((((((((((((((((((/(((((((((((((((             " + ANSI_RED_LETTER + "%,,/                                                            \n" +
                "                                                                     " + ANSI_RED_LETTER + "#,.             " + ANSI_YELLOW_LETTER + ",(((((((((((((((((((#,,((((((((((((((#            " + ANSI_RED_LETTER + "*,,,(                                                            \n" +
                "                                                                     ,     ,   " + ANSI_CYAN_LETTER + "  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + ANSI_YELLOW_LETTER + "((            " + ANSI_RED_LETTER + "*,,(                                                              \n" +
                "                                                                   " + ANSI_CYAN_LETTER + " @@@@@@@@@@@@@                                        @@@@@@@@@@@@@,,,,                                                               \n" +
                "                                                                 " + ANSI_CYAN_LETTER + " @    @@@@@@  @                                          @  @@@@@@@    @                                                               \n" +
                "                                                               " + ANSI_CYAN_LETTER + " @  @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@                                            @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@   @                                                              \n" +
                "                                                               @  @" + ANSI_YELLOW_LETTER + "(((((((((((" + ANSI_CYAN_LETTER + "@              @@@@@@@@@@@@@@@               @" + ANSI_YELLOW_LETTER + "(((((((((((" + ANSI_CYAN_LETTER + "@   @                                                            \n" +
                "                                                               @  @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@           @                 @            @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@   @                                                             \n" +
                "                                                               @  @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@          @                   @           @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@   @                                                              \n" +
                "                                                                @  @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@         @                   @          @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@  @                                                               \n" +
                "                                                                 @   @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@          @                 @           @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@   @                                                                 \n" +
                "                                                                  (" + ANSI_CYAN_LETTER + "@@  @" + ANSI_YELLOW_LETTER + "(((((((((" + ANSI_CYAN_LETTER + "@           @             @            @" + ANSI_YELLOW_LETTER + "(((((((((" + ANSI_CYAN_LETTER + "@  @@" + ANSI_YELLOW_LETTER + "((                                                                  \n" +
                "                                                                 ,(((" + ANSI_CYAN_LETTER + "@@   @" + ANSI_YELLOW_LETTER + "(((((((" + ANSI_CYAN_LETTER + "@                                   @" + ANSI_YELLOW_LETTER + "(((((((" + ANSI_CYAN_LETTER + "@    @@" + ANSI_YELLOW_LETTER + "((/                                                                \n" +
                "                                                                 &((((((" + ANSI_CYAN_LETTER + "@@   @@" + ANSI_YELLOW_LETTER + "(((" + ANSI_CYAN_LETTER + "@@                                 @@(((@@   @@" + ANSI_YELLOW_LETTER + "((((((#                                                               \n" +
                "                                                                 @((((((((((" + ANSI_CYAN_LETTER + "@@@  @@@@                               @@@@   @@@" + ANSI_YELLOW_LETTER + "((((((((((((*                                                             \n" +
                "                                                           &     #(((((((((((((" + ANSI_CYAN_LETTER + "@@@@@@@                             @@@@@@@," + ANSI_YELLOW_LETTER + "(((((((((((((((*                                                            \n" +
                "                                                          @%    (((((((((((((((((((((" + ANSI_CYAN_LETTER + "@                             @" + ANSI_RED_LETTER + ",,,,,,,,&" + ANSI_YELLOW_LETTER + "((((((((((((((                                                            \n" +
                "                                                         @((@  *((((((((((((((((((((" + ANSI_RED_LETTER + ",,," + ANSI_CYAN_LETTER + "@                          @" + ANSI_RED_LETTER + ",,,,,,,,,,,@" + ANSI_YELLOW_LETTER + "((((((((((((((@                                                           \n" +
                "                                                        @((((((((((((((((((((" + ANSI_RED_LETTER + ",,,((/,,,,,," + ANSI_CYAN_LETTER + "@                      @" + ANSI_RED_LETTER + ",,,,,,,,,,,,,@" + ANSI_YELLOW_LETTER + "((((((((((((((&                                                           \n" +
                "                                                       @(((((((((((((((((((" + ANSI_RED_LETTER + "@,,,,,,,,,,,,,,," + ANSI_CYAN_LETTER + "@                  @" + ANSI_RED_LETTER + ",,,,,,,,,,,,,,,@" + ANSI_YELLOW_LETTER + "((((((((((((((&                                                           \n" +
                "                                                      .#((((((((((((((((((" + ANSI_RED_LETTER + "&,,,,,,,,,,,,,,,,,," + ANSI_CYAN_LETTER + "@              @" + ANSI_RED_LETTER + ",,,,,,,,,,,,,,,,&" + ANSI_YELLOW_LETTER + "((#(((((((((((# ,                                                         \n" +
                "                                                      @((((((((((((((((((" + ANSI_RED_LETTER + "@,,,,,,,,,,,,,,,,,,, " + ANSI_CYAN_LETTER + "@            @" + ANSI_RED_LETTER + ",,,,,,,,,,,,,,,,,,,*,%" + ANSI_YELLOW_LETTER + "((((((((((  #                                                         \n" +
                "                                                      @(((((((((((((((((((" + ANSI_RED_LETTER + ",,,,,,,,,,,,,,,,,,,,,,," + ANSI_CYAN_LETTER + "@@@@@@@@" + ANSI_WHITE_LETTER + "....." + ANSI_RED_LETTER + "#,,,,,,,,,,,,,,,,,,@" + ANSI_YELLOW_LETTER + "((((((((((((%                                                         \n" +
                "                                                      @(((((((((((((((((" + ANSI_RED_LETTER + "#,,,,,,,,,,,,,,,,,,/ *,,," + ANSI_CYAN_LETTER + "@      @" + ANSI_WHITE_LETTER + ". . .." + ANSI_RED_LETTER + "%,,,,,,,,,,,,,,,,,@" + ANSI_YELLOW_LETTER + "(((((((((((&                                                          \n" +
                "                                                      @(((((((((((((((((" + ANSI_RED_LETTER + "@,,,,,,,,,,,,,,,,&" + ANSI_WHITE_LETTER + "....%,," + ANSI_CYAN_LETTER + "@      @" + ANSI_WHITE_LETTER + "........" + ANSI_RED_LETTER + ",,,,,,,,,,,,,,,,#" + ANSI_YELLOW_LETTER + "((((((((((&                                                           \n" +
                "                                                      ((((((((((((((((((" + ANSI_RED_LETTER + "@,,,,,,,,,,,,,,," + ANSI_WHITE_LETTER + "........." + ANSI_CYAN_LETTER + "@      @" + ANSI_WHITE_LETTER + " . . . ." + ANSI_RED_LETTER + "/,,,,,,,,,,,,,*" + ANSI_YELLOW_LETTER + "((((((((((@                                                            \n" +
                "                                                       @((((((((((((((((" + ANSI_RED_LETTER + "&,,,,,,,,,,,,,," + ANSI_WHITE_LETTER + "........." + ANSI_CYAN_LETTER + "@        @" + ANSI_WHITE_LETTER + "........." + ANSI_RED_LETTER + "&,,,,,,,,,,,,@" + ANSI_YELLOW_LETTER + "(((((((((@                                                             \n" +
                "                                                        @((((((((((((((((" + ANSI_RED_LETTER + ",,,,,,,,,,,,,@" + ANSI_WHITE_LETTER + "........" + ANSI_CYAN_LETTER + "@          @" + ANSI_WHITE_LETTER + ". . . .  " + ANSI_RED_LETTER + "(,,,,,,,,,,," + ANSI_YELLOW_LETTER + "(((((((((&                                                              \n" +
                "                                                         @(((((((((((((((" + ANSI_RED_LETTER + "&,,,,,,,,,,,,#" + ANSI_WHITE_LETTER + "......." + ANSI_CYAN_LETTER + "@            @" + ANSI_WHITE_LETTER + "........" + ANSI_RED_LETTER + "#,,,,,,,,,,@" + ANSI_YELLOW_LETTER + "(((((((#                                                                \n" +
                "                                                          %#((((((((((((((" + ANSI_RED_LETTER + "#,,,,,,,,,,,@" + ANSI_WHITE_LETTER + ". . ." + ANSI_CYAN_LETTER + "@                 @" + ANSI_WHITE_LETTER + ". . ." + ANSI_RED_LETTER + "/,,,,,,,,,&(" + ANSI_YELLOW_LETTER + "(((((((                                                                 \n" +
                "                                                            %%(((((((((((((" + ANSI_RED_LETTER + "@,,,,,,,,,,," + ANSI_WHITE_LETTER + "." + ANSI_CYAN_LETTER + "@                        @" + ANSI_WHITE_LETTER + ".." + ANSI_RED_LETTER + "(,,,,,,,*" + ANSI_YELLOW_LETTER + "(((((((#                                                                   \n" +
                "                                                              .@(((((((((((((" + ANSI_RED_LETTER + "/,,,,," + ANSI_CYAN_LETTER + "@                                 @" + ANSI_RED_LETTER + ",,,,," + ANSI_YELLOW_LETTER + "(((((((.                                                                     \n" +
                "                                                                 (@((((((((((((" + ANSI_CYAN_LETTER + "|||||||||||||||||||||||||||||||||||||||||||||" + ANSI_YELLOW_LETTER + "(((&                                                                        \n" +
                "                                                                     @#((((((((" + ANSI_CYAN_LETTER + "||                                         ||" + ANSI_YELLOW_LETTER + "#                                                                           \n" +
                "                                                                         %@#(((" + ANSI_CYAN_LETTER + "||                                         ||                                                                            \n" +
                "                                                                               ||                                         ||                                                                            \n" +
                "                                                                               |||||||||||||||||||||||||||||||||||||||||||||");
    }
}
