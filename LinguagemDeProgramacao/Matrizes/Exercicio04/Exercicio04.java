// package Java.LinguagemDeProgramacao.Matrizes.Exercicio04;

// import java.util.Random;

// public class Exercicio04 {
//     public static void main(String[] args) {
//         final int DELEGACOES = 5, ATLETAS = 10;
//         double tabelaDeControle[][] = new double[DELEGACOES][ATLETAS];

//         PreencherMatriz(tabelaDeControle, 2.2);

//         for (int delegacao = 0; delegacao < tabelaDeControle.length; delegacao++) {
//             double maiorAltura = 0;
//             System.out.print("\nMaior altura " + (delegacao + 1) + "ª delegação: ");
//             for (int atleta = 0; atleta < tabelaDeControle[delegacao].length; atleta++) {
//                 double alturaAtleta = tabelaDeControle[delegacao][atleta];
//                 if(alturaAtleta > maiorAltura){
//                     maiorAltura = alturaAtleta;
//                 }
//             }
//             System.out.printf("%.2f metros\n", maiorAltura);
//         }


//     }

//     static void PreencherMatriz(double[][] matriz, double valorMaximo){
//         Random entradaAleatoria = new Random();
//         for (int linha = 0; linha < matriz.length; linha++) {
//             for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
//                 matriz[linha][coluna] = entradaAleatoria.nextDouble(valorMaximo - 1.5) + 1.5;
//             }
//         }
//     }

// }

// // 4. Criar um programa que possa armazenar em uma matriz as alturas de dez atletas de cinco delegações que
// // participarão dos jogos de verão. Imprimir a maior altura de cada delegação.