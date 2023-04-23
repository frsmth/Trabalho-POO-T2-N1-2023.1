
package br.edu.principal;



import java.util.Scanner;



public class Principal {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("OPERAÇÕES\n");

  System.out.println("1- Média entre os dois números\n2- Diferença do maior pelo menor\n3- O produto entre os dois números");

  System.out.println("Digite a operação a ser executada:\n");

  double op = sc.nextDouble();

 

  if (op==1) {

	  System.out.println("Digite o primeiro número: \n");

	  double num1 = sc.nextDouble();

	  System.out.println("Digite o segundo número: \n");

	  double num2 = sc.nextDouble();

	  System.out.println("A média entre os dois números é: "+(num1+num2)/2);

  }

  else if (op==2) {

	  System.out.println("Digite o primeiro número: \n");

	  double num1 = sc.nextDouble();

	  System.out.println("Digite o segundo número: \n");

	  double num2 = sc.nextDouble();

	  if (num1>num2) {

		  System.out.println("A diferença do maior número pelo menor é: "+(num1-num2));

	  }

	  else {

		  System.out.println("A diferença do maior número pelo menor é: "+(num2-num1));

	  }

	 

  }

  else if (op==3) {

	  System.out.println("Digite o primeiro número: \n");

	  double num1 = sc.nextDouble();

	  System.out.println("Digite o segundo número: \n");

	  double num2 = sc.nextDouble();

	  System.out.println("O produto dos dois números é: "+(num1*num2));



  }

  else {

	  System.out.println("O número digitado não é correspondente com nenhuma operacão!");

	 

  }

	}

}