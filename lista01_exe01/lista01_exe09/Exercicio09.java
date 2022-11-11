package lista01_exe09;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		//Exiba os fatores de um número natural lido do usuário. 
		//Pergunte ao usuário se ele deseja digitar novamente. Caso ele digite o ‘s’ ou ‘S’ repita o processo todo;
		int num = -1;
		char op;
		
		//leitura
		do {
			String texto = "Os fatores do numero escolhido são : ";			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero natural: ")); // pede o numero para o usuário
			for(int i=1; i<=(num/2); i++) {	//verifica os fatores a serem exibidos
				if(num%i == 0)
					texto = texto + i + " "; //junta os fatores no texto
			}
			//exibe os fatores do numero
			JOptionPane.showMessageDialog(null, texto, "RESULT", 1);
			//pergunta se deseja digitar novamente
			op = JOptionPane.showInputDialog("Deseja digitar outro número? ").charAt(0);
			
		}while(op == 's' || op == 'S');
		
		

	}

}
