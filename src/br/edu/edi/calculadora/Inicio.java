package br.edu.edi.calculadora;

import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {
		Object[] opcoes = { "Calculadora Simples", "Calculadora Científica" };
		int op = JOptionPane.showOptionDialog(null,
				"Selecione o tipo de calculadora: ", "Calculadora Master",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				opcoes, opcoes[0]);
		if (op == 0) {
			CalcSimples tela = new CalcSimples();
			tela.setVisible(true);
		} else if (op == 1) {
			CalcCientifica tela = new CalcCientifica();
			tela.setVisible(true);
		}
	}

}
