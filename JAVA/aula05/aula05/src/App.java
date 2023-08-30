public class App {

//questao 1 e 2

//     public static void main(String[] args) throws Exception {
//         int vetorA[] = {1, 2, 3, 4, 5};
//         int vetorB[] = new int [5];

//         for (int i=0; i<5; i++){
//             vetorB[i] = vetorA[i];
//             //System.out.println(vetorB[i]); //questao 1
//             System.out.println(vetorB[i]*2); //questao 2
//             //System.out.println(vetorA[i] + " - " + vetorB[i]); //questao 1
//         }
        
//     }
// }

//questao 3
public static void main(String[] args) throws Exception {
    int vetorA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int vetorB[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int vetorC[] = new int [10];

    for (int i=0; i<10; i++){
        vetorC[i] = vetorB[i] + vetorA[i];
        System.out.println(vetorC[i]); //questao 3
        }
    }
}