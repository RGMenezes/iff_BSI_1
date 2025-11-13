package Java.LinguagemDeProgramacao.EstruturasSequenciais.CalculadoraDeDeslocamento;

import java.util.Scanner;

public class CalculadoraDeDeslocamento {
  public static void main(String[] args) {
    Scanner entradaDoTeclado = new Scanner(System.in);
    double espacoInicial, velocidade, tempo, deslocamento;

    System.out.print("Digite o espaço inicial (m): ");
    espacoInicial = entradaDoTeclado.nextDouble();

    System.out.print("Digite a velocidade (m/s): ");
    velocidade = entradaDoTeclado.nextDouble();

    System.out.print("Digite a tempo (s): ");
    tempo = entradaDoTeclado.nextDouble();

    deslocamento = espacoInicial + tempo * velocidade;

    System.out.println("\nDeslocamento de " + String.format("%.2f", deslocamento) + "m.");

    entradaDoTeclado.close();
  }
}

// 5. Prepare um algoritmo para calcular a posi¸c˜ao para a qual se deslocou um m´ovel em movimento retil´ıneo uniforme
// dada a seguinte f´ormula:
// S = So + V ∗ T. Inicialmente o algoritmo dever´a perguntar ao usu´ario os valores do espa¸co inicial(So), da
// velocidade(V ) e do tempo(T). Ap´os a entrada dos devidos valores estes devem ser substitu´ıdos na f´ormula,
// resultando assim na posi¸c˜ao de deslocamento(S) que dever´a ser informada na tela do usu´ario.