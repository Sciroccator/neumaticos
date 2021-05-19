package traccionVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMarcaCaducidad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMarcaCaducidad frame = new VentanaMarcaCaducidad();
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
	public VentanaMarcaCaducidad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija el tipo de neumatico que quiere dar de alta ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(52, 10, 334, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PISTA");
		btnNewButton.setBounds(37, 79, 98, 33);
		contentPane.add(btnNewButton);
		
		JButton btnRallyes = new JButton("RALLYES");
		btnRallyes.setBounds(37, 133, 98, 33);
		contentPane.add(btnRallyes);
		
		JButton btnKarts = new JButton("KARTS");
		btnKarts.setBounds(37, 188, 98, 33);
		contentPane.add(btnKarts);
		
		JButton btnSalir = new JButton("VOLVER");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				VentanaPrincipal ventana = new VentanaPrincipal();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(290, 188, 96, 34);
		contentPane.add(btnSalir);
	}

}
