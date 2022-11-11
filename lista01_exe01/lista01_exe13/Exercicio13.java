package lista01_exe13;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		//Leia do usuário um número natural e verifica se o número é primo ou não;
		int num=-1, cont=0, teste = 1;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero natural: "));
		}while(num<0);
		
			//Passo 4 - verificar quantos numeros ele se divide
				for(int j=1;j<=num;j++) 
					if(num%j == 0) 
						cont++;
				
		//passo 5 - verifica se o num eh primo e exibe o resultado
		if(cont>2)
			JOptionPane.showMessageDialog(null, "O numero nao é primo!", "RESULTADO", 1);
		else
			JOptionPane.showMessageDialog(null, "O numero é primo!", "RESULTADO", 1);
		
	}

}
