package basic100.no1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);
    }
}
