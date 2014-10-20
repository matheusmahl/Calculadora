package br.edu.edi.calculadora;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalcSimples extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAreaCalculo;
	ArrayList<Object> lista = new ArrayList<>();
	Calculos operacoes = new Calculos();

	/**
	 * Create the frame.
	 */
	public CalcSimples() {

		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				System.out.println("teste");
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSete = new JButton("7");
		btnSete.setFont(new Font("Arial", Font.BOLD, 24));
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(7);
			}
		});
		btnSete.setBounds(31, 85, 52, 51);
		contentPane.add(btnSete);

		JButton btnOito = new JButton("8");
		btnOito.setFont(new Font("Arial", Font.BOLD, 24));
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(8);
			}
		});
		btnOito.setBounds(93, 85, 52, 51);
		contentPane.add(btnOito);

		final JButton btnNove = new JButton("9");
		btnNove.setFont(new Font("Arial", Font.BOLD, 24));
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(9);
			}
		});
		btnNove.setBounds(153, 85, 52, 51);
		contentPane.add(btnNove);

		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setFont(new Font("Arial", Font.BOLD, 24));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray("*");
			}
		});
		btnMultiplicacao.setBounds(215, 144, 52, 51);
		contentPane.add(btnMultiplicacao);

		JButton btnQuatro = new JButton("4");
		btnQuatro.setFont(new Font("Arial", Font.BOLD, 24));
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(4);
			}
		});
		btnQuatro.setBounds(31, 144, 52, 51);
		contentPane.add(btnQuatro);

		JButton btnCinco = new JButton("5");
		btnCinco.setFont(new Font("Arial", Font.BOLD, 24));
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(5);
			}
		});
		btnCinco.setBounds(93, 144, 52, 51);
		contentPane.add(btnCinco);

		JButton btnSeis = new JButton("6");
		btnSeis.setFont(new Font("Arial", Font.BOLD, 24));
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(6);
			}
		});
		btnSeis.setBounds(153, 144, 52, 51);
		contentPane.add(btnSeis);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setFont(new Font("Arial", Font.BOLD, 24));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray("-");
			}
		});
		btnSubtracao.setBounds(215, 206, 52, 51);
		contentPane.add(btnSubtracao);

		JButton btnUm = new JButton("1");
		btnUm.setFont(new Font("Arial", Font.BOLD, 24));
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(1);
			}
		});
		btnUm.setBounds(31, 206, 52, 51);
		contentPane.add(btnUm);

		JButton btnDois = new JButton("2");
		btnDois.setFont(new Font("Arial", Font.BOLD, 24));
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(2);
			}
		});
		btnDois.setBounds(93, 206, 52, 51);
		contentPane.add(btnDois);

		JButton btnTres = new JButton("3");
		btnTres.setFont(new Font("Arial", Font.BOLD, 24));
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(3);
			}
		});
		btnTres.setBounds(153, 206, 52, 51);
		contentPane.add(btnTres);

		JButton btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Arial", Font.BOLD, 24));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray("+");
			}
		});
		btnSoma.setBounds(153, 268, 52, 51);
		contentPane.add(btnSoma);

		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Arial", Font.BOLD, 24));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(0);
			}
		});
		btnZero.setBounds(31, 268, 52, 51);
		contentPane.add(btnZero);

		JButton btnPonto = new JButton(".");
		btnPonto.setFont(new Font("Arial", Font.BOLD, 24));
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray(".");
			}
		});
		btnPonto.setBounds(93, 268, 52, 51);
		contentPane.add(btnPonto);

		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Arial", Font.BOLD, 24));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO realizar calculos
				if (lista.contains("+"))
					AdicionarArray("=");
				else if (lista.contains("-"))
					AdicionarArray("=");
				else if (lista.contains("*"))
					AdicionarArray("=");
				else if (lista.contains("/"))
					AdicionarArray("=");

				operacoes.juntarNumeros(lista);

			}
		});
		btnIgual.setBounds(215, 268, 52, 51);
		contentPane.add(btnIgual);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 644, 21);
		contentPane.add(menuBar);

		JMenu mnOpcoes = new JMenu("Op\u00E7\u00F5es");
		mnOpcoes.setMnemonic('o');
		menuBar.add(mnOpcoes);

		JMenuItem mntmCalculadoraComplexa = new JMenuItem(
				"Calculadora Complexa");
		mntmCalculadoraComplexa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CalcCientifica tela = new CalcCientifica();
					tela.setVisible(true);
					dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		mnOpcoes.add(mntmCalculadoraComplexa);

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
		txtAreaCalculo.setBounds(300, 268, 293, 51);
		contentPane.add(txtAreaCalculo);
		txtAreaCalculo.setColumns(10);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 24));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lista.clear();
				AtualizaTela();
			}
		});
		btnLimpar.setBounds(153, 32, 114, 42);
		contentPane.add(btnLimpar);

		JButton btnApagarUm = new JButton("");
		btnApagarUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lista.remove(lista.size() - 1);
				AtualizaTela();
			}
		});
		btnApagarUm.setIcon(new ImageIcon(CalcSimples.class
				.getResource("/br/edu/edi/images/flecha_esquerda.png")));
		btnApagarUm.setBounds(93, 32, 52, 42);
		contentPane.add(btnApagarUm);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(300, 85, 293, 172);
		contentPane.add(textArea);

		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarArray("/");
			}
		});
		btnDivisao.setFont(new Font("Arial", Font.BOLD, 24));
		btnDivisao.setBounds(215, 85, 52, 51);
		contentPane.add(btnDivisao);

		entradaTeclado();

	}

	/**
	 * 
	 */
	public void entradaTeclado() {
		KeyEventDispatcher keyEventDispatcher = new KeyEventDispatcher() {
			@Override
			public boolean dispatchKeyEvent(final KeyEvent e) {
				if (e.getID() == KeyEvent.KEY_PRESSED) {
					Component[] comps = CalcSimples.this.getContentPane()
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

	// Adiciona os numeros no array
	public void AdicionarArray(int n) {
		lista.add(n);
		AtualizaTela();
	}

	// adiciona os operandos no array
	public void AdicionarArray(String c) {
		lista.add(c);
		AtualizaTela();
	}

	// Mostra na tela
	public void AtualizaTela() {
		String texto = "";
		for (Object num : lista) {
			if (!num.equals("+/-"))
				texto = texto.concat("" + num);
		}
		txtAreaCalculo.setText(texto);
	}
}
