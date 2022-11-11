package lista01_exe03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Exiba as raizes da equação do segundo grau definida pelo usuario
				//variaveis
				
		double a=0,b,c,delta;
		double x1,x2;
				
		//cria um sccanner
		Scanner scan = new Scanner(System.in);
		//le os fatores
		while(a==0) {
			System.out.println("Digite um numero diferente de zero para o coeficiente a");
			a = scan.nextDouble();
		}
		System.out.println("Digite os coeficiente b e c: ");
		b = scan.nextDouble();
		c = scan.nextDouble();
				
		System.out.println(a+b+c);
		delta = Math.pow(b, 2)-(4*a*c);
		x1 = (-b + Math.sqrt(delta))/2*a;
		x2 = (-b - Math.sqrt(delta))/2*a;
		System.out.println(x1);
		System.out.println(x2);
	}
}