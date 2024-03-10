package tarefa03;

import java.util.Scanner;

public class Exe03 {
 
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


System.out.println("Calculadora de Reajuste Salarial");

//***********************Salário Atual************************************************//

 // Lê o salário mensal atual
System.out.print("Digite o salário mensal atual: ");
float salarioAtual = scanner.nextFloat();


//***********************Reajuste Salarial*******************************************//

 // Lê o percentual de reajuste
System.out.print("Digite o percentual de reajuste (em decimal): ");
float percentualReajuste = scanner.nextFloat();


//***********************Calculo****************************************************//

// Calcula o novo salário
float novoSalario = (salarioAtual) * (1 + percentualReajuste/100);


//***********************Resultado*************************************************//

// Exibe o resultado
System.out.println("O novo salário é: R$" + novoSalario);


scanner.close();
	

	 }
}