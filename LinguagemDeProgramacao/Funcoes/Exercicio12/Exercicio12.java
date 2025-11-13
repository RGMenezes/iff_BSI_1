package Java.LinguagemDeProgramacao.Funcoes.Exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int idadeDoUsuario;

        System.out.print("\nDigite a sua idade: ");
        idadeDoUsuario = entradaDoTeclado.nextInt();

        System.out.println(VerificadorCategoria(idadeDoUsuario));
    }

    static String VerificadorCategoria(int idade){
        String mensagem;
        if(idade < 5){
            mensagem = "Você não tem idade suficiente.";

        }else{
            if(idade <= 7){
                mensagem = "Infantil A";

            }else{
                if(idade <= 10){
                    mensagem = "Infantil B";

                }else{
                    if(idade <= 13){
                        mensagem = "Juvenil A";

                    }else{
                        if(idade <= 17){
                            mensagem = "Juvenil B";
                        }else{
                            mensagem = "Adulto";
                        }
                    }
                }
            }
        }
        return mensagem;
    }
}

// 12. Crie uma função que receba a idade de um nadador e retorne a categoria dele, de acordo com a seguinte
// classificação: infantil A (5-7 anos), infantil B (8-10 anos), juvenil A (11-13 anos), juvenil B (14-17 anos) e adulto
// (maiores de 18 anos).