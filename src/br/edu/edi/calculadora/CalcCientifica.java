package br.edu.edi.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CalcCientifica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public CalcCientifica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 634, 21);
		contentPane.add(menuBar);

		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		mnOpes.setMnemonic('o');
		menuBar.add(mnOpes);

		JMenuItem mntmCalculadoraSimples = new JMenuItem("Calculadora Simples");
		mntmCalculadoraSimples.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					CalcSimples frame = new CalcSimples();
					frame.setVisible(true);
					dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		mnOpes.add(mntmCalculadoraSimples);

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
		mnOpes.add(mntmSair);
	}

}
