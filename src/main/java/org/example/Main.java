package org.example;

public class Main {

    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        // Loop untuk memeriksa pembagian dari 2 hingga setengah dari bilangan
        for (int i = 2; i <= number / 2; ++i) {
            // Jika bilangan habis dibagi i, maka bilangan tersebut bukan prima
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Menampilkan hasil
        if (isPrime) {
            System.out.println(number + " adalah bilangan prima.");
        } else {
            System.out.println(number + " bukan bilangan prima.");
        }
    }
}