package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I = 1 = Ordem decrescente dos números ");
		System.out.println("I = 2 = Ordem decrescente dos números ");
		System.out.println("I = 3 = Maior dos três numeros no meio ");
		System.out.println("Por favor, digite o valor de I: ");
		int I = sc.nextInt();
		System.out.println("Por favor, digite o valor de A: ");
		double A = sc.nextDouble();
		System.out.println("Por favor, digite o valor de B: ");
		double B = sc.nextDouble();
		System.out.println("Por favor, digite o valor de C: ");
		double C = sc.nextDouble();
		if (I == 1) {
			if ( (A < B) && (A < C)) {
				if (B < C) {
					System.out.println("A ordem crescente dos números é "+A+" - "+B+" - "+C);
				}	else {
					System.out.println("A ordem crescente dos números é "+A+" - "+C+" - "+B);
				}}
			if ( (B < A) & (B < C)) {
				if (A < C) {
					System.out.println("A ordem crescente dos números é "+B+" - "+A+" - "+C);
				}	else {
					System.out.println("A ordem crescente dos números é "+B+" - "+C+" - "+A);
				}}
			if ( (C < A) & (C < B)) {
				if (A < B) {
					System.out.println("A ordem crescente dos números é "+C+" - "+A+" - "+B);
				}	else {
					System.out.println("A ordem crescente dos números é "+C+" - "+B+" - "+A);
				}}

	}
		if (I == 2) {
			if ( (A > B) & (A > C)) {
				if (B > C) {
					System.out.println("A ordem decrescente dos números é "+A+" - "+B+" - "+C);
				}	else {
					System.out.println("A ordem decrescente dos números é "+A+" - "+C+" - "+B);
				}}
			if ( (B > A) & (B > C)) {
				if (A > C) {
					System.out.println("A ordem decrescente dos números é "+B+" - " +A+" - "+C);
				}	else {
					System.out.println("A ordem decrescente dos números é "+B+" - "+C+" - "+A);
				}}
			if ( (C > A) & (C > B)) {
				if (A > B) {
					System.out.println("A ordem decrescente dos números é "+C+" - "+A+" - "+B);
				}	else {
					System.out.println("A ordem decrescente dos números é "+C+" - "+B+" - "+A);
				}}

	}
		if (I == 3) {
			if ( (A > B) & (A > C)) {
				System.out.println("A ordem desejada dos números é "+B+" - "+A+" - "+C);
			}
			if ( (B > A) & (B > C)) {
				System.out.println("A ordem desejada dos números é "+A+" - "+B+" - "+C);
			}
			if ( (C > A) & (C > B)) {
				System.out.println("A ordem desejada dos números é "+A+" - "+C+" - "+B);
			}
			

	}
	}

}