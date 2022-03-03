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
            System.out.println("Welcome warrior! You are in the entrance of the dungeon that you are going to traverse.");
            Thread.sleep(2000);
            System.out.println("I am called Brynhildr. What is your name warrior?");
            Thread.sleep(2000);
            avatar.playerStart();

            do {
                System.out.println("You have three options to pick from. Choose well " + ANSI_CYAN_LETTER + avatar.playerName + ANSI_RESET + "!");
                Thread.sleep(1000);
                System.out.println("1: Area 1");
                Thread.sleep(500);
                System.out.println("2: Area 2");
                Thread.sleep(500);
                System.out.println("3: Area 3");
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
            System.out.println("Welcome to Area 1");
            Thread.sleep(2000);
            System.out.println("You encounter a" + ANSI_GREEN_LETTER + " MONSTER!");
            Thread.sleep(1000);
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
            System.out.println("Defeat the monster to proceed.");
            Game.monsterEncounter();
            do {
                System.out.println("Which direction do you want to move.");
                System.out.println("1: Go East");
                System.out.println("2: Go South");
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
            System.out.println("Welcome to area 2");
            Thread.sleep(2000);
            System.out.println("You encounter a" + ANSI_GREEN_LETTER + " MONSTER!");
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
            System.out.println("Defeat the monster to proceed.");
            Game.monsterEncounter();
            do {
                System.out.println("Which direction do you want to move.");
                System.out.println("1: Go West");
                System.out.println("2: Go East");

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
            System.out.println("Welcome to area 3");
            Thread.sleep(2000);
            do {
                System.out.println("You have entered a resting zone.");
                Thread.sleep(1000);
                System.out.println("Which direction do you want to move.");
                System.out.println("1: Go West");
                System.out.println("2: GO South");

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
            System.out.println("Welcome to area 4");
            Thread.sleep(2000);
            System.out.println("You encounter a" + ANSI_GREEN_LETTER + " MONSTER!");
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
            System.out.println("Defeat the monster to proceed.");
            Game.monsterEncounter();
            do {
                System.out.println("Which direction do you want to move.");
                System.out.println("1: Go North");
                System.out.println("2: Go East");

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
            System.out.println("Welcome to area 5");
            Thread.sleep(2000);
            do {
                System.out.println("You have entered a resting zone");
                Thread.sleep(1000);
                System.out.println("Which direction do you want to move.");
                System.out.println("1: Go West");
                System.out.println("2: Go South");

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
    System.out.println("Welcome to area 6");
    Thread.sleep(2000);
    System.out.println("You encounter a" + ANSI_GREEN_LETTER + " MONSTER!");
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
    System.out.println("Defeat the monster to proceed.");
    Game.monsterEncounter();
    do {
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go North");
        System.out.println("2: Go South");

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
            System.out.println("Welcome to area 7");
            Thread.sleep(2000);
            System.out.println("You encounter a" + ANSI_GREEN_LETTER + " MONSTER!");
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
            System.out.println("Defeat the monster to proceed.");
            Game.monsterEncounter();
            do {
                System.out.println("Which direction do you want to move.");
                System.out.println("1: Go East");


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
        System.out.println("Welcome to area 8");
        Thread.sleep(2000);
        System.out.println("You encounter a" + ANSI_GREEN_LETTER + " MONSTER!");
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
            System.out.println("Defeat the monster to proceed.");
        Game.monsterEncounter();
        do {
            System.out.println("Which direction do you want to move.");
            System.out.println("1: Go North");
            System.out.println("2: Go West");

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
            System.out.println("Welcome to area 9");
            Thread.sleep(2000);
            System.out.println("You encounter a" + ANSI_GREEN_LETTER + " MONSTER!");
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
                System.out.println("Which direction do you want to move.");
                System.out.println("1: Go North");
                System.out.println("2: Go East");

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
                "                                                                   " + ANSI_CYAN_LETTER + " @@@@@@@@@@@@@                                        @@@@@@@@@@@@@" + ANSI_RED_LETTER + ",,,,                                                               \n" +
                "                                                                 " + ANSI_CYAN_LETTER + " @    @@@@@@  @                                          @  @@@@@@@    @                                                               \n" +
                "                                                               " + ANSI_CYAN_LETTER + " @  @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@                                            @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@   @                                                              \n" +
                "                                                               @  @" + ANSI_YELLOW_LETTER + "(((((((((((" + ANSI_CYAN_LETTER + "@              @@@@@@@@@@@@@@@               @" + ANSI_YELLOW_LETTER + "(((((((((((" + ANSI_CYAN_LETTER + "@   @                                                            \n" +
                "                                                               @  @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@           @                 @            @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@   @                                                             \n" +
                "                                                               @  @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@          @                   @           @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@   @                                                              \n" +
                "                                                                @  @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@         @                   @          @" + ANSI_YELLOW_LETTER + "((((((((((((" + ANSI_CYAN_LETTER + "@  @                                                               \n" +
                "                                                                 @   @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@          @                 @           @" + ANSI_YELLOW_LETTER + "((((((((((" + ANSI_CYAN_LETTER + "@   @                                                                 \n" +
                "                                                                  (" + ANSI_CYAN_LETTER + "@@  @" + ANSI_YELLOW_LETTER + "(((((((((" + ANSI_CYAN_LETTER + "@           @             @            @" + ANSI_YELLOW_LETTER + "(((((((((" + ANSI_CYAN_LETTER + "@  @@" + ANSI_YELLOW_LETTER + "((                                                                  \n" +
                "                                                                 ,(((" + ANSI_CYAN_LETTER + "@@   @" + ANSI_YELLOW_LETTER + "(((((((" + ANSI_CYAN_LETTER + "@                                   @" + ANSI_YELLOW_LETTER + "(((((((" + ANSI_CYAN_LETTER + "@    @@" + ANSI_YELLOW_LETTER + "((/                                                                \n" +
                "                                                                 &((((((" + ANSI_CYAN_LETTER + "@@   @@" + ANSI_YELLOW_LETTER + "(((" + ANSI_CYAN_LETTER + "@@                                 @@" + ANSI_YELLOW_LETTER + "(((" + ANSI_CYAN_LETTER + "@@   @@" + ANSI_YELLOW_LETTER + "((((((#                                                               \n" +
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
