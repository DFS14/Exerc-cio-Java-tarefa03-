package tarefa03;

import java.util.Scanner;

public class Exe06 {


public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora de Temperatura");
			
//****************************************Fahrenheit***********************************************

// Lê a temperatura em graus Fahrenheit
System.out.print("Digite a temperatura em graus Fahrenheit: ");
float fahrenheit = scanner.nextFloat();

//****************************************Celsius**************************************************
// Calcula a temperatura em Celsius
double celsius = (fahrenheit - 32) * (5.0 / 9.0);

//**************************************************************************************************

// Exibe o resultado
System.out.println("A temperatura em Celsius é: " + celsius + "°C");
	
			
scanner.close();

	}

}