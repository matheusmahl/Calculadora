/**
 * 
 */
package br.edu.edi.calculadora;

import java.util.Stack;

/**
 * @author Matheus Mahl
 * @param <E>
 * 
 */
public class TTransformar {
/**
 * 
 * @param ACaracter
 * @return
 */
	private int getPrioridade(char ACaracter) {
		if (ACaracter == '(')
			return 1;
		else if ((ACaracter == '+') || (ACaracter == '-'))
			return 2;
		else if ((ACaracter == '*') || (ACaracter == '/'))
			return 3;
		else
			return 0;
	}
/**
 * 
 * @param AExpInfixa
 * @return
 */
	public String ConverterPosFixa(String AExpInfixa) {
		String sExpPosFixa = "";
		Stack<Character> oPilha = new Stack<Character>();
		char cCaracter;
		int iPrioridade = 0;
		// Varre todos os elementos da expressão de entrada e, para cada
		// elemento, verifica se é operador ou operando. Se for operando, já adicona a saída.
		for (int i = 0; i < AExpInfixa.length(); i++) {
			cCaracter = AExpInfixa.charAt(i);
			if (IsOperando(cCaracter)) {
				sExpPosFixa += cCaracter;
			} else if (IsOperador(cCaracter)) {
				iPrioridade = getPrioridade(cCaracter);
				while ((!oPilha.isEmpty())
						&& (getPrioridade((Character)oPilha.peek()) >= iPrioridade)) {
					sExpPosFixa += (Character) oPilha.pop();
				}
				// Insere o objeto no topo da pilha
				oPilha.push(cCaracter);
			} else if ('(' == cCaracter) {
				// Insere o objeto no topo da pilha
				oPilha.push(cCaracter);
			} else if (')' == cCaracter) {
				char item = (Character) oPilha.pop();
				while (!(item == '(')) {
					sExpPosFixa += item;
					// Recupera e remove o objeto do topo da pilha
					item = (Character) oPilha.pop();
				}
			}
		}

		while (!oPilha.isEmpty()) {
			sExpPosFixa += oPilha.pop().toString();
		}

		return sExpPosFixa;
	}
/**
 * 
 * @param ACaracter
 * @return
 */
	public boolean IsOperador(char ACaracter) {
		char[] Operadores = { '/', '*', '+', '-' };
		for (char cCaracter : Operadores) {
			if (cCaracter == ACaracter)
				return true;
		}
		return false;
	}
/**
 * 
 * @param ACaracter
 * @return
 */
	public boolean IsOperando(char ACaracter) {
		return Character.isDigit(ACaracter);
	}

}
