import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        boolean checkA = a < 10 && a > 0;

        System.out.println(checkA);
    }
}