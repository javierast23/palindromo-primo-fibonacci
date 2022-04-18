package Numeros;

public class Fibonacci extends Number {

    @Override
    public boolean isPalindrome(int num) {
        return false;
    }

    @Override
    public boolean isPrime(int num) {
        return false;
    }

    @Override
    public boolean isFibonacci(int num) {
        int firstNum = 0, secondNum = 1;
        int nextNum = 0;

        for (int i = 1; i <= num; i++) {
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

            if (num == secondNum) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void showMessage(int num) {
        boolean b = isFibonacci(num);
        String message = b ? " belongs to the fibonacci series" : " does not belong to the fibonacci series";

        System.out.println("The number " + num + message);
    }

    public Fibonacci(int num) {
        super(num);
    }
}