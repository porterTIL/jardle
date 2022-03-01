import java.util.Scanner;

public class Map {
    Scanner playerScanner = new Scanner(System.in);

    // TODO: add an image of the map (using an rpg dungeon builder?) to work folder
    // if an area has monster in it, launch a wordle mini-game
    public void area1() {
        System.out.println("You encounter a monster!");
        System.out.println("Defeat the monster to proceed.");
        Game.monsterEncounter();
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go East");
        System.out.println("2: Go South");

        int choice = playerScanner.nextInt();

        if (choice == 1) {
            area2();
        } else if (choice == 2) {
            area4();
        }
    }

    public void area2() {
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go West");
        System.out.println("2: Go East");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area1();
        } else if (choice == 2) {
            area3();
        }
    }

    // Rest Area Zone
    // Potential health recovery options
    public void area3() {
        System.out.println("You have entered a resting zone.");
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go West");
        System.out.println("2: GO South");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area2();
        } else if (choice == 2) {
            area6();
        }
    }

    public void area4() {
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go North");
        System.out.println("2: Go East");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area1();
        } else if (choice == 2) {
            area5();
        }
    }

    // Rest Area Zone
    // Potential health recovery options
    public void area5() {
        System.out.println("You have entered a resting zone");
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go West");
        System.out.println("2: Go South");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area4();
        } else if (choice == 2) {
            area8();
        }
    }

    public void area6() {
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go North");
        System.out.println("2: Go South");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area3();
        } else if (choice == 2) {
            area9();
        }
    }

    public void area7() {
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go East");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area8();
        }
    }

    public void area8() {
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go North");
        System.out.println("2: Go West");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area5();
        } else if (choice == 2) {
            area7();
        }
    }

    public void area9() {
        System.out.println("Which direction do you want to move.");
        System.out.println("1: Go North");
        System.out.println("2: Go East");

        int choice = playerScanner.nextInt();
        if (choice == 1) {
            area6();
        } else if (choice == 2) {
            exit();
        }
    }

    public void exit() {
        System.out.println("Congratulation! You made it out of the dungeon!");
    }
}
