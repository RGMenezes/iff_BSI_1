package Java.GP.Repetition_Structures.TheEpicRun;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

public class TheEpicRun {
  public static void main(String[] args) {
    PrintStream print = System.out;
    String[] runPosition = new String[70];
    Arrays.fill(runPosition, "_");
    Turtle turtle = new Turtle(0, "Eu vou subir, eu vou SUBIiir...");
    Hare hare = new Hare(0, "Mais uma subida no monte.");
    
    print.println("\nSenhoras e senhores, estamos mais uma vez apresentando a SUPER CORRIDA, veremos uma belíssima batalha entre a tartaruga e a lebre. \n" + //
    "Se preparem que a corrida vai começar!\n"
    );
    
    print.println("Tartaruga: " + turtle.speech);
    print.println("Lebre: " + hare.speech);
    
    print.println("\nBANG!!!! E ELES PARTIRAM!!!!");
    
    while (true) {
      turtle = turtleAction(turtle);
      hare = hareAction(hare);
      Arrays.fill(runPosition, "_");
      
      print.println("\n\n");
      if(turtle.position == hare.position) {
        runPosition[turtle.position] = "OUTH";
        print.println("Tartaruga: Tomaaa!");
        print.println("Lebre: OUTH!!! Sua Tartaruga pilantra!");
        
      }else{
        runPosition[turtle.position] = "T";
        print.println("Tartaruga: " + turtle.speech);
        
        runPosition[hare.position] = "L";
        print.println("Lebre: " + hare.speech);
      }

      for(int i = 0; i < 70; i += 1){
        print.print(runPosition[i]);
      }
      print.println("");

      if(!runPosition[69].equalsIgnoreCase("_")){
        print.println("\n\n");
        if(runPosition[69].equalsIgnoreCase("T")){
          print.println("TARTARUGA VENCEU!!! YAY!!!\n");
          print.println("Tartaruga: WE ARE CHAMPIONS MY FRIEND!!!");
          print.println("Lebre: Vai ter volta, aguarde!");
          
        }else if(runPosition[69].equalsIgnoreCase("L")){
          print.println("LEBRE VENCEU!!! YUCH!!!\n");
          print.println("Lebre: RESPEITA O PAI!!!");
          print.println("Tartaruga: É acabou.");
          
        }else{
          print.println("EMPATE!!!\n");
          print.println("Tartaruga: Foi uma batalha justa.");
          print.println("Lebre: Igualmente.");

        }
        break;
      }
    }
  }

  public static class Turtle {
    int position;
    String speech;

    public Turtle(int position, String speech){
      this.position = position;
      this.speech = speech;
    }
  }
  public static Turtle turtleAction(Turtle turtle){
    Random random = new Random();
    int valueR = random.nextInt(9) + 1;

    if(valueR <= 5){
      turtle.position += 3;
      turtle.speech = "Eu sou a VELOCIDADE!";
      
    }else if (valueR <= 7){
      if(turtle.position < 6) turtle.position = 0;
      else turtle.position -= 6;
      turtle.speech = "AI meu casco!";
      
    }else{
      turtle.position += 1;
      turtle.speech = "Devagar e calmo.";
    }

    if(turtle.position > 69) turtle.position = 69;
    
    return turtle;
  }

  public static class Hare {
    int position;
    String speech;

    public Hare(int position, String speech){
      this.position = position;
      this.speech = speech;
    }
  }
  public static Hare hareAction(Hare hare){
    Random random = new Random();
    int valueR = random.nextInt(9) + 1;

    if(valueR <= 2) hare.speech = "Hora de tirar uma sonequinha.";
    else if (valueR <= 4){
      hare.position += 9;
      hare.speech = "Eu sou do BALACOBACO!";
      
    }else if (valueR <= 5){
      if(hare.position < 12) hare.position = 0;
      else hare.position -= 12;
      hare.speech = "Agora eu me lasquei...";
      
    }else if (valueR <= 8){
      hare.position += 1;
      hare.speech = "Caminhando eu vou, para Canaã...";
      
    }else{
      if(hare.position < 2) hare.position = 0;
      else hare.position -= 2;
      hare.speech = "Tão lutando contra o meu PROGRESSO!";
    }

    if(hare.position > 69) hare.position = 69;
    
    return hare;
  }
}


// Neste problema você recriará um dos momentos verdadeiramente grandiosos da história,
// que é a clássica corrida entre a lebre e a tartaruga. Você usará a geração aleatória de
// números para desenvolver uma simulação desse memorável evento.
// Nossos competidores começam a corrida no "quadro1" de setenta quadrados. Cada
// quadrado representa uma posição possível ao longo do trajeto da corrida. A linha de
// chegada está no quadrado 70. O primeiro competidor a alcançar ou passar do quadrado 70
// ganha uma cesta de cenouras e alface. O trajeto da corrida inclui uma subida pela encosta
// de uma montanha escorregadia, portanto, ocasionalmente, os competidores perdem terreno.
// Há um relógio que emite um tique por segundo. A cada tique do relógio, seu programa deve
// ajustar a posição dos animais de acordo com as seguintes regras:
// Animal Tipo de
// Movimento
// Porcentage
// m de Tempo
// Movimento real

// Tartaruga
// Movimento rápido 50% 3 quadrados para a direita
// Escorregão 20% 6 quadrados para a esquerda
// Movimento Lento 30% 1 quadrado para a direita

// Lebre 
// Sono 20% Nenhum movimento
// Salto grande 20% 9 quadrados para a direita
// Grande escorregão 10% 12 quadrados para a esquerda
// Salto pequeno 30% 1 quadrado para a direita
// Pequeno escorregão 20% 2 quadrados para a esquerda

// Use variáveis para controlar as posições dos animais (i.e., os números das posições vão de 1 a
// 70). Cada animal inicia na posição 1 (i.e. "linha de partida"). Se um animal escorregar para
// antes do quadrado 1, leve o animal de volta ao quadrado 1.
// Gere as porcentagens da tabela anterior produzindo um inteiro aleatório, i, no intervalo 1 ≤ i ≤
// 10. Para a tartaruga, realize um "movimento rápido" quando 1 ≤ i ≤ 5, um " escorregão"
// quando 6 ≤ i ≤ 7 ou um "movimento lento" quando 8 ≤ i ≤ 10 . Use uma técnica similar
// para mover a lebre.
// Comece a corrida imprimindo:
// BANG!!!!
// E ELES PARTIRAM!!!!
// Depois, para cada clique do relógio (i.e. a cada repetição do loop), imprima uma linha com 70
// posições mostrando a letra "T' na posição da tartaruga e "L" na posição da lebre.
// Ocasionalmente, os competidores estarão no mesmo quadrado. Nesse caso, a tartaruga morde a
// lebre e seu programa deve imprimir "OUCH!!!" iniciando naquela posição. Todas as posições
// impressas diferentes das que levam o "T" , o "L" e a palavra "OUCH!!!" (no caso de os
// animais ocuparem o mesmo quadrado) devem estar em branco.
// Depois de cada linha ser impressa, teste se algum dos animais alcançou ou passou do quadrado
// 70. Em caso positivo, imprima o vencedor e termine a simulação. Se a tartaruga vencer,
// imprima TARTARUGA VENCEU!!! YAY!!! Se a lebre vencer, imprima LEBRE
// VENCEU!!! YUCH!!! Se ambos os animais venceram no mesmo tique do relógio, você
// pode querer favorecer a tartaruga ("a parte mais fraca") ou pode desejar imprimir Houve um
// Empate. Se nenhum animal vencer, realize o loop novamente para simular o próximo tique
// do relógio.