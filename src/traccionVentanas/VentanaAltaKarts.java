package traccionVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAltaKarts extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaKarts frame = new VentanaAltaKarts();
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
	public VentanaAltaKarts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 344);
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(10, 0, 434, 262);
		getContentPane().add(contentPane);
		
		JLabel lblAltaNeumaticoKarts = new JLabel("ALTA NEUMATICO KARTS");
		lblAltaNeumaticoKarts.setBounds(94, 10, 266, 13);
		contentPane.add(lblAltaNeumaticoKarts);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Marca");
		lblNewLabel_1_1_2.setBounds(24, 33, 92, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Caducidad");
		lblNewLabel_1_1_1_1.setBounds(24, 63, 92, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Dureza");
		lblNewLabel_1_2_1.setBounds(24, 95, 92, 20);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Color");
		lblNewLabel_1_3_1.setBounds(24, 125, 92, 20);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Tipo");
		lblNewLabel_1_4_1.setBounds(24, 149, 92, 20);
		contentPane.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Pulgadas LLanta");
		lblNewLabel_1_5_1.setBounds(24, 179, 118, 20);
		contentPane.add(lblNewLabel_1_5_1);
		
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
		
		JTextPane textPaneLLanta = new JTextPane();
		textPaneLLanta.setBounds(152, 180, 74, 19);
		contentPane.add(textPaneLLanta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(TiposNeumaticos.values()));
		comboBox.setBounds(126, 149, 100, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("GRABAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean verificar;
				Karts kart = new Karts();
				verificar = kart.VerificarTexPane(textPaneMarca, textPaneCaducidad, textPaneDureza, textPaneColor, comboBox, textPaneLLanta);
				
				if(verificar ) {
					JOptionPane.showMessageDialog(null, "Verificacion Correcta");
					
					
				}
				
				
			}
		});
		btnNewButton.setBounds(291, 211, 100, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Introduzca un valor entre 1 y 100");
		lblNewLabel_2.setBounds(213, 99, 211, 13);
		contentPane.add(lblNewLabel_2);
	}

}
