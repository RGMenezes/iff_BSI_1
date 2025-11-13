package Java.LinguagemDeProgramacao.JogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        char Tabuleiro[][] = new char[3][3];

        preencherMatrix(Tabuleiro, -1, -1);
        System.out.println(mostrarTabuleiro(Tabuleiro));

        
    }

    static String mostrarTabuleiro(char[][] tabuleiro){
        String mensagem = "";
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                mensagem += tabuleiro[linha][coluna];
                if(coluna != 2){
                    mensagem += " | ";
                }
            }
            if(linha != 2){
                mensagem += "\n- + - + - ";
            }
            mensagem += " \n";
        }
        return mensagem;
    }

    static void preencherMatrix(char[][] matriz, int elementoL, int elementoC){
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if(validarCoordenada(linha, coluna)){

                }else{
                    matriz[linha][coluna] = '#';
                }
            }
        }
    }

    static boolean validarCoordenada(int linha, int coluna){
        if(linha < 0 && linha > 2 || coluna < 0 && coluna > 2){
            return true;
        }
        return false;
    }
}

// exibirTabuleiro()

// fazerJogada()

// verificarVencedor()

// verificarEmpate()

// alternarJogador()