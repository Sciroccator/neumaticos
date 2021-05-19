package traccionVentanas;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class Rallyes extends Neumaticos{
	
	// atributos
	private float presion;
	private int profundidadDibujo;
	
	// constructor vacio
	public Rallyes() {
		super();
	}
	// constructor atributos
	public Rallyes(float presion, int profundidadDibujo) {
		super();
		this.presion = presion;
		this.profundidadDibujo = profundidadDibujo;
	}
	// constructor atributos e inicia los atributos de la clase padre
	public Rallyes(float presion, int profundidadDibujo,String marca, String caducidad, int dureza, String color, String tipo) {
		super(marca, caducidad, dureza, color, tipo);
		this.presion = presion;
		this.profundidadDibujo = profundidadDibujo;
	}
		
	public Neumaticos crearneumatico (JTextPane marca,JTextPane caducidad, JTextPane dureza,
			JTextPane color,JComboBox tipo,JTextPane presion,JTextPane profundidad) {
		
		String marca1 = marca.getText();
		String caducidad1 = caducidad.getText();
		int dureza1= Integer.parseInt(dureza.getText());
		String color1 = color.getText();
		String tipo1 = tipo.getSelectedItem().toString();
		float presion1 = Float.parseFloat(presion.getText());
		int profundidad1 = Integer.parseInt(profundidad.getText());
		
		
		Rallyes rallyes1 = new Rallyes(presion1,profundidad1,marca1,caducidad1,dureza1,color1,tipo1);
	
		
		return rallyes1;
	}
	
	
	
	
	
	public boolean  VerificarTexPane(JTextPane marca,JTextPane caducidad, JTextPane dureza,
			JTextPane color,JComboBox tipo,JTextPane presion,JTextPane profundidad) {
		
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
		 if( presion.getText().length()>0) {
			 
				double num ;
				try {
				num = Double.parseDouble(presion.getText());
				
				contador ++;
				
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Introduzca un valor correcto para Presion");
				}
				
	
		 }
		 if (profundidad.getText().length()>0)
		 {
			 
			 try {
			 double num = Double.parseDouble(profundidad.getText());
			 contador ++;
			 
			 }catch(Exception ex) {
				 
				 JOptionPane.showMessageDialog(null,"Introduzca un valor correcto para Profundidad dibujo");
				 
			 }
			 
			 
		 } 
		 if ( contador == 7) {
			 verificar = true;
		 }
		 
		 
		return verificar;
	}

	
	
	
	
	
	
	
	
	@Override
	public void informacion() {
		

	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	// getters and setters 
	public float getPresion() {
		return presion;
	}
	public void setPresion(float presion) {
		this.presion = presion;
	}
	public int getProfundidadDibujo() {
		return profundidadDibujo;
	}
	public void setProfundidadDibujo(int profundidadDibujo) {
		this.profundidadDibujo = profundidadDibujo;
	}
	
	
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	

}
