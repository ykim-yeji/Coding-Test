package basic100.no1071;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n != 0){
            System.out.println(n);
            n = sc.nextInt();
        }
        sc.close();
    }
}