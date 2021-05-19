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

public class VentanaDureza extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDureza frame = new VentanaDureza();
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
	public VentanaDureza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione de que Tipo de neumatico quiere saber la dureza");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(43, 10, 381, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PISTA");
		btnNewButton.setBounds(48, 81, 95, 29);
		contentPane.add(btnNewButton);
		
		JButton btnRallyes = new JButton("RALLYES");
		btnRallyes.setBounds(48, 135, 95, 29);
		contentPane.add(btnRallyes);
		
		JButton btnKarts = new JButton("KARTS");
		btnKarts.setBounds(48, 189, 95, 29);
		contentPane.add(btnKarts);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaPrincipal ventana = new VentanaPrincipal();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(297, 204, 95, 29);
		contentPane.add(btnNewButton_1);
	}
}
