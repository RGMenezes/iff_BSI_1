package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }

        System.out.println("\nA soma dos números entre 1 e 1000 é: " + soma);
    }
}

// 3. Prepare um programa para somar os números compreendidos entre 1 e 1000. (Utilizar a estrutura de
// repetição for)