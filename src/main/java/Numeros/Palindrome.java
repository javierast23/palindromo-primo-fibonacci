package Numeros;

public class Palindrome extends Number {

    @Override
    public boolean isPalindrome(int num) {
        int numInverted;
        String cadena, cadenaInvertida = "";
        cadena = String.valueOf(num);

        if(cadena.length() == 1){
            return false;
        }

        for (int i = 0; i < cadena.length(); i++) {
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
        }
        numInverted = Integer.parseInt(cadenaInvertida);
        if (num == numInverted) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isPrime(int num) {
        return false;
    }

    @Override
    public boolean isFibonacci(int num) {
        return false;
    }

    @Override
    public void showMessage(int num) {
        boolean b = isPalindrome(num);
        String message = b ? " its a palindrome" : " its not a palindrome";

        System.out.println("The number " + num + message);
    }

    public Palindrome(int num) {
        super(num);
    }
}