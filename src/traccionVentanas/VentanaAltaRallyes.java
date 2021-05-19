package traccionVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAltaRallyes extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaRallyes frame = new VentanaAltaRallyes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaAltaRallyes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 338);
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(0, 0, 500, 301);
		getContentPane().add(contentPane);
		
		JLabel lblAltaNeumaticoRallyes = new JLabel("ALTA NEUMATICO RALLYES");
		lblAltaNeumaticoRallyes.setBounds(94, 10, 266, 13);
		contentPane.add(lblAltaNeumaticoRallyes);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca");
		lblNewLabel_1_1.setBounds(24, 33, 92, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Caducidad");
		lblNewLabel_1_1_1.setBounds(24, 63, 92, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dureza");
		lblNewLabel_1_2.setBounds(24, 95, 92, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Color");
		lblNewLabel_1_3.setBounds(24, 125, 92, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tipo");
		lblNewLabel_1_4.setBounds(24, 149, 92, 20);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Profundidad Dibujo");
		lblNewLabel_1_5.setBounds(24, 179, 136, 20);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Presion Neumatico");
		lblNewLabel_1_6.setBounds(24, 209, 136, 20);
		contentPane.add(lblNewLabel_1_6);
		
		JTextPane textPaneMarca = new JTextPane();
		textPaneMarca.setBounds(126, 34, 74, 19);
		contentPane.add(textPaneMarca);
		
		JTextPane textPaneCaducidad = new JTextPane();
		textPaneCaducidad.setBounds(126, 63, 74, 20);
		contentPane.add(textPaneCaducidad);
		
		JTextPane textPaneDureza = new JTextPane();
		textPaneDureza.setBounds(126, 96, 74, 19);
		contentPane.add(textPaneDureza);
		
		JTextPane textPaneColor = new JTextPane();
		textPaneColor.setBounds(126, 122, 74, 19);
		contentPane.add(textPaneColor);
		
		JTextPane textPaneProfun = new JTextPane();
		textPaneProfun.setBounds(186, 180, 74, 19);
		contentPane.add(textPaneProfun);
		
		JTextPane textPanePresion = new JTextPane();
		textPanePresion.setBounds(186, 209, 74, 19);
		contentPane.add(textPanePresion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(TiposNeumaticos.values()));
		comboBox.setBounds(126, 149, 74, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("GRABAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean validar= false;
				Rallyes rallye = new Rallyes();
				validar = rallye.VerificarTexPane(textPaneMarca, textPaneCaducidad, textPaneDureza, textPaneColor,comboBox ,textPaneProfun, textPanePresion);
				if (validar) {
					
					JOptionPane.showMessageDialog(null," Verificacion Correcta");
					
				}
				
				
				
			}
		});
		btnNewButton.setBounds(337, 230, 100, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Introduzca un valor entre 1 y 100");
		lblNewLabel_2.setBounds(213, 99, 211, 13);
		contentPane.add(lblNewLabel_2);
		
	}
}
