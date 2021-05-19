package traccionVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.Choice;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VentaALtaPista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaALtaPista frame = new VentaALtaPista();
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
	public VentaALtaPista() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALTA NEUMATICO PISTA");
		lblNewLabel.setBounds(94, 10, 266, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		lblNewLabel_1.setBounds(24, 33, 92, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Caducidad");
		lblNewLabel_1_1.setBounds(24, 63, 92, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dureza");
		lblNewLabel_1_2.setBounds(24, 95, 92, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Color");
		lblNewLabel_1_3.setBounds(24, 125, 92, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tipo");
		lblNewLabel_1_4.setBounds(24, 149, 92, 20);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Adherencia");
		lblNewLabel_1_5.setBounds(24, 179, 92, 20);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Temperatura");
		lblNewLabel_1_6.setBounds(24, 209, 92, 20);
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
		
		JTextPane textPaneAdhere = new JTextPane();
		textPaneAdhere.setBounds(126, 180, 74, 19);
		contentPane.add(textPaneAdhere);
		
		JTextPane textPaneTemp = new JTextPane();
		textPaneTemp.setBounds(126, 209, 74, 19);
		contentPane.add(textPaneTemp);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(TiposNeumaticos.values()));
		comboBox.setBounds(126, 149, 74, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("GRABAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean verificado = false;
				Pista pista = new Pista();
				verificado = pista.VerificarTexPane(textPaneMarca, textPaneCaducidad, textPaneDureza, textPaneColor, comboBox, textPaneAdhere, textPaneTemp);
				if (verificado) {
					JOptionPane.showMessageDialog(null, "Verificacion correcta");
					try {
						pista.Insertarneumatico(pista.crearneumatico(textPaneMarca, textPaneCaducidad, textPaneDureza, textPaneColor, comboBox, textPaneAdhere, textPaneTemp));
					} catch (SQLException | ClassNotFoundException e1) {
						
						JOptionPane.showMessageDialog(null, "Error al insertar Neumatico en base de datos");
					}
					
					
					
				}
				
				
				
			}
		});
		btnNewButton.setBounds(286, 209, 111, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Introduzca un valor entre 1 y 100");
		lblNewLabel_2.setBounds(232, 102, 226, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Introduzca un valor entre 1 y 10");
		lblNewLabel_2_1.setBounds(232, 183, 226, 13);
		contentPane.add(lblNewLabel_2_1);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
