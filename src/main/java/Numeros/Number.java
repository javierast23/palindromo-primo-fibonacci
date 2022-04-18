package Numeros;

public abstract class Number {
    int num;

    public abstract boolean isPalindrome(int num);

    public abstract boolean isPrime(int num);

    public abstract boolean isFibonacci(int num);

    public void showMessage (int num) {

        System.out.println(num);
    }

    public Number(int num) {
        this.num = num;
    }
}
