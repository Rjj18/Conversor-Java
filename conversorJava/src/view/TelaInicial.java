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
import javax.swing.JMenuBar;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;

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
		
		comboBox.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
				
				String a = comboBox.getSelectedItem().toString();
				
				if (a == "Conversor de Moedas") {
					MenuConversorMoeda menu = new MenuConversorMoeda();
					menu.ConversorMoedas.setVisible(true);
					frmMenu.dispose();
				}
				
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Conversor de Moedas", "Conversor de Distância"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(57, 106, 347, 32);
		
		frmMenu.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Selecione o conversor desejado");
		lblNewLabel.setBounds(57, 81, 202, 14);
		frmMenu.getContentPane().add(lblNewLabel);
	}
}
