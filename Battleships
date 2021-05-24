/*
    Battleships is an interactive Java program that allows the user to play a game of Battleships against the computer.
    The program first asks user to deploy his/her ships and then asks for coordinations at which user wants to fire.
    The game continues until either the computer or the user wins. 
*/
import java.util.Scanner;
public class battleShips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to Battle Ships game ***");
        System.out.println();
        System.out.println("Right now, the sea is empty.");
        System.out.println();
        String[][] grid = new String[10][10];
        String[][] master = new String[10][10];
        System.out.println("    0123456789   ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "  |");
            for (int j = 0; j < 10; j++) {
                grid[i][j] = " ";
                master[i][j] = " ";
                System.out.print(grid[i][j]);
            }
            System.out.print("|  " + i);
            System.out.println();
        }
        System.out.println("    0123456789   ");
        System.out.println();
        System.out.println("Deploy your ships: ");
        int user = 0;
        for (user = 0; user < 5; user++) {
            System.out.print("Enter the X coordinate of Ship " + (user + 1) + ": ");
            int X = input.nextInt();
            System.out.print("Enter the Y coordinate of Ship " + (user + 1) + ": ");
            int Y = input.nextInt();
            while (X > 9 || X < 0 || Y < 0 || Y > 9) {
                System.out.println("Please enter valid coordinates.");
                System.out.print("Enter the X coordinate of Ship " + (user + 1) + ": ");
                X = input.nextInt();
                System.out.print("Enter the Y coordinate of Ship " + (user + 1) + ": ");
                Y = input.nextInt();
            }
            while (master[Y][X].equals("@")) {
                System.out.println("Please enter unused coordinates.");
                System.out.print("Enter the X coordinate of Ship " + user + ": ");
                X = input.nextInt();
                System.out.print("Enter the Y coordinate of Ship " + user + ": ");
                Y = input.nextInt();
            }
            grid[Y][X] = "@";
            master[Y][X] = "@";
        }
        System.out.println();
        System.out.println("    0123456789   ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "  |");
            for (int j = 0; j < 10; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.print("|  " + i);
            System.out.println();
        }
        System.out.println("    0123456789   ");
        System.out.println();
        System.out.println("Computer is deploying its ships...");
        int computer = 0;
        for (computer = 0; computer < 5; computer++) {
            int X = (int) (Math.random() * 10);
            int Y = (int) (Math.random() * 10);
            while (master[Y][X].equals("@")) {
                X = (int) (Math.random() * 10);
                Y = (int) (Math.random() * 10);
            }
            master[Y][X] = "!";
            System.out.println("Computer has deployed its Ship " + (computer+1));
        }
        System.out.println();
        System.out.println("*** THE GAME WILL NOW BEGIN ***");
        while(computer > 0 && user > 0) {
            System.out.println("YOUR TURN TO FIRE");
            System.out.print("Enter X coordinate: ");
            int X = input.nextInt();
            System.out.print("Enter Y coordinate: ");
            int Y = input.nextInt();
            if (master[Y][X].equals("!")) {
                grid[Y][X] = "!";
                System.out.println("Boom! You sunk a ship!");
                computer--;
                master[Y][X] = "N";
            } else if (master[Y][X].equals(" ")) {
                System.out.println("Sorry, you missed.");
                master[Y][X] = "N";
                grid[Y][X] = "-";
            } else if (master[Y][X].equals("@")) {
                System.out.println("You sunk your own ship!");
                master[Y][X] = "N";
                grid[Y][X] = "X";
                user--;
            } else if (master[Y][X].equals("N"))
                System.out.println("You missed your opportunity because you or the computer had previously entered those coordinates.");
            else System.out.println("You missed your opportunity because you entered invalid coordinates.");
            System.out.println();
            System.out.println("COMPUTER'S TURN TO FIRE");
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            while (master[y][x].equals("N")) {
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);
            }
            if (master[y][x].equals("!")) {
                grid[y][x] = "!";
                System.out.println("Computer sunk its own ship!");
                computer--;
                master[y][x] = "N";
            } else if (master[y][x].equals(" ")) {
                System.out.println("Computer missed.");
                master[y][x] = "N";
                grid[y][x] = "-";
            } else if (master[y][x].equals("@")) {
                System.out.println("Computer sunk your ship!");
                master[y][x] = "N";
                grid[y][x] = "X";
                user--;
            }
            System.out.println();
            System.out.println("    0123456789   ");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + "  |");
                for (int j = 0; j < 10; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.print("|  " + i);
                System.out.println();
            }
            System.out.println("    0123456789   ");
            System.out.println();
            System.out.println("Your ships: " + user + " | Computer's ships: " + computer);
            System.out.println();
        }
        if (computer == 0) System.out.println("You won the battle!");
        else System.out.println("Computer won the battle!");
    }
}
