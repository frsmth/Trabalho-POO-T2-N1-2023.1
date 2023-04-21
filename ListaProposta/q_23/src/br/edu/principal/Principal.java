package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o código do produto comprado: ");
        int codigo = sc.nextInt();
        double preco = 0;
        if (codigo<40) {
        System.out.println("Por favor, digite a quantidade do produto comprado: ");
        int quantidade = sc.nextInt();

        if ((codigo >= 1) & (codigo <= 10)) {
           preco = 10.00;
        }
        if ((10 < codigo) & (codigo <= 20)) {
            preco = 15.00;
        }
        if ((20 < codigo) & (codigo <= 30)) {
            preco = 20.00;
        }
        if ((30 < codigo) & (codigo <= 40)) {
            preco = 30.00;
            }
        double precoTotal = preco * quantidade;
        System.out.println("O preço total, sem descontos, é: R$"+precoTotal);
    if (precoTotal<250) {
      double precoDesconto = (precoTotal * 0.05);
      System.out.println("O valor do desconto será: R$"+precoDesconto);
      System.out.println("O preço final será: R$"+(precoTotal-precoDesconto));
    }
    else if (precoTotal<500) {
      double precoDesconto = (precoTotal * 0.10);
      System.out.println("O valor do desconto será: R$"+precoDesconto);
      System.out.println("O preço final será: R$"+(precoTotal-precoDesconto));
    }
    else {
      double precoDesconto = (precoTotal * 0.15);
      System.out.println("O valor do desconto será: R$"+precoDesconto);
      System.out.println("O preço final será: R$"+(precoTotal-precoDesconto));
    }
        }
        else {
          System.out.println("Ei, não há produto com esse código! Logo, não podemos calcular os valores!");
        }
  }
}