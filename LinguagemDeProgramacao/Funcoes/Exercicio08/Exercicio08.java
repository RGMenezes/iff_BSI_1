package Java.LinguagemDeProgramacao.Funcoes.Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.print("Digite em valor: ");
        int valor = entradaDoTeclado.nextInt();

        System.out.println(Entre0e100(valor));
    }

    static String Entre0e100(int valor){
        String retorno;
        if(valor > 0 && valor < 100){
            retorno = "Está entre o intervalo.";
        }else{
            retorno = "Não está entre o intervalo.";
        }
        return retorno;
    }
}
// 8. Construa uma função que receba um número e retorne se ele está compreendido no intervalo aberto de 0 a 100
// (0 e 100 não estão incluı́dos).