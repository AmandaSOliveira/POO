package lista01_exe04;

import javax.swing.JOptionPane;

public class Exercicio04 {
	public static float leValor() {
		return Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da matéria prima"));
	}

	public static void main(String[] args) {
		//Calcula o custo final de um produto que é composto de 3 matérias primas. 
		//Inicialmente são lidos os valores dos três materiais. 
		//A fórmula é: Custo = M01 + 3 * M02 + 2 * M03, onde M0x é uma matéria prima. 
		//Imprimir o valor do custo final

		float total, M01, M02, M03;
		
		//Leitura dos valores
		M01 = leValor();
		M02 = leValor();
		M03 = leValor();
		
		//calcula o valor total
		total = M01 + (3*M02) + (2*M03);
		
		JOptionPane.showMessageDialog(null, "O valor do custo final da matéria prima é de R$ "+total, "RESULT", 1);
	}
}
