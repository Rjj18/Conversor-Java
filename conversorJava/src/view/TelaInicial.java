package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial {

	private JFrame frmMenu;
	private final JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setType(Type.UTILITY);
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 486, 359);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Moedas", "Conversor de Distância"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(57, 106, 347, 32);
		
		frmMenu.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Selecione o conversor desejado");
		lblNewLabel.setBounds(57, 81, 202, 14);
		frmMenu.getContentPane().add(lblNewLabel);
	}
}
