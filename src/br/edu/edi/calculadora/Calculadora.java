package br.edu.edi.calculadora;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAreaCalculo;
	StringBuffer str = new StringBuffer();

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 547);
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
				str.append("0");
				atualizaTela();
			}
		});
		btnZero.setBounds(111, 455, 52, 51);
		contentPane.add(btnZero);
		// Botão 1
		JButton btnUm = new JButton("1");
		btnUm.setFont(new Font("Arial", Font.BOLD, 24));
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("1");
				atualizaTela();
			}
		});
		btnUm.setBounds(111, 393, 52, 51);
		contentPane.add(btnUm);
		// Botão 2
		JButton btnDois = new JButton("2");
		btnDois.setFont(new Font("Arial", Font.BOLD, 24));
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("2");
				atualizaTela();
			}
		});
		btnDois.setBounds(173, 393, 52, 51);
		contentPane.add(btnDois);
		// Botão 3
		JButton btnTres = new JButton("3");
		btnTres.setFont(new Font("Arial", Font.BOLD, 24));
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("3");
				atualizaTela();
			}
		});
		btnTres.setBounds(233, 393, 52, 51);
		contentPane.add(btnTres);
		// Botão 4
		JButton btnQuatro = new JButton("4");
		btnQuatro.setFont(new Font("Arial", Font.BOLD, 24));
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("4");
				atualizaTela();
			}
		});
		btnQuatro.setBounds(111, 331, 52, 51);
		contentPane.add(btnQuatro);
		// Botão 5
		JButton btnCinco = new JButton("5");
		btnCinco.setFont(new Font("Arial", Font.BOLD, 24));
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("5");
				atualizaTela();
			}
		});
		btnCinco.setBounds(173, 331, 52, 51);
		contentPane.add(btnCinco);
		// Botão 6
		JButton btnSeis = new JButton("6");
		btnSeis.setFont(new Font("Arial", Font.BOLD, 24));
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("6");
				atualizaTela();
			}
		});
		btnSeis.setBounds(233, 331, 52, 51);
		contentPane.add(btnSeis);
		// Botão sete
		JButton btnSete = new JButton("7");
		btnSete.setFont(new Font("Arial", Font.BOLD, 24));
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("7");
				atualizaTela();
			}
		});
		btnSete.setBounds(111, 272, 52, 51);
		contentPane.add(btnSete);
		// Botão 8
		JButton btnOito = new JButton("8");
		btnOito.setFont(new Font("Arial", Font.BOLD, 24));
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("8");
				atualizaTela();
			}
		});
		btnOito.setBounds(173, 272, 52, 51);
		contentPane.add(btnOito);
		// Botão 9
		final JButton btnNove = new JButton("9");
		btnNove.setFont(new Font("Arial", Font.BOLD, 24));
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("9");
				atualizaTela();
			}
		});
		btnNove.setBounds(233, 272, 52, 51);
		contentPane.add(btnNove);
		// Botão Ponto
		JButton btnPonto = new JButton(".");
		btnPonto.setFont(new Font("Arial", Font.BOLD, 24));
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append(".");
				atualizaTela();
			}
		});
		btnPonto.setBounds(173, 455, 52, 51);
		contentPane.add(btnPonto);
		/*
		 * Operadores
		 */
		// Botão Multiplicação
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setFont(new Font("Arial", Font.BOLD, 24));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("*");

				atualizaTela();
			}
		});
		btnMultiplicacao.setBounds(295, 331, 52, 51);
		contentPane.add(btnMultiplicacao);
		// Botão Subtração
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setFont(new Font("Arial", Font.BOLD, 24));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("-");

				atualizaTela();
			}
		});
		btnSubtracao.setBounds(295, 393, 52, 51);
		contentPane.add(btnSubtracao);
		// Botão Soma
		JButton btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Arial", Font.BOLD, 24));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("+");

				atualizaTela();
			}
		});
		btnSoma.setBounds(233, 455, 52, 51);
		contentPane.add(btnSoma);
		// Botão Divisão
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.append("/");
			}
		});
		// Botão Igual
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Arial", Font.BOLD, 24));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String op = str.toString();
				clear();
				str.append(operacao(op));
				atualizaTela();
			}
		});
		btnIgual.setBounds(295, 455, 52, 51);
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
		mnOpcoes.add(mntmSair);

		txtAreaCalculo = new JTextField();
		txtAreaCalculo.setBackground(Color.WHITE);
		txtAreaCalculo.setEditable(false);
		txtAreaCalculo.setFont(new Font("Arial", Font.BOLD, 30));
		txtAreaCalculo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAreaCalculo.setBounds(10, 32, 337, 51);
		contentPane.add(txtAreaCalculo);
		txtAreaCalculo.setColumns(10);
		// Botão Limpar
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 24));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear();
			}
		});
		btnLimpar.setBounds(233, 94, 114, 42);
		contentPane.add(btnLimpar);
		// Botão apagar um
		JButton btnApagarUm = new JButton("");
		btnApagarUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str.deleteCharAt(str.length() - 1);
				atualizaTela();
			}
		});
		btnApagarUm.setIcon(new ImageIcon(Calculadora.class
				.getResource("/br/edu/edi/images/flecha_esquerda.png")));
		btnApagarUm.setBounds(295, 219, 52, 42);
		contentPane.add(btnApagarUm);

		btnDivisao.setFont(new Font("Arial", Font.BOLD, 24));
		btnDivisao.setBounds(295, 272, 52, 51);
		contentPane.add(btnDivisao);

	}

	/*
	 * Método para utilizar botões do teclado
	 */
	public void entradaTeclado() {
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
	public void atualizaTela() {
		new Thread() {

			@Override
			public void run() {
				txtAreaCalculo.setText(str.toString());
			}
		}.start();

	}

	/*
	 * Realiza operações de cálculo
	 */
	public Object operacao(String calculo) {

		// create a script engine manager
		ScriptEngineManager factory = new ScriptEngineManager();
		// create a JavaScript engine
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		// evaluate JavaScript code from String
		Object obj = null;
		try {
			obj = engine.eval(calculo);
		} catch (ScriptException e) {
			return 0;
		}
		return obj;
	}

	/*
	 * Limpa a tela
	 */
	public void clear() {
		str.delete(0, str.length());
		atualizaTela();
	}
}
