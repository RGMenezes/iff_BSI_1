package Java.GP.Repetition_Structures.PeopleStatistics1_2;

import java.io.PrintStream;
import java.util.Scanner;

public class PeopleStatistics1_2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    PrintStream print = System.out;
    People[] sample;
    int sampleValue;
    String namePeopleWeight = "", namePeopleWeightF = "";
    double peopleWeightF = Double.MAX_VALUE;
    double averageWeight, peopleWeight;
    averageWeight = peopleWeight = 0;

    print.print("Quantas pessoas participarão do Experimento? ");
    sampleValue = input.nextInt();
    sample = new People[sampleValue];
    
    for(int i = 0; i < sampleValue; i += 1){
      People peopleLoop = new People("", "", "o", 0);
      
      input.nextLine();

      print.println("\n" + (i + 1) + "ª pessoa");
      
      print.print("Nome: ");
      peopleLoop.name = input.nextLine();
      
      while (!(peopleLoop.sex.equalsIgnoreCase("m") || peopleLoop.sex.equalsIgnoreCase("f"))) {
        print.print("Sexo (m/f): ");
        peopleLoop.sex = input.next();
      }
      
      print.print("Nacionalidade: ");
      peopleLoop.nationality = input.next();
      
      print.print("Peso: ");
      peopleLoop.weight = input.nextDouble();
      
      sample[i] = peopleLoop;
    }
    
    for(int i = 0; i < sampleValue; i += 1){
      People people = sample[i];

      averageWeight += people.weight;

      if(peopleWeight < people.weight){
        peopleWeight = people.weight;
        namePeopleWeight = people.name;
      }

      if(people.sex.equalsIgnoreCase("f") && people.nationality.equalsIgnoreCase("Brasileiro")){
        if(peopleWeightF > people.weight){
          peopleWeightF = people.weight;
          namePeopleWeightF = people.name;
        }
      }
    }

    averageWeight = averageWeight / sampleValue;

    print.println(
    "\nA média de peso " + String.format("%.2f", averageWeight) + " Kg.\n" + //
    "Nome da pessoa mais pesada: " + namePeopleWeight + ".\n" + //
    "Nome da mulher brasileira mais leve: " + namePeopleWeightF + "."
    );

    input.close();
  }

  public static class People{
    String name;
    String nationality;
    String sex;
    double weight;

    public People(String name, String nationality, String sex, double weight){
      this.name = name;
      this.nationality = nationality;
      this.sex = sex;
      this.weight = weight;
    }
  }
}