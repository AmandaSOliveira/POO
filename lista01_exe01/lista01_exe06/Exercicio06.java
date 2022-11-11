package lista01_exe06;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// Exiba a média aritmética entre dois números inteiros lidos do usuário; 
		
		int num1, num2;
		float media=0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
		//calcula media:
		media = (num1+num2)/2;
		JOptionPane.showMessageDialog(null, "O resultado da média é "+media, "RESULT", 1);
	}

}
