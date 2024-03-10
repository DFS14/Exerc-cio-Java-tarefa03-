package tarefa03;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Calculado de Temperatura");
	
//*******************************Celsius********************************************************
		
	// Lê a temperatura em graus Celsius
    System.out.print("Digite a temperatura em graus Celsius: ");
    int celsius = scanner.nextInt();

//*******************************Fahrenheit*****************************************************
    
    // Calcula a temperatura em Fahrenheit
    double fahrenheit = (9 * celsius + 160) / 5;
    

    // Exibe o resultado
    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
	
		scanner.close();

	}

}
