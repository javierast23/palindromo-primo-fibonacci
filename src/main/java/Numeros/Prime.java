package Numeros;

public class Prime extends Number {

    @Override
    public boolean isPalindrome(int num) {
        return false;
    }

    @Override
    public boolean isPrime(int num) {int restoCero = 0;

        if(num == 0 || num == 1 ){
            return false;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                    restoCero++;

            }
        }

        if (restoCero == 2) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFibonacci(int num) {
        return false;
    }

    @Override
    public void showMessage(int num) {
        boolean b = isPrime(num);
        String message = b ? " its a prime number" : " its not a prime number";

        System.out.println("The number " + num + message);
    }

    public Prime(int num) {
        super(num);
    }
}