package br.edu.principal;
import java.util.Scanner;
public class Principal {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o preço do produto: ");
      double preco = sc.nextDouble();
      System.out.print("Digite o código de origem do produto: ");
      int codOri = sc.nextInt();
      String procedencia = "";

      switch (codOri) {
          case 1:
              procedencia = "Sul";
              break;
          case 2:
              procedencia = "Norte";
              break;
          case 3:
              procedencia = "Leste";
              break;
          case 4:
              procedencia = "Oeste";
              break;
          case 5:
          case 6:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
              procedencia = "Nordeste";
              break;
          case 7:
          case 8:
          case 9:
              procedencia = "Sudeste";
              break;
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
          case 18:
          case 19:
          case 20:
            procedencia = "Centro-oeste";
       default:
         System.out.println("Não foi inserido um código válido");

      }

      System.out.println("O produto de preço R$" + preco + " é originário da região " + procedencia + ".");
  }
}