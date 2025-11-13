package Java.LinguagemDeProgramacao.Funcoes.Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.print("Digite seu sexo: ");
        char sexo = entradaDoTeclado.next().charAt(0);

        System.out.println(DeterminarSexo(sexo));
    }

    static String DeterminarSexo(char valor){
        String mensagem;
        if(valor == 'f' || valor == 'F'){
            mensagem = "F - Feminino";
        }else{
            if(valor == 'm' || valor == 'M'){
                mensagem = "M - Masculino";
            }else{
                mensagem = "Sexo Inválido";
            }
        }
        return mensagem;
    }
}
// 4. Implemente uma função que receba uma letra e retorne ”F - Feminino”, ”M - Masculino” ou ”Sexo Inválido”
// conforme a letra informada. A função deve funcionar para letras maiúsculas e minúsculas.