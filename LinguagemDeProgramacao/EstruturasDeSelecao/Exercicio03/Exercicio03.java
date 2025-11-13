package Java.LinguagemDeProgramacao.EstruturasDeSelecao.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        char sexoDoUsuario;

        System.out.print("\nDigite o seu Sexo: ");
        sexoDoUsuario = entradaDoTeclado.next().charAt(0);

        if(sexoDoUsuario == 'F' || sexoDoUsuario == 'f'){
            System.out.println("F - Feminino");
        }else{
            if(sexoDoUsuario == 'M' || sexoDoUsuario == 'm'){
                System.out.println("M - Masculino");
            }else{
                System.out.println("Sexo inválido");
            }
        }
    }
}

// 3. Fa¸ca um programa que verifique se uma letra digitada ´e ”F” ou ”M”. Conforme a letra escrever: F - Feminino,
// M - Masculino, Sexo Inv´alido.
// Obs: O programa deve funcionar para letras mai´usculas e min´usculas.