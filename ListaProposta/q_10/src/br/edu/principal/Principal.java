package br.edu.principal;



import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.printf("Informe o preço de fábrica do carro: \n");

  double custofab = sc.nextDouble();

  if (custofab<=12000) {

	  double porcentagemDist1 = (custofab*5)/100;

	  System.out.println("O valor do carro será R$"+(porcentagemDist1+custofab));

  }

  else if (custofab<=25000){

      double porcentagemDist2 = (custofab*10)/100;

      double porImpostos1 = (custofab*15)/100;

      System.out.println("O valor do carro será R$"+(custofab+porcentagemDist2+porImpostos1));

	}

  else {

	  double porcentagemDist3 = (custofab*15)/100;

	  double porImpostos2 = (custofab*20)/100;

	  System.out.println("O valor do carro será R$"+(custofab+porImpostos2+porcentagemDist3));

  }

}

	}