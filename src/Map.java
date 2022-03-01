import java.util.Scanner;

public class Map {
    Scanner playerScanner = new Scanner(System.in);
    Wordle word = new Wordle();
    int choice = 0;


    public void area1() {
        System.out.println("Welcome to Area 1");
        System.out.println("You encounter a monster!");
        System.out.println("Defeat the monster to proceed.");
        word.Wordle();

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
    }

    public void area2() {
        System.out.println("Welcome to area 2");
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
    }

    // Rest Area Zone
    // Potential health recovery options
    public void area3() {
        System.out.println("Welcome to area 3");
        do {
            System.out.println("You have entered a resting zone.");
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


    }

    public void area4() {
        System.out.println("Welcome to area 4");
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
    }

    // Rest Area Zone
    // Potential health recovery options
    public void area5() {
        System.out.println("Welcome to area 5");
        do {
            System.out.println("You have entered a resting zone");
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
    }

    public void area6() {
        System.out.println("Welcome to area 6");
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

    }

    public void area7() {
        System.out.println("Welcome to area 7");
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


    }

    public void area8() {
        System.out.println("Welcome to area 8");
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

    }

    public void area9() {
        System.out.println("Welcome to area 9");
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

    }

    public void exit() {
        System.out.println("Congratulation! You made it out of the dungeon!");
    }
}
