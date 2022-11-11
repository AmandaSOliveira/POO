package lista01_exe01;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// Leia tres numeros inteiros e exiba o maior deles e a soma dos dois menores;
		
		int num, maior=-100, soma=0;
		
		//leitura dos numeros:
		for(int i=0; i<3; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
			if(num>maior)	//verifica se eh o maior numero
				maior = num;
			soma = soma+num;	//soma os 3 numeros
		}
		
		//exibe o maior dos numeros:
		JOptionPane.showMessageDialog(null, "O maior numero é: "+maior, "RESULTADO", 1);
		//exibe a soma dos dois menores:
		JOptionPane.showMessageDialog(null, "A soma dos menores numeros é: "+(soma-maior), "RESULTADO", 1);
		
	}

}
