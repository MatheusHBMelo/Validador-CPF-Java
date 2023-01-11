/*
	Disciplina: Linguagens e tecnicas de programação para WEB
	Aluno: Matheus Henrique Barbosa de Melo
	Data: 09/06/2020

	Refatoração: 08/01/2022
 */

package application;

import validator.ValidatorCpf;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o CPF que deseja validar: ");
			String cpf = sc.nextLine();

			ValidatorCpf.validarCPF(cpf);
		} catch (NumberFormatException e) {
			System.out.println("ERRO: Digite apenas números!");
		}
	}
}
