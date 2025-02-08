package dev.tiago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double altura;
        double peso;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println();

        String nameWithoutSpace = nome.trim();
        double imc = peso / (altura*altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("De acordo com sua altura e peso, você está no peso ideal, parabéns!");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso");
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau 1");
        }else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau 2");
        }else if(imc >= 40){
            System.out.println("Obesidade grau 3");
        }else {
            System.out.println("Obesidade mórdita");
        }

        System.out.printf(nameWithoutSpace + ", seu IMC é: %.2f", imc);
        System.out.println();

        sc.close();
    }
}