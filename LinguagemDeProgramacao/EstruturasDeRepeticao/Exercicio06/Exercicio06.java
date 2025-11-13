package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int limiteInferior, limiteSuperior, soma = 0;

        while (true) {
            System.out.print("\nDigite o limite inferior: ");
            limiteInferior = entradaDoTeclado.nextInt();

            System.out.print("Digite o limite superior: ");
            limiteSuperior = entradaDoTeclado.nextInt();

            if(limiteInferior > limiteSuperior){
                System.out.println("Limite inferior maior que o limite superior, entradas inválidas!");
            }else{
                break;
            }
        }


        for (int i = limiteInferior; i <= limiteSuperior; i++) {    
            if(i % 2 == 0){
                if(i == limiteInferior && limiteInferior % 2 == 0 || i == limiteInferior + 1 && limiteInferior % 2 == 1){
                    System.out.print("\n" + i + ", ");
                }else{
                    if(i == limiteSuperior && limiteSuperior % 2 == 0 || i == limiteSuperior - 1 && limiteSuperior % 2 == 1){
                        System.out.print(i + ".\n");
                    }else{
                        System.out.print(i + ", ");
                    }
                }

                soma += i;
            }
        }

        System.out.println("Soma: " + soma);
    }
}

// 6. Criar um programa que leia os limites inferior e superior de um intervalo e imprima todos os números
// pares no intervalo aberto e seu somatório.Suponha que os dados digitados são para um intervalo crescente,
// ou seja, o primeiro valor é menor que o segundo.