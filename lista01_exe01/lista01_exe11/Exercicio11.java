package lista01_exe11;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		// Leia do usuário números inteiros e calcule a quantidade e a soma de números pares, 
		//ímpares, positivos e negativos digitados. se o usuário digitar zero, 
		//o processo deve ser finalizado, e a exibição dos cálculos deve ser feita;
		int num, soma=0, somapar=0, somaimpar=0, somapos=0, somaneg=0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		while(num != 0) {
			soma=+num;
			if(num%2 == 0) 
				somapar++;
			else somaimpar++;
			if(num>0)
				somapos++;
			else somaneg++;
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		}
		//mostrar resultados
		JOptionPane.showMessageDialog(null, "O total de numeros pares foi de "+somapar, "RESULT", 1);
		JOptionPane.showMessageDialog(null, "O total de numeros impares foi de "+somaimpar, "RESULT", 1);
		JOptionPane.showMessageDialog(null, "O total de numeros positivos foi de "+somapos, "RESULT", 1);
		JOptionPane.showMessageDialog(null, "O total de numeros negativos foi de "+somaneg, "RESULT", 1);
		JOptionPane.showMessageDialog(null, "O resultado da soma final foi "+soma, "RESULT", 1);
	}

}
