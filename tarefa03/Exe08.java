package tarefa03;

import java.util.Scanner;

public class Exe08 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora de Litros Gastos");
						
//**************************************Tempo Gasto - Horas*************************************************
//Lê o tempo gasto na viagem (em horas)
System.out.print("Digite o tempo gasto na viagem (em horas): ");
float tempo = scanner.nextFloat();

//**************************************Velocidade média - Km/h*********************************************
// Lê a velocidade média durante a viagem (em km/h)
System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
float velocidade = scanner.nextFloat();

//**************************************Distância Percorrida************************************************
// Calcula a distância percorrida
float distancia = tempo * velocidade;

//**************************************Quantidade de Litros Gastos*****************************************
// Calcula a quantidade de litros de combustível utilizada
float litrosUsados = distancia / 12;

//*********************************************************************************************************
// Exibe os resultados
System.out.println("Velocidade média: " + velocidade + " km/h");
System.out.println("Tempo gasto na viagem: " + tempo + " horas");
System.out.println("Distância percorrida: " + distancia + " km");
System.out.println("Quantidade de litros de combustível utilizada: " + litrosUsados + " litros");
						
scanner.close();

	}

}