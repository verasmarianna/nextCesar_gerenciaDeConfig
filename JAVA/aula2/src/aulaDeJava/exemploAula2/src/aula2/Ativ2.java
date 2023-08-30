package aula2;

import java.util.Scanner;

public class Ativ2 {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o valor da base");
        int base = ENTRADA.nextInt(); //declaracado de variavel: tipo nome = valor;
        System.out.println("Digite o valor da altura");
        int altura = ENTRADA.nextInt();
        
        double perimetro = 2 * (base + altura);
        System.out.println("O perímetro do retangulo é: " + perimetro);

        double area = (base * altura);
        System.out.println("A área do retangulo é: " + area);
    }
}

//P=2(b+h)
//a = b*h
// Escrever um programa que leia dois números reais do 
// teclado que representem base e altura de um retângulo,
// e que calcule e imprima no console a área e o perímetro
// do retângulo correspondente às medidas lidas.