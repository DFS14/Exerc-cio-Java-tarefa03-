package tarefa03;

import java.util.Scanner;


public class Exe10 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora de Variáveis");


//*****************************************Variáveis A e B******************************************************
// Lê os valores para as variáveis A e B
System.out.print("Digite o valor para A: ");
int A = scanner.nextInt();

System.out.print("Digite o valor para B: ");
int B = scanner.nextInt();

//*****************************************Variável Auxiliar****************************************************
// Efetua a troca dos valores usando uma variável auxiliar
int auxiliar = A;
A = B;
B = auxiliar;

//**************************************************************************************************************
// Exibe os valores trocados
System.out.println("Valor de A após a troca: " + A);
System.out.println("Valor de B após a troca: " + B);
	
		
		scanner.close();
	}

}

