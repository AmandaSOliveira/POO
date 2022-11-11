package lista01_exe12;

import javax.swing.JOptionPane;

public class Exercicio12 {
	public static void main(String[] args) {
		//Leia dois números inteiros e imprime o valor resultante do primeiro número lido 
		//elevado à potência do segundo número lido, mas sem utilizar a função potenciação;
		int num1, num2,pot=0;
		
		//leitura
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
		//calculo
		for(int i=1; i <num2; i++) 
			pot = pot + (num1*num1);
		
		JOptionPane.showMessageDialog(null, "O resultado do calculo foi = "+pot, "RESULT", 1);
}
}
