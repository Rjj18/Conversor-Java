package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MenuConversorMoeda {

	 JFrame ConversorMoedas;
	 private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuConversorMoeda window = new MenuConversorMoeda();
					window.ConversorMoedas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuConversorMoeda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ConversorMoedas = new JFrame();
		ConversorMoedas.setTitle("Conversor Moedas");
		ConversorMoedas.setBounds(100, 100, 450, 300);
		ConversorMoedas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ConversorMoedas.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(99, 69, 147, 27);
		ConversorMoedas.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite o valor");
		lblNewLabel.setBounds(15, 72, 74, 21);
		ConversorMoedas.getContentPane().add(lblNewLabel);
	}
}
