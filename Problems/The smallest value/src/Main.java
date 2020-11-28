import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long fact = 1;
        int num = 1;

        while (fact <= m) {
            num++;
            fact *= num;
        }
        System.out.println(num);
    }
}