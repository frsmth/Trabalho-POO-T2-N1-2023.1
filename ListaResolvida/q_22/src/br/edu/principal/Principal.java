package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o código do funcionário: ");
        double codigo = sc.nextInt();
        System.out.println("Por favor, digite o salário base do funcionário: ");
        double salBase = sc.nextInt();
        System.out.println("Por favor, digite o tempo de serviço do funcionario em anos: ");
        double tempo = sc.nextInt();
        double imposto = 0;
        double grat = 0;
        if (salBase < 200) {
        	imposto = 0;
        }
        else if (salBase <= 450) {
    		imposto = 0.03 * salBase;
        }
        else if (salBase < 700) {
        	imposto = 0.08 * salBase;
        }
        else {
        	imposto = 0.12 * salBase;
        }
        System.out.println("O valor do imposto será igual a "+imposto+" reais.");
        if (salBase > 500) {
        	if (tempo <= 3) {
        		grat = 20;
        	}
        	else {
        		grat = 30;
        	}
        }
        else {
        	if (tempo <= 3) {
        		grat = 23;
        	}
        	else if (tempo <= 6) {
        		grat = 35;
        	}
        	else {
        		grat = 33;
        	}
        }
        System.out.println("O valor da gratificação será igual a "+grat+" reais.");
        double liquido = salBase - imposto + grat;
        System.out.println("O salário líquido é igual a "+liquido+" reais.");
        if (liquido <= 350) {
        	System.out.println("Classificação A");
        }
        else if (liquido < 600) {
        	System.out.println("Classificação B");
        }
        else {
        	System.out.println("Classificação C");
        }

	}

}
