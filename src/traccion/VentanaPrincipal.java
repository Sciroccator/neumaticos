package traccion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("              Menu Neumaticos Escuderia HRT");
		titulo.setBackground(SystemColor.activeCaption);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		titulo.setBounds(50, 20, 350, 30);
		contentPane.add(titulo);
		
		JButton boton1 = new JButton("Entrar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAltaNeumatico ventalta = new VentanaAltaNeumatico();
				ventalta.setVisible(true);
				
				
			}
		});
		boton1.setBounds(266, 59, 85, 21);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Entrar");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMarcaCaducidad ventMarCadu = new VentanaMarcaCaducidad();
				ventMarCadu.setVisible(true);
				
			}
		});
		boton2.setBounds(266, 90, 85, 21);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("Entrar");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInformacion ventinfo = new VentanaInformacion();
				ventinfo.setVisible(true);
				
				
				
			}
		});
		boton3.setBounds(266, 121, 85, 21);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("Entrar");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaDureza ventdure = new VentanaDureza();
				ventdure.setVisible(true);
			}
		});
		boton4.setBounds(266, 152, 85, 21);
		contentPane.add(boton4);
		
		JButton boton5 = new JButton("Entrar");
		boton5.setBounds(266, 183, 85, 21);
		contentPane.add(boton5);
		
		JLabel neumaticos = new JLabel("Dar de alta neum\u00E1ticos");
		neumaticos.setBounds(79, 60, 167, 13);
		contentPane.add(neumaticos);
		
		JLabel marcaCaducidad = new JLabel("Marca y caducidad del neum\u00E1tico");
		marcaCaducidad.setBounds(79, 94, 167, 13);
		contentPane.add(marcaCaducidad);
		
		JLabel info = new JLabel("Informacion del neumatico");
		info.setBounds(79, 125, 167, 13);
		contentPane.add(info);
		
		JLabel dureza = new JLabel("Dureza del neum\u00E1tico");
		dureza.setBounds(79, 156, 167, 13);
		contentPane.add(dureza);
		
		JLabel out = new JLabel("SALIR");
		out.setBounds(79, 187, 44, 13);
		contentPane.add(out);
	}
}
