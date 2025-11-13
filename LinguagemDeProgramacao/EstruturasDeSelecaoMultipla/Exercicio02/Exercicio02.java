package Java.LinguagemDeProgramacao.EstruturasDeSelecaoMultipla.Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaDoTeclado = new Scanner(System.in);
        double alturaUsuario, pesoUsuario, pesoIdeal = 0;
        char sexoUsuario;

        System.out.print("\nDigite a sua altura: ");
        alturaUsuario = entradaDoTeclado.nextDouble();

        System.out.print("Digite o seu peso: ");
        pesoUsuario = entradaDoTeclado.nextDouble();

        System.out.print("Digite o seu sexo (f/m): ");
        sexoUsuario = entradaDoTeclado.next().charAt(0);

        switch (sexoUsuario) {
            case 'f':
            case 'F':
                pesoIdeal = 62.1 * alturaUsuario - 44.7;
                break;
            case 'm':
            case 'M':
                pesoIdeal = 72.7 * alturaUsuario - 58;
                break;
            default:
                System.out.println("Não indentificamos o seu sexo!");
                break;
        }

        if (pesoIdeal > 0) {
            if(pesoUsuario >= pesoIdeal-1 && pesoUsuario <= pesoIdeal + 1){
                System.out.println("Seu peso é o ideal.");
            }else{
                if(pesoUsuario > pesoIdeal){
                    System.out.println("Seu peso está acima do ideal.");
                }else{
                    System.out.println("Seu peso está abaixo do ideal.");
                }
            }
        }
    }
}

// 2. Tendo como dados de entrada a altura o sexo e o peso de uma pessoa, construa um algoritmo que calcule seu
// peso ideal, utilizando as seguintes f´ormulas:
// . Para homens: (72.7*h) - 58
// . Para mulheres: (62.1*h) - 44.7 (h = altura)
// Informe se o peso da pessoa est´a dentro, acima ou abaixo do peso (Considere a margem de erro de 1 Kg para
// mais ou para menos como estando no peso ideal).