package lista01_exe14;

import javax.swing.JOptionPane;

public class Exercicio14 {
	public static int leNum() {
		int n = 0;
		while(n<=0)
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero natural maior que zero: "));
		return n;
	}

	public static void main(String[] args) {
		// Leia do usuário dois números naturais maiores que zero, calcule e exiba o MMC deles
		int num1, num2, mmc=1, aux=2;
		//leitura
		num1 = leNum();
		num2 = leNum();
		
		//calculo
		while(num1>=1 && num2>=1) {	//enquanto os numeros não chegarem no valor minimo
			while(num1%aux !=0 && num2%aux !=0)
				aux++;	//enquanto aux não divide nenhum dos dois numeros
			if(num1%aux == 0)
				num1 = num1/aux;	// atualiza o valor de num1 se ele for divisivel por aux
			if(num2%aux == 0)
				num2 = num2/aux;	// atualiza o valor de num2 se ele for divisivel por aux
			mmc *= aux;
			aux = 2;
		}
		JOptionPane.showMessageDialog(null, "O resultado do MMC é: "+mmc, "RESULT", 1);
	}

}
