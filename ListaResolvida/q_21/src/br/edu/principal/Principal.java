package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o código do estado de origem da carga do caminhão: ");
        double codigoEstado = sc.nextInt();
        System.out.println("Por favor, digite o peso da carga do caminhão em toneladas: ");
        double pesoCarga = sc.nextInt();
        System.out.println("Por favor, digite o código da carga do caminhão: ");
        int codigoCarga = sc.nextInt();
        double pesoQuilos = pesoCarga * 1000;
        System.out.println("O peso em quilos da carga do caminhão é igual a "+pesoQuilos+"kg.");
        double precoCarga = 0;
        double imposto = 0;

        if ((codigoCarga >= 10) & (codigoCarga <= 20)) {
           precoCarga = 100 * pesoQuilos;
        }
        if ((21 < codigoCarga) & (codigoCarga <= 30)) {
        	precoCarga = 250 * pesoQuilos;
        }
        if ((31 < codigoCarga) & (codigoCarga <= 40)) {
        	precoCarga = 340 * pesoQuilos;
        }
        System.out.println("O preço da carga será igual a "+precoCarga+" reais.");
        if (codigoEstado == 1) {
            imposto = 0.35 * precoCarga;
         }
        if (codigoEstado == 2) {
            imposto = 0.25 * precoCarga;
         }
        if (codigoEstado == 3) {
            imposto = 0.15 * precoCarga;
         }
        if (codigoEstado == 4) {
            imposto = 0.05 * precoCarga;
         }
        if (codigoEstado == 5) {
            imposto = 0 * precoCarga;
         }
        System.out.println("O valor do imposto é igual a "+imposto+" reais.");
        double valorTotal = imposto + precoCarga;
        System.out.println("O preço total será igual a "+valorTotal+" reais.");
       
        
        }
    }
