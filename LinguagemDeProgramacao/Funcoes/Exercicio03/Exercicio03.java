package Java.LinguagemDeProgramacao.Funcoes.Exercicio03;

import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
         Random entradaAleatoria = new Random();
        int valor = entradaAleatoria.nextInt(100) - 50;

        System.out.println("\nValor: " + valor);
        System.out.println("Ele é: " + VerifircarPosNulNeg(valor));
    }

    static String VerifircarPosNulNeg(int valor){
        String retorno = "";
        if(valor > 0){
            retorno = "Positivo";
        }else{
            if(valor == 0){
                retorno = "Nulo";
            }else{
                retorno = "Negativo";
            }
        }

        return retorno;
    }
}

// 3. Crie uma função que receba um valor e retorne se o valor é positivo, negativo ou nulo.