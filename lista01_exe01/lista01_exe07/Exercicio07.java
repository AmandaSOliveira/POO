package lista01_exe07;

import javax.swing.JOptionPane;

public class Exercicio07 {
	public static float leLado() {
		return Float.parseFloat(JOptionPane.showInputDialog("Digite um lado para o triangulo: "));
	}
	
	public static float calculaSoma(float x, float y) {
		return x+y;
	}
	
	public static float calculaMod(float x, float y) {
		float dif = x-y;
		if(dif<0)
			dif = dif*(-1);
		return dif;
	}
	
	public static void main(String[] args) {
		// Leia do usuário os possíveis lados de um triângulo. Caso formem triângulo, 
		//exiba o tipo de triângulo formado. Caso contrário exiba mensagem informando a situação
		
		float lado1, lado2, lado3, soma1, soma2, soma3, mod1, mod2, mod3;
		//leitura dos lados:
		lado1 = leLado();
		lado2 = leLado();
		lado3 = leLado();
		
		//"A soma de dois lados quaisquer é sempre menor que o terceiro lado."
		soma1 = calculaSoma(lado3, lado2); //leva a soma de 3 e 2 para comparar com 1 e assim por diante
		soma2 = calculaSoma(lado3, lado1);
		soma3 = calculaSoma(lado1, lado2);
		
		//um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados
		mod1 = calculaMod(lado3,lado2);
		mod2 = calculaMod(lado3,lado1);
		mod3 = calculaMod(lado1,lado2);
		
		//apos fazer a soma dos lados - comparar com cada lado para averiguar se trata-se de um triangulo
		if(mod1<lado1 && lado1<soma1 && mod2<lado2 && lado2<soma2 && mod3<lado3 && lado3<soma3)
			JOptionPane.showMessageDialog(null, "Os lados formam um triangulo", "RESULT", 1);				
		else 
			JOptionPane.showMessageDialog(null, "Os lados não formam um triângulo!", "RESULT", 1);
	}
}
