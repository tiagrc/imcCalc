package dev.tiago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double height;
        double wight;

        System.out.print("Digite seu nome: ");
        name = sc.nextLine();
        System.out.print("Digite sua altura: ");
        height = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        wight = sc.nextDouble();

        double imc = wight / (height*height);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso normal");
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

        System.out.println(name + ", Seu IMC é: " + imc);

        sc.close();
    }
}