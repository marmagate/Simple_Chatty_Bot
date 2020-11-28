import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int input;
        int sum = 0;
        int theBarrier = 1000;

        while (scanner.hasNext()) {
            input = scanner.nextInt();
            sum += input;
            if (input == 0) {
                System.out.println(sum);
                break;
            }
            if (sum >= theBarrier) {
                System.out.println(sum - theBarrier);
                break;
            }
        }
    }
}