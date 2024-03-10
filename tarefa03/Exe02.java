package tarefa03;

import java.util.Scanner;


public class Exe02 {

public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
System.out.println("Calculadora do Total de Votos");
		 
//***********************Total de Votos***********************************************************//
		 
System.out.print("Digite a quantidade total de votos: ");
int totalVotos = scanner.nextInt();
	        
//************************Total de Votos Válidos**************************************************//   
	        
System.out.print("Digite a quantidade votos válidos: ");
int totalValido = scanner.nextInt();
// Calcula o total votos Válidos dos eleitores de um municipio
float numeroEleitores = (totalValido *100 /totalVotos);	        
// Exibe o resultado
 System.out.println("Percentual Votos Válidos: " + numeroEleitores + "%");
 
 
//**********************Total de Votos Nulos**************************************************//
System.out.print("Digite a quantidade votos nulos: ");
int totalNulo = scanner.nextInt();	        
// Calcula o total votos Nulos dos eleitores de um municipio
float numeroEleitoresNulo = (totalNulo *100 /totalVotos);	        
// Exibe o resultado
System.out.println("Percentual Votos Nulos: " + numeroEleitoresNulo + "%");
	 

//***********************Total de Votos Brancos************************************************//
 System.out.print("Digite a quantidade votos brancos: ");
int totalBranco = scanner.nextInt();
//Calcula o total votos Brancos dos eleitores de um municipio
float numeroEleitoresBranco = (totalBranco *100 /totalVotos);	        
//Exibe o resultado
System.out.println("Percentual Votos Brancos: " + numeroEleitoresBranco + "%");


scanner.close();
	}

}
