/*
	// Estudado e contruido por Matheus HB Melo - ADS/SENAC
 */

package application;

import validator.ValidatorCpf;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("Digite o CPF que deseja validar: ");
			String cpf = sc.nextLine();

			ValidatorCpf.validatecpf(cpf);
		}
		catch (NumberFormatException e){
			System.out.println("Digite apenas números!");
		}
	}
}
