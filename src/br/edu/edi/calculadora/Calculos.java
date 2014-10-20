/**
 * 
 */
package br.edu.edi.calculadora;

import java.util.ArrayList;

/**
 * @author Matheus Mahl
 * 
 */
public class Calculos {
	private boolean soma = false;
	private boolean subt = false;
	private boolean mult = false;
	private boolean div = false;
	ArrayList<Integer> num = new ArrayList<>();

	public void juntarNumeros(ArrayList<Object> lista) {
		// TODO Auto-generated method stub
		int numf = 0;
		for (int i = 0; i < lista.size(); i++) {
			Object a = lista.get(i);
			if (a.equals("="))
				calc();
			else if (a.equals("+")) {
				soma = true;
				num.add(numf);
			} else if (a.equals("-")) {
				subt = true;
				num.add(numf);

			} else if (a.equals("*")) {
				mult = true;
				num.add(numf);

			} else if (a.equals("/")) {
				div = true;
				num.add(numf);

			} else {
				int num = (int) a;
				numf = (numf * 10) + num;
				lista.remove(i);
			}

		}
		for (int object : num) {
			System.out.println(object);
		}

	}

	private void calc() {
		// TODO Auto-generated method stub

	}
}
