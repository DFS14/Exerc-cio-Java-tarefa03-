package tarefa03;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora do Volume");
					
//*************************************Raio da Lata****************************************************
// Lê o raio da lata de óleo
System.out.print("Digite o raio da lata de óleo: ");
float raio = scanner.nextFloat();

//*************************************Altura da Lata**************************************************
// Lê a altura da lata de óleo
System.out.print("Digite a altura da lata de óleo: ");
float altura = scanner.nextFloat();

//*************************************Volume da Lata**************************************************
// Calcula o volume da lata de óleo
double volume = Math.PI * Math.pow(raio, 2) * altura;

//*****************************************************************************************************
// Exibe o resultado
System.out.println("O volume da lata de óleo é: " + volume + " unidades cúbicas");

			
					
scanner.close();

	}

}