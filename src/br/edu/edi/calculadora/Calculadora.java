package br.edu.edi.calculadora;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Matheus Mahl
 * 
 */
public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAreaCalculo;
	private StringBuffer sbCaracteres = new StringBuffer();
	private JButton btnIgual;
	private JLabel lblInfixa02;
	private JLabel lblPosFixa;
	TTransformar Conversor = new TTransformar();

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setResizable(false);
		setTitle("Master Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Ativa a utilização de teclas fisicas
		entradaTeclado();

		/*
		 * Numerais
		 */

		// Botão 0
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Arial", Font.BOLD, 24));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('0');
				atualizaTela(false);
			}
		});
		btnZero.setBounds(134, 532, 52, 51);
		contentPane.add(btnZero);

		// Botão 1
		JButton btnUm = new JButton("1");
		btnUm.setFont(new Font("Arial", Font.BOLD, 24));
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('1');
				atualizaTela(false);
			}
		});
		btnUm.setBounds(10, 470, 52, 51);
		contentPane.add(btnUm);

		// Botão 2
		JButton btnDois = new JButton("2");
		btnDois.setFont(new Font("Arial", Font.BOLD, 24));
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('2');
				atualizaTela(false);
			}
		});
		btnDois.setBounds(72, 470, 52, 51);
		contentPane.add(btnDois);

		// Botão 3
		JButton btnTres = new JButton("3");
		btnTres.setFont(new Font("Arial", Font.BOLD, 24));
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('3');
				atualizaTela(false);
			}
		});
		btnTres.setBounds(134, 470, 52, 51);
		contentPane.add(btnTres);

		// Botão 4
		JButton btnQuatro = new JButton("4");
		btnQuatro.setFont(new Font("Arial", Font.BOLD, 24));
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('4');
				atualizaTela(false);
			}
		});
		btnQuatro.setBounds(10, 408, 52, 51);
		contentPane.add(btnQuatro);

		// Botão 5
		JButton btnCinco = new JButton("5");
		btnCinco.setFont(new Font("Arial", Font.BOLD, 24));
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('5');
				atualizaTela(false);
			}
		});
		btnCinco.setBounds(72, 408, 52, 51);
		contentPane.add(btnCinco);

		// Botão 6
		JButton btnSeis = new JButton("6");
		btnSeis.setFont(new Font("Arial", Font.BOLD, 24));
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('6');
				atualizaTela(false);
			}
		});
		btnSeis.setBounds(134, 408, 52, 51);
		contentPane.add(btnSeis);

		// Botão sete
		JButton btnSete = new JButton("7");
		btnSete.setFont(new Font("Arial", Font.BOLD, 24));
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('7');
				atualizaTela(false);
			}
		});
		btnSete.setBounds(10, 349, 52, 51);
		contentPane.add(btnSete);

		// Botão 8
		JButton btnOito = new JButton("8");
		btnOito.setFont(new Font("Arial", Font.BOLD, 24));
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('8');
				atualizaTela(false);
			}
		});
		btnOito.setBounds(72, 349, 52, 51);
		contentPane.add(btnOito);

		// Botão 9
		final JButton btnNove = new JButton("9");
		btnNove.setFont(new Font("Arial", Font.BOLD, 24));
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('9');
				atualizaTela(false);
			}
		});
		btnNove.setBounds(134, 349, 52, 51);
		contentPane.add(btnNove);

		// Botão Abre Barra
		JButton btnAbreBarra = new JButton("(");
		btnAbreBarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('(');
				atualizaTela(false);
			}
		});
		btnAbreBarra.setFont(new Font("Arial", Font.BOLD, 24));
		btnAbreBarra.setBounds(10, 532, 52, 51);
		contentPane.add(btnAbreBarra);

		// Botão Fecha Barra
		JButton btnFechaBarra = new JButton(")");
		btnFechaBarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista(')');
				atualizaTela(false);
			}
		});
		btnFechaBarra.setFont(new Font("Arial", Font.BOLD, 24));
		btnFechaBarra.setBounds(72, 532, 52, 51);
		contentPane.add(btnFechaBarra);

		/*
		 * Operadores
		 */

		// Botão Multiplicação
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setFont(new Font("Arial", Font.BOLD, 24));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('*');

				atualizaTela(false);
			}
		});
		btnMultiplicacao.setBounds(196, 349, 52, 51);
		contentPane.add(btnMultiplicacao);

		// Botão Subtração
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setFont(new Font("Arial", Font.BOLD, 24));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('-');

				atualizaTela(false);
			}
		});
		btnSubtracao.setBounds(196, 408, 52, 51);
		contentPane.add(btnSubtracao);

		// Botão Soma
		JButton btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Arial", Font.BOLD, 24));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('+');

				atualizaTela(false);
			}
		});
		btnSoma.setBounds(196, 470, 52, 51);
		contentPane.add(btnSoma);

		// Botão Divisão
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNaLista('/');
				atualizaTela(false);
			}
		});
		btnDivisao.setFont(new Font("Arial", Font.BOLD, 24));
		btnDivisao.setBounds(196, 287, 52, 51);
		contentPane.add(btnDivisao);

		// Botão Igual
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Arial", Font.BOLD, 24));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fecharParenteses();
				if (verificarExpressao()) {
					DecimalFormat df = new DecimalFormat("###0.000000000");
					double resultado = (double) calcularExpressao();
					String op = df.format(resultado);
					lblPosFixa.setText(Conversor.ConverterPosFixa(sbCaracteres
							.toString()));
					lblInfixa02.setText(sbCaracteres.toString());
					limparExpressao();
					sbCaracteres.append(op);
					atualizaTela(true);
				} else
					JOptionPane.showMessageDialog(null, "Expressão Inválida!");

			}
		});
		btnIgual.setBounds(196, 532, 52, 51);
		contentPane.add(btnIgual);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 644, 21);
		contentPane.add(menuBar);

		JMenu mnOpcoes = new JMenu("Op\u00E7\u00F5es");
		mnOpcoes.setMnemonic('o');
		menuBar.add(mnOpcoes);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int op = JOptionPane.showConfirmDialog(null,
						"Deseja Sair Realmente?", "Fechar",
						JOptionPane.YES_NO_OPTION);
				if (op == 0) {
					System.exit(0);

				}
			}
		});

		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane,
						  "Desenvolvido por: \n"
						+ "Matheus Mahl e Marcelo Sehnem \n"
						+ "Versão 1.0 - 2014",
						"Master Calculator",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnOpcoes.add(mntmSobre);
		mnOpcoes.add(mntmSair);

		txtAreaCalculo = new JTextField();
		txtAreaCalculo.setBackground(Color.WHITE);
		txtAreaCalculo.setEditable(false);
		txtAreaCalculo.setFont(new Font("Arial", Font.BOLD, 30));
		txtAreaCalculo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAreaCalculo.setBounds(10, 32, 238, 51);
		contentPane.add(txtAreaCalculo);
		txtAreaCalculo.setColumns(10);

		// Botão Limpar
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 24));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparExpressao();
				atualizaTela(true);
				lblPosFixa.setText("");
				lblInfixa02.setText("");
			}
		});
		btnLimpar.setBounds(10, 287, 114, 51);
		contentPane.add(btnLimpar);

		// Botão apagar um
		JButton btnApagarUm = new JButton("");
		btnApagarUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (sbCaracteres.length() > 0) {
					sbCaracteres.deleteCharAt(sbCaracteres.length() - 1);
					atualizaTela(false);
				}
			}
		});
		btnApagarUm.setIcon(new ImageIcon(Calculadora.class
				.getResource("/br/edu/edi/images/flecha_esquerda.png")));
		btnApagarUm.setBounds(134, 287, 52, 51);
		contentPane.add(btnApagarUm);

		JLabel lblInfixa = new JLabel("Infixa:");
		lblInfixa.setFont(new Font("Arial", Font.BOLD, 24));
		lblInfixa.setBounds(10, 94, 76, 21);
		contentPane.add(lblInfixa);

		lblInfixa02 = new JLabel("");
		lblInfixa02.setFont(new Font("Arial", Font.BOLD, 24));
		lblInfixa02.setBounds(10, 126, 238, 34);
		contentPane.add(lblInfixa02);

		lblPosFixa = new JLabel("");
		lblPosFixa.setFont(new Font("Arial", Font.BOLD, 24));
		lblPosFixa.setBounds(10, 206, 238, 34);
		contentPane.add(lblPosFixa);

		JLabel lblPsfixa = new JLabel("P\u00F3s-Fixa:");
		lblPsfixa.setFont(new Font("Arial", Font.BOLD, 24));
		lblPsfixa.setBounds(10, 174, 107, 21);
		contentPane.add(lblPsfixa);

	}

	/**
	 * 
	 * @return
	 */
	private boolean verificarExpressao() {
		int iFechado = 0;
		int iAberto = 0;
		int iOperador = 0;
		// Se possuir menos de um caractere
		if (sbCaracteres.length() < 1)
			return false;
		// Primeiro e último caracter não pode ser operador ou parenteses aberto
		if (Conversor.IsOperador(sbCaracteres.charAt(0))
				|| ((Conversor.IsOperador(sbCaracteres.charAt(sbCaracteres
						.length() - 1))) || (sbCaracteres.charAt(sbCaracteres
						.length() - 1) == '(')))
			return false;

		for (int iIndex = 0; iIndex < sbCaracteres.length() - 1; iIndex++) {
			// Contador de parenteses
			if (sbCaracteres.charAt(iIndex) == ')')
				iFechado++;
			else if (sbCaracteres.charAt(iIndex) == '(')
				iAberto++;

			// Se houver um parentesis fechado e não houver parenteses abertos
			// equivalentes
			if (sbCaracteres.charAt(iIndex) == ')' && (iAberto < iFechado))
				return false;
			// Dois operadores seguidos ou um operador e parenteses fechado
			if (Conversor.IsOperador(sbCaracteres.charAt(iIndex))) {
				iOperador++;
				if ((Conversor.IsOperador(sbCaracteres.charAt(iIndex + 1)))
						|| (sbCaracteres.charAt(iIndex + 1) == ')'))
					return false;

				// Se houver um parenteses aberto depois de um operando
			} else if (Conversor.IsOperando(sbCaracteres.charAt(iIndex))) {
				if (sbCaracteres.charAt(iIndex + 1) == '(')
					return false;
			}

		}
		if (iOperador == 0)
			return false;

		return true;
	}

	/*
	 * Método para utilizar botões do teclado
	 */
	/**
	 * 
	 */
	private void entradaTeclado() {
		KeyEventDispatcher keyEventDispatcher = new KeyEventDispatcher() {
			@Override
			public boolean dispatchKeyEvent(final KeyEvent e) {
				if (e.getID() == KeyEvent.KEY_PRESSED) {
					Component[] comps = Calculadora.this.getContentPane()
							.getComponents();
					for (int c = 0; c < comps.length; c++) {
						if ((comps[c] instanceof JButton)
								&& ((JButton) comps[c]).getText().equals(
										e.getKeyChar() + "")) {

							((JButton) comps[c]).doClick();

							break;
						}
					}
				}
				// Pass the KeyEvent to the next KeyEventDispatcher in the chain
				return false;
			}
		};
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(keyEventDispatcher);
	}

	/*
	 * Atualiza a tela com a string armazenada no stringbuffer
	 */
	/**
	 * 
	 * @param ACheck
	 */
	private void atualizaTela(boolean ACheck) {
		txtAreaCalculo.setText(sbCaracteres.toString());
		if (ACheck)
			limparExpressao();

	}

	/*
	 * Realiza operações de cálculo
	 */
	/**
	 * 
	 * @return
	 */
	private Object calcularExpressao() {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		Object obj = null;
		try {
			obj = engine.eval(sbCaracteres.toString());
		} catch (ScriptException e) {
			return 0;
		}
		return obj;
	}

	/**
     * 
     */
	private void fecharParenteses() {
		int contAbre = 0;
		int contFecha = 0;
		for (int i = 0; i < sbCaracteres.length(); i++) {
			if (sbCaracteres.charAt(i) == '(')
				contAbre++;
			if (sbCaracteres.charAt(i) == ')')
				contFecha++;
		}
		if (contFecha < contAbre) {
			for (int i = 0; i < (contAbre - contFecha); i++) {
				sbCaracteres.append(")");
			}
		}
		atualizaTela(false);
	}

	/*
	 * Limpa a tela
	 */
	/**
	 * 
	 */
	private void limparExpressao() {
		sbCaracteres.delete(0, sbCaracteres.length());
	}

	/*
	 * Adiciona caracter no Stringbuffer
	 */
	/**
	 * 
	 * @param ACaracter
	 */
	private void adicionarNaLista(char ACaracter) {
		if (sbCaracteres.length() < 13)
			sbCaracteres.append(ACaracter);
		else
			JOptionPane.showMessageDialog(null,
					"Numero máximo de caracteres atingido!");
	}
}
