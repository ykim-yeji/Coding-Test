package basic100.no1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, isPrime = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        if(b >= a) {
            isPrime = 1;
        }

        System.out.println(isPrime);

        sc.close();
    }
}
