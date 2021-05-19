package traccionVentanas;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class Karts extends Neumaticos{
	
	
	private int llanta;// atributo
	
	
	// constructor vacio

	public Karts() {
		super();
	}


	// constructor atributos

	public Karts(int llanta) {
		super();
		this.llanta = llanta;
	}


	// constructor atributos e inicia los atributos de la clase padre

	public Karts(int llanta,String marca, String caducidad, int dureza, String color,String tipo) {
		super(marca, caducidad, dureza, color, tipo);
		this.llanta = llanta;
		
		
	}
	
	public Karts  crearneumatico(JTextPane marca,JTextPane caducidad, JTextPane dureza,
			JTextPane color,JComboBox tipo,JTextPane llanta) {
		
		
		String marca1 = marca.getText();
		String caducidad1 = caducidad.getText();
		int dureza1 = Integer.parseInt(dureza.toString());
		String color1 = color.getText();
		String tipo1 = tipo.getSelectedObjects().toString();
		int llanta1 = Integer.parseInt(llanta.getText());
		
		
		Karts karts1 = new Karts(llanta1,marca1,caducidad1,dureza1,color1,tipo1);
		
		return karts1;
		
		
	}
	
	
	
	public boolean  VerificarTexPane(JTextPane marca,JTextPane caducidad, JTextPane dureza,
			JTextPane color,JComboBox tipo,JTextPane llanta) {
		
		boolean verificar  = false;
		int contador = 0;
		
		if (marca.getText().length()>0) {
			contador ++;
		}
		if (caducidad.getText().length()>0) {
			contador++;
		}
		 if( dureza.getText().length()>0) {
			 
		double num ;
		try {
		num = Double.parseDouble(dureza.getText());
		if (num<0 ||num>100) {
			JOptionPane.showMessageDialog(null,"Introduzca un valor para Dureza entre 1 y 100");
		
		}else {
		
		contador ++;
		}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Introduzca un valor correcto para dureza");
		}
		
		}
          if (color.getText().length()>0) {
			 
			 contador ++;
			 
		 }
          
          String combo = tipo.getSelectedItem().toString();
          
		 if (combo.length()>0) {
			
			 contador ++;
			 
		 }
		
		 if (llanta.getText().length()>0)
		 {
			 
			 try {
			 double num = Double.parseDouble(llanta.getText());
			 contador ++;
			 
			 }catch(Exception ex) {
				 
				 JOptionPane.showMessageDialog(null,"Introduzca un valor correcto para llanta");
				 
			 }
			 
			 
		 } 
		 if ( contador == 6) {
			 verificar = true;
		 }
		 
		 
		return verificar;

	}
	
	
	

	
	
	


	@Override
	public void informacion() {
		
		
		
		
	}




	
		
	



	
	




	


	
	
	
	


}
