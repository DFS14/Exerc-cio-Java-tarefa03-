package tarefa03;

import java.util.Scanner;

public class Exe04 {

	 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora Custo do Carro");
	
//*************************************Custo do Carro***********************************
// Lê o custo de fábrica do carro
System.out.print("Digite o custo de fábrica do carro: ");
double custoFabrica = scanner.nextDouble();

//*************************************Custo do Distribuidor****************************
// Calcula o custo do distribuidor (28% do custo de fábrica)
double custoDistribuidor = 0.28 * custoFabrica;

//*************************************Valor dos Impostos*******************************
// Calcula o valor dos impostos (45% do custo de fábrica)
double impostos = 0.45 * custoFabrica;

//**************************************Calculo*****************************************
// Calcula o custo final ao consumidor
double custoFinal = custoFabrica + custoDistribuidor + impostos;

//**************************************************************************************
// Exibe o resultado
System.out.println("O custo final ao consumidor é: R$" + custoFinal);


scanner.close();

	}

}
