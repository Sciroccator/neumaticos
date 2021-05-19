package traccionVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInformacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInformacion frame = new VentanaInformacion();
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
	public VentanaInformacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel infolabel = new JLabel("Elija el tipo de neumatico del que desea informacion");
		infolabel.setFont(new Font("Verdana", Font.BOLD, 12));
		infolabel.setBounds(46, 21, 388, 13);
		contentPane.add(infolabel);
		
		JButton btnNewButton = new JButton("PISTA");
		btnNewButton.setBounds(46, 73, 95, 29);
		contentPane.add(btnNewButton);
		
		JButton btnRallyes = new JButton("RALLYES");
		btnRallyes.setBounds(46, 122, 95, 29);
		contentPane.add(btnRallyes);
		
		JButton btnKarts = new JButton("KARTS");
		btnKarts.setBounds(46, 172, 95, 29);
		contentPane.add(btnKarts);
		
		JButton btnSalir = new JButton("VOLVER");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaPrincipal ventana = new VentanaPrincipal();
				ventana.setVisible(true);
				dispose();
				
				
			}
		});
		btnSalir.setBounds(276, 189, 102, 29);
		contentPane.add(btnSalir);
	}
}
