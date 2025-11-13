package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int primeiroValor, segundoValor, produto = 0;

        System.out.print("Digite o primeiro valor: ");
        primeiroValor = entradaDoTeclado.nextInt();

        System.out.print("Digite o segundo valor: ");
        segundoValor = entradaDoTeclado.nextInt();

        if(primeiroValor != 0 && segundoValor != 0){
            if(primeiroValor < 0){
                for (int i = 0; i < -primeiroValor; i++) {
                    produto += segundoValor;
                }
                produto = -produto;

            }else{
                for (int i = 0; i < primeiroValor; i++) {
                    produto += segundoValor;
                }
            }
        }

        System.out.println("Resultado: " + produto);
    }
}
// 10. Faça a multiplicação entre dois números usando somente soma.(Utilizar a estrutura de repetição for)