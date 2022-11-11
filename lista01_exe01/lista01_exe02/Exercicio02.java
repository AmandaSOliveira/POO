package lista01_exe02;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// Leia a altura (h, em metros) e o sexo da pessoa. E com estas informações calcule o 
				//peso ideal para esta pessoa, utilizando as seguintes fórmulas: 
				//Para homens, Peso = (72,7 * h) – 58; Para mulheres, Peso = (62,1 * h) – 44,7
						
				//variaveis
				double h,peso;
				String sexo;
						
				//le o sexo e a altura
				sexo = JOptionPane.showInputDialog("Qual o seu sexo? (f) feminino (m) masculino ");
				h = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
						
				//aplicar a formula e exibir o peso ideal
				if(sexo == "f") {
					peso = (h*62.1)-44.7;
					JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+peso, "RESULTADO", 1);
				}
				else {
					peso = (h*72.7)-58;
					JOptionPane.showMessageDialog(null, "O seu peso ideal é: "+peso, "RESULTADO", 1);
					}

	}

}