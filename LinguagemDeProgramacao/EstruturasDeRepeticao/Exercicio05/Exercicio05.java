package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        for (int i = 200; i >= 100; i--) {
            if(i == 200){
                System.out.print("\n" + i + ", ");
            }else{
                if(i == 100){
                    System.out.print(i + ".");
                }else{
                    System.out.print(i + ", ");
                }
            }
        }
    }
}

// 5. Escreva um programa que imprima todos os números inteiros de 200 a 100 (em ordem decrescente).