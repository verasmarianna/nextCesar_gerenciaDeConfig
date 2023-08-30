package aula2;

import java.util.Scanner;

public class Aula1 {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o primeiro valor");
        int valorInt1 = ENTRADA.nextInt(); //declaracado de variavel: tipo nome = valor;
        System.out.println("Digite o segundo valor");
        int valorInt2 = ENTRADA.nextInt();
        
        double media = Math.sqrt(valorInt1 * valorInt2);

        System.out.println("A multiplicação entre os dois valores é: " + media);
    }
}
