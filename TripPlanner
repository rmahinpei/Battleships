/*
    TripPlanner is an interactive Java program that asks users for their current location, travel destination, and travel budget
    and calculates the user's daily budget (in both USD and the location's currency) and the total distance to the destination.
*/
import java.util.Scanner;

public class tripPlanner {
    public static void main(String[] args) {
        greeting();
        details();
        distance();
    }
    // ask for user's name and travel destination
    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like an amazing place!");
    }
    // ask user for number of vacation days, travel budget, and currency of destination
    public static void details() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double conversion = input.nextDouble();

        // convert travel budget to destination's currency and calculate daily budget
        double converted1 = money / days;
        int converted2 = (int)(converted1 * 100);
        double converted3 = (double)(converted2 / 100);
        double budget1 = conversion * money;
        int budget2 = (int)(budget1 * 100);
        double budget3 = (double)(budget2 / 100);
        
        // display daily budget both in USD and destination's currency
        System.out.println("If you are travelling for " + days + " days that is the same as " + (days * 24) + " hours.");
        System.out.println("You can spend up to $" + converted3 + " USD.");
        System.out.println("Your budget in " + symbol + " is " + budget3);
    }
    // ask user for info on their current location and desired destination in order to calculate total distance
    public static void distance() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of your home city: ");
        double lat1 = Math.toRadians(input.nextDouble());
        System.out.print("Enter the longitude of your home city: ");
        double lon1 = Math.toRadians(input.nextDouble());
        System.out.print("Enter the latitude of your destination: ");
        double lat2 = Math.toRadians(input.nextDouble());
        System.out.print("Enter the longitude of your destination: ");
        double lon2 = Math.toRadians(input.nextDouble());
        double first = Math.sin((lat2 - lat1) / 2);
        double second = Math.sin((lon2 - lon1) / 2);
        double answer1 = 2 * 6371.0 * Math.asin(Math.sqrt(first * first + Math.cos(lat1) * Math.cos(lat2) * second * second));
        int answer2 = (int)(answer1 * 100);
        double answer3 = answer2 / 100.0;
        System.out.println("The distance from your home to your destination is " + answer3 + " km.");
    }
}
