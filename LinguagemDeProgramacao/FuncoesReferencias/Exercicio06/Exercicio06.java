package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio06;

public class Exercicio06 {
    public static void main(String[] args) {
        char listaLetras[] = {'A', 's', 'a', 'f', 'e'};
        System.out.println(juntarLetras(listaLetras));
    }

    static String juntarLetras(char[] listaLetras){
        String palavras = "";
        for (int i = 0; i < listaLetras.length; i++) {
            palavras += listaLetras[i];
        }
        return palavras;
    }
}

// 6. Faça uma função que receba um vetor de char por parâmetro e retorne uma string composta pelos caracteres do
// vetor. Faça um programa principal para testar a função e imprimir o resultado do processamento.
// Obs: Não utilizar funções prontas da linguagem para a conversão.