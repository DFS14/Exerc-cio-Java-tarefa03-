package tarefa03;

import java.util.Scanner;

public class Exe09 {

public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora de Taxas Juros");
								
//*************************************Valor da Prestação***************************************************
// Lê o valor original da prestação
System.out.print("Digite o valor original da prestação: ");
float valor = scanner.nextFloat();

//*************************************Taxa de Juros (Dia)**************************************************
// Lê a taxa de juros cobrada diariamente (em decimal, por exemplo, 10% é 0.10)
System.out.print("Digite a taxa de juros cobrada diariamente (em decimal): ");
float taxa = scanner.nextFloat();

//*************************************Dias de Atraso*******************************************************
// Lê o tempo em dias de atraso
System.out.print("Digite a quantidade de dias em atraso: ");
int tempo = scanner.nextInt();

//*************************************Calculo**************************************************************
// Calcula a prestação atualizada
double prestacaoAtualizada = valor + (valor * (taxa / 100) * tempo);

//*********************************************************************************************************
// Exibe o resultado
System.out.println("O valor da prestação atualizado é: R$" + prestacaoAtualizada);
						
								
scanner.close();

		}
}