package Numeros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        number = sc.nextInt();

        Number n1 = new Palindrome(number);
        Number n2 = new Prime(number);
        Number n3 = new Fibonacci(number);

        n1.showMessage(number);
        n2.showMessage(number);
        n3.showMessage(number);

    }
}
