// package Java.GP.Array.AverageAndPosition;

// import java.io.PrintStream;
// import java.util.Random;
// import java.util.Scanner;

// public class AverageAndPosition {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     PrintStream print = System.out;
//     Random random = new Random();
//     int[] numberArray = new int[200];

//     print.print("Qual o valor máximo para preencher a lista numérica: ");
//     int maxRandomValue = input.nextInt();
    
//     double average = 0;
//     for(int i = 0; i < numberArray.length; i += 1) {
//       int randomValue = random.nextInt(maxRandomValue);
//       numberArray[i] = randomValue;
//       average += randomValue;
//     }
//     average = average / numberArray.length;

//     for(int i = 0; i < numberArray.length; i += 1){
//       int numberValue = numberArray[i];
//       if(numberValue > average)
//         print.println("Valor acima da média " + numberValue + ", posição na lista " + (i+1) + ".");
//     }
//     input.close();
//   }
// }

// // 66. Prepare um programa para ler um vetor com 200 números. Depois desta leitura você deve
// // calcular a média destes números. Seu programa deverá informar a posição e o valor de
// // todos os números que ficaram acima desta média.