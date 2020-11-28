import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int elem = 1;
        int elemCounter = 0;

        while (scanner.hasNext() && elem != 0) {
            elem = scanner.nextInt();
            if (elem != 0) {
                elemCounter++;
            }
        }
        System.out.println(elemCounter);
    }
}