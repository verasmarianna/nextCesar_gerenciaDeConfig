package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        for(int i=0; i<vetorA.length; int++){
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; int++){
            System.out.println("Digite o valor da posição: " + i);
            vetorB[i] = vetorA[i];
        }

        for(int i=0; i<vetorA.length; int++){
            System.out.println(vetorB[i]);
        }
    }
}
