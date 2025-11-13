package Java.LinguagemDeProgramacao.EstruturasDeRepeticao.Exercicio08;

public class Exercicio08 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 1;

        while (contador < 1000) {
            if(contador % 3 == 0 || contador % 5 == 0){
                soma += contador;
            }
            contador++;
        }

        System.out.println("Soma: " + soma);
    }
}

// 8. Se tivermos uma lista dos números naturais menores do que 10 que são múltiplos de 3 ou 5 obtemos 3,
// 5, 6 e 9. A soma destes múltiplos é 23. Imprima a soma dos múltiplos de 3 ou 5 menores do que 1000.
// (Utilizar a estrutura de repetição while)