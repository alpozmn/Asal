import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }

    // Recursive metot ile asal sayı kontrolü
    public static boolean isPrime(int number) {
        return isPrime(number, 2);
    }

    private static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }
}
