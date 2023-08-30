package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        
        for(int i=0; i<vetorA.length; i++){
            System.out.println("Digite o valor da posição do vetor A: " + i);
            vetorA[i] = scan.nextInt();
            System.out.println("Digite o valor da posição do vetor B: " + i);
            vetorB[i] = scan.nextInt();
        }

        for(int i=0; i<vetorA.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            //System.out.println("Digite o valor da posição: " + i);
        }

        for(int i=0; i<vetorA.length; i++){
            
            System.out.println(vetorB[i]);
        }
    }
}
