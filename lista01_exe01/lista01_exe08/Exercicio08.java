package lista01_exe08;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		// Leia números inteiros de modo que irá finalizar quando o usuário digitar zero. 
		//Os números lidos deverão ser somados de modo que no final da leitura, 
		//o programa deve informar quantas somas positivas e somas negativas ocorreram. 
		//(Se a soma der zero deve-se considera-la positiva)
		
		int num, soma, somapos=0, somaneg=0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		while(num != 0) {
			soma=+num;
			if(soma>0) 
				somapos++;
			else somaneg++;
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		}
		//mostrar resultados
		JOptionPane.showMessageDialog(null, "O total de somas negativas foi de "+somaneg, "RESULT", 1);
		JOptionPane.showMessageDialog(null, "O total de somas positivas foi de "+somapos, "RESULT", 1);
		

	}

}
