// package Java.LinguagemDeProgramacao.Vetores.Exercicio07;

// import java.util.Random;

// public class Exercicio07 {
//     public static void main(String[] args) {
//         Random entradaAleatoria = new Random();
//         final int TOTAL_DE_ITENS = 500;
//         double listaDePrecos[] = new double[TOTAL_DE_ITENS];
//         int listaDeVendas[] = new int[TOTAL_DE_ITENS];
//         double valorTotal = 0;

//         for (int i = 0; i < TOTAL_DE_ITENS; i++) {
//             listaDePrecos[i] = entradaAleatoria.nextDouble(45.00) + 5;
//             listaDeVendas[i] = entradaAleatoria.nextInt(25);
//         }

//         for (int i = 0; i < TOTAL_DE_ITENS; i++) {
//             double valorItem = listaDePrecos[i] * listaDeVendas[i];
//             System.out.printf("\nItem " + i + ": R$%.2f", valorItem);
//             valorTotal += valorItem;
//         }

//         System.out.printf("\n\nValor total arrecadado: R$%.2f\n", valorTotal);
//     }
// }

// // 7. Prepare um programa para ler dois vetores, um com o preço e o outro com a quantidade vendida de 500 produtos.
// // Seu programa deverá informar:
// // (a) O valor arrecadado com cada produto
// // (b) O valor total arrecadado