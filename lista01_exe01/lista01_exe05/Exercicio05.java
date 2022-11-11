package lista01_exe05;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// Calcula o Índice de Massa Corporal    IMC = peso/(altura^2) 
		//para uma pessoa adulta e a partir desta informação, indique qual a sua situação, onde: 
		//IMC < 18,5 → abaixo do peso; 18,5 <= IMC <= 25,0 → peso normal; 
		//25,0 < IMC <= 30,0 → acima do peso (sobrepeso); IMC > 30,0 → obeso
		
		//definir variaveis:
		double imc, peso, altura;
		//ler do usuario
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
		//calcular imc
		imc = peso / (Math.pow(altura, 2));
		//mostrar situação
		if(imc<18.5)
			JOptionPane.showMessageDialog(null, "IMC = "+imc+"\nAbaixo do peso", "SITUAÇÃO", 1);
				else if(imc>=18.5 && imc<=25.0)
					JOptionPane.showMessageDialog(null, "IMC = "+imc+"\nPeso normal", "SITUAÇÃO", 1);
						else if(imc> 25.0 && imc<30.0)
							JOptionPane.showMessageDialog(null, "IMC = "+imc+"\nAcima do peso(sobrepeso)", "SITUAÇÃO", 1);
		else
			JOptionPane.showMessageDialog(null, "IMC = "+imc+"\nObeso", "SITUAÇÃO", 1);
	}

}
