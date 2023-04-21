package br.edu.principal;

import java.util.Scanner;

public class Principal {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double voltas = 0;

        System.out.println("Por favor, digite o ângulo: ");

        double angulo = sc.nextInt();

    voltas = angulo/360;

       angulo = angulo%360;


        if ((angulo==0 || (angulo ==90) || (angulo==180 || (angulo==270) || (angulo==360) || (angulo==-90)|| (angulo==-180) || (angulo==-270)|| (angulo==-360)))) {

        	System.out.println("Está em cima de algum dos eixos");

        }

        if ((angulo>0 & angulo < 90) || (angulo<-180 & angulo>-360)) {

        	System.out.println("Está no 1° quadrante");

        }

        if ((angulo>90 & angulo < 180) || (angulo<-180 & angulo>-270)) {

        	System.out.println("Está no 2° quadrante");

        }

        if ((angulo>180 & angulo < 270) || (angulo<-90 & angulo>-180)) {

        	System.out.println("Está no 3° quadrante");

     }      	

        if ((angulo>270 & angulo < 360) || (angulo<0 & angulo>-90)) {

        	System.out.println("Está no 4° quadrante");

        }

        if (voltas<0) {

        	voltas = voltas * (-1);

        }

        int voltasComp = (int)voltas;

        if (angulo>0) {

        	String sentido = "horário";

        	System.out.println("O total de volta(s) foi: "+ voltas+ ",com "+voltasComp+" volta(s) completa(s) no sentido "+sentido);

        }

        else {

        	String sentido = "anti-horário";

        	System.out.println("O total de volta(s) foi: "+ voltas+ ",com "+voltasComp+" volta(s) completa(s) no sentido "+sentido);

        }

 }

}