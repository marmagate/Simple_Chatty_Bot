import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int hotelNightCost = scanner.nextInt();

        int moneyNeeded = oneWayFlightCost*2 + hotelNightCost*(duration-1) + foodCost*duration;
        System.out.println(moneyNeeded);
    }
}