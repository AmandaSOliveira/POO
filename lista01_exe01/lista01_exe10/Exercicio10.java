package lista01_exe10;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		// que fornecido o sexo (M / F), a altura (em metros) e peso (em Kg)
		//feminino, PesoIdeal = (62,1 * altura) – 48,7; masculino, PesoIdeal = (72,7 * altura) – 62,0;
		//Se a diferença do peso for maior que 6 kg do peso ideal, escrever
		//Se a diferença do peso for menor que 6 kg do peso ideal,escrever
		//Se o peso for igual ao peso ideal, escrever
		double peso,altura,pesoIdeal=0;
				
		//ler o sexo, altura e peso do usuario
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
		char sexo = JOptionPane.showInputDialog("Digite o seu sexo(M/F): ").charAt(0);
				
		//calcular o peso ideal
		if(sexo == 'M' || sexo == 'm')
			pesoIdeal = (72.7*altura)-62.0;
			else if(sexo == 'F' || sexo == 'f')
				pesoIdeal = (62.1*altura)-48.7;
		else {
			JOptionPane.showMessageDialog(null, "Sexo inválido.", "RESULT", 1);
			System.exit(0);
				}
		//comparar o peso ideal com o peso do usuário
		if(peso == pesoIdeal)
			JOptionPane.showMessageDialog(null, "O seu peso está Ideal", "RESULT", 1);
			else if((peso-pesoIdeal)>6)
				JOptionPane.showMessageDialog(null, "Alerta de diferença de peso maior que 6 Kg", "RESULT", 1);
				else if((peso-pesoIdeal)<6)
					JOptionPane.showMessageDialog(null, "Esta dentro da margem de peso", "RESULT", 1);
				
	}

}
