package Java.LinguagemDeProgramacao.Vetores.Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        final int TAMANHO_DA_LISTA = 30;
        double media = 0;
        String listaNomes[] = new String[TAMANHO_DA_LISTA];
        int listaIdade[] = new int[TAMANHO_DA_LISTA];

        for (int i = 0; i < TAMANHO_DA_LISTA; i++) {
            System.out.print("\nDigite o nome: ");
            listaNomes[i] = entradaDoTeclado.nextLine();

            System.out.print("Digite a idade: ");
            int idade = entradaDoTeclado.nextInt();
            entradaDoTeclado.nextLine();

            listaIdade[i] = idade;
            media += idade;
        }

        media = media / TAMANHO_DA_LISTA;

        for (int i = 0; i < TAMANHO_DA_LISTA; i++) {
            if(listaIdade[i] > media){
                System.out.println("\n" + listaNomes[i]);
            }
        }
    }
}

// 6. Prepare um programa para ler o nome e a idade de 30 pessoas. Ap´os a leitura dos dados o programa dever´a
// informar o nome de todas as pessoas que ficarem acima da m´edia de idades.