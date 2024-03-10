package tarefa03;

import java.util.Scanner;


public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora da Idade em Dias");
        
        //***********************Anos***********************************************************//
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        //***********************Meses**********************************************************//
        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();
        
        //***********************Dias***********************************************************//
        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        //***********************Calculo*******************************************************//
        // Calcula a idade total em dias
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        // Exibe o resultado
        System.out.println("A idade dessa pessoa expressa apenas em dias é: " + idadeEmDias + " dias");
        
        scanner.close();
    }
}