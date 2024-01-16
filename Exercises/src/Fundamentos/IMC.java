package Fundamentos;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc == 40.0) {
            System.out.println("You're in obesity level 3. Red sign!");
        } else if (imc >= 35.0 && imc < 39.9) {
            System.out.println("You're in obesity level 2. Alert sign!");
        } else if (imc >= 30.0 && imc < 34.9) {
            System.out.println("You're in obesity level 1. Change your habits.");
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println("You're in overweight. Need to change your habits.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("You're in a normal weight. Keep it up.");
        }

        // Exibindo o resultado com dois decimais
        System.out.printf("Your IMC is: %.2f", imc);

        scanner.close();
    }
}

