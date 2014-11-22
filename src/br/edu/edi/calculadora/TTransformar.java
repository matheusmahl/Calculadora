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

	private int Prioridade(char cCaracter) {
		if (cCaracter == '(')
			return 1;
		else if ((cCaracter == '+') || (cCaracter == '-'))
			return 2;
		else if ((cCaracter == '*') || (cCaracter == '/'))
			return 3;
		else
			return 0;
	}

	public String ConverterPosFixa(String expInfixa) {
		String resultado = "";
		Stack<Character> pilha = new Stack<Character>();
		char caracter;
		int iPrioridade = 0;
		// Varre todos os elementos da expressão de entrada e, para cada
		// elemento, verifica
		// se é operador ou operando. Se for operando, já adicona a saída.
		for (int i = 0; i < expInfixa.length(); i++) {
			caracter = expInfixa.charAt(i);
			if (IsOperando(caracter)) {
				resultado += caracter;
			} else if (IsOperador(caracter)) {
				iPrioridade = Prioridade(caracter);
				while ((!pilha.isEmpty())
						&& (Prioridade((Character) pilha.peek()) >= iPrioridade)) {
					resultado += (Character) pilha.pop();
				}
				// Insere o objeto no topo da pilha
				pilha.push(caracter);
			} else if ('(' == caracter) {
				// Insere o objeto no topo da pilha
				pilha.push(caracter);
			} else if (')' == caracter) {
				char item = (Character) pilha.pop();
				while (!(item == '(')) {
					resultado += item;
					// Recupera e remove o objeto do topo da pilha
					item = (Character) pilha.pop();
				}
			}
		}

		while (!pilha.isEmpty()) {
			resultado += pilha.pop().toString();
		}

		return resultado;
	}

	public boolean IsOperador(char caracter) {
		char[] Operadores = { '/', '*', '+', '-' };
		for (char c : Operadores) {
			if (c == caracter)
				return true;
		}
		return false;
	}

	public boolean IsOperando(char caracter) {
		return Character.isDigit(caracter);
	}

}
