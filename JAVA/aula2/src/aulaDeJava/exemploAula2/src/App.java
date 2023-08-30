// Escrever um programa em JAVA que, dados dois números reais, 
// calcule a média aritmética entre eles e a imprima no console.
// Estes dois números podem ser definidos no início do programa como variáveis.

import java.util.Scanner;

public class App {
    private static final Scanner ENTRADA = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o primeiro valor");
        double valorInt1 = ENTRADA.nextDouble(); //declaracado de variavel: tipo nome = valor;
        System.out.println("Digite o segundo valor");
        double valorInt2 = ENTRADA.nextDouble();
        
        double media = (valorInt1+valorInt2)/2;

        //System.out.println((valorInt1+valorInt2)/2);
        System.out.println("A média entre os dois valores é: " + media);

    }
}
