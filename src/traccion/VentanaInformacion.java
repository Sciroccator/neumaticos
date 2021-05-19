package traccion;

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
		
		JMenu menuPista = new JMenu("PISTA");
		menuPista.setBounds(32, 57, 115, 25);
		contentPane.add(menuPista);
		
		JMenuItem pista1 = new JMenuItem("Neumatico1");
		pista1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		menuPista.add(pista1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Neumatico2");
		menuPista.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("neumatico3");
		menuPista.add(mntmNewMenuItem_1);
		
		JMenu mnRallyes = new JMenu("RALLYES");
		mnRallyes.setBounds(32, 106, 115, 25);
		contentPane.add(mnRallyes);
		
		JMenuItem pista1_1 = new JMenuItem("Neumatico1");
		mnRallyes.add(pista1_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Neumatico2");
		mnRallyes.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("neumatico3");
		mnRallyes.add(mntmNewMenuItem_1_1);
		
		JMenu mnKarts = new JMenu("KARTS");
		mnKarts.setBounds(32, 151, 115, 25);
		contentPane.add(mnKarts);
		
		JMenuItem pista1_2 = new JMenuItem("Neumatico1");
		mnKarts.add(pista1_2);
		
		JMenuItem mntmNewMenuItem_2_2 = new JMenuItem("Neumatico2");
		mnKarts.add(mntmNewMenuItem_2_2);
		
		JMenuItem mntmNewMenuItem_1_2 = new JMenuItem("neumatico3");
		mnKarts.add(mntmNewMenuItem_1_2);
	}
}
