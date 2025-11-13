package Java.LinguagemDeProgramacao.RevisaoP1.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        int amostraDeUsuarios = 0;
        String nomeDoUsuario, nacionalidadeDoUsuario, nomePessoaMaisPesada = "";
        String nomeDaMulherBrasileiraMaisLeve = "Não há mulher brasileira!";
        char sexoDoUsuario;
        double pesoDoUsuario, mediaDePeso, pesoDaPessoaMaisPesada, pesoDaMulherBRMaisLeve = Double.MAX_VALUE;
        mediaDePeso = pesoDaPessoaMaisPesada = 0;

        System.out.print("\nNúmero total de pessoas: ");
        amostraDeUsuarios = entradaDoTeclado.nextInt();
        entradaDoTeclado.nextLine();

        for (int i = 0; i < amostraDeUsuarios; i++) {
            System.out.print("\nNome: ");
            nomeDoUsuario = entradaDoTeclado.nextLine();

            System.out.print("Peso: ");
            pesoDoUsuario = entradaDoTeclado.nextDouble();
            mediaDePeso += pesoDoUsuario;

            if(pesoDoUsuario > pesoDaPessoaMaisPesada){
                pesoDaPessoaMaisPesada = pesoDoUsuario;
                nomePessoaMaisPesada = nomeDoUsuario;
            }

            System.out.print("Nacionalidade: ");
            nacionalidadeDoUsuario = entradaDoTeclado.next();

            while (true) {
                System.out.print("Sexo: ");
                sexoDoUsuario = entradaDoTeclado.next().charAt(0);
                entradaDoTeclado.nextLine();

                boolean podeParar = false;
                switch (sexoDoUsuario) {
                    case 'f':
                    case 'F':   
                        if(nacionalidadeDoUsuario.equalsIgnoreCase("Brasileira") && pesoDoUsuario < pesoDaMulherBRMaisLeve){
                            pesoDaMulherBRMaisLeve = pesoDoUsuario;
                            nomeDaMulherBrasileiraMaisLeve = nomeDoUsuario;
                        }
                    case 'm':
                    case 'M':
                        podeParar = true;
                        break;
    
                    default:
                        System.out.println("\n[ERROR] Sexo inválido! Tente novamente.");
                        break;
                }

                if(podeParar){
                    break;
                }
            }

        }
        mediaDePeso /= amostraDeUsuarios;

        System.out.printf("\nMédia de peso: %.2f", mediaDePeso);
        System.out.println("\nPessoa mais pesada: " + nomePessoaMaisPesada);
        System.out.println("Mulher brasileira mais leve: " + nomeDaMulherBrasileiraMaisLeve);

    }
}

// 3. Prepare um algoritmo para perguntar a um certo número de pessoas seu nome, sexo, peso e nacionalidade.
// Informe:
// (a) A média de peso destas pessoas
// (b) O nome da pessoa mais pesada
// (c) O nome da mulher brasileira mais leve