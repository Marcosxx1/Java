// -*- coding: UTF-8 -*-
package test;

import java.util.Scanner;

public class Exercicios {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int op = menu();
		switch (op) {
		case 1:
			System.out.println("Digite o primeiro número: ");
			int a = in.nextInt();
			System.out.println("Digite o segundo numero: ");
			break;

		default:
			break;
		}
	
	}
	public static int menu() {
		System.out.println("Digite a opcao: ");
		System.out.println("1 - Exercicio 1\n"
						 + "2 - Exercicio 2\n"
						 + "3 - Exercicio 3\n"
						 + "4 - Exercicio 4\n"
						 + "5 - Exercicio 5\n"
						 + "6 - Exercicio 6");
		int op = in.nextInt();
		return op;
	}
	public int soma(int a ,int b) {
		return a+b;
	}
}
