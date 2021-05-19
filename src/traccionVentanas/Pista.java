package traccionVentanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;



public class Pista extends Neumaticos  {
	

	private int adherencia;  
	private float temperatura;
	
	public Pista() {
		super();
	}

	public Pista(int adherencia, float temperatura) {
		super();
		this.adherencia = adherencia;
		this.temperatura = temperatura;
	}

	public Pista(String marca, String caducidad, int dureza, String color, String tipo, int adherencia,
			float temperatura) {
		super(marca, caducidad, dureza, color, tipo);
		this.adherencia = adherencia;
		this.temperatura = temperatura;
	}
	
	
	
	
	public void Insertarneumatico(Pista pista1) throws SQLException, ClassNotFoundException  {
		
		  
		
		 
		
		Connection conn = Database.abrirConexion();
		 if (conn.isClosed())
	     {
	    	 JOptionPane.showMessageDialog(null, "No hay conexion a base de datos, revise la conexion ");
	    	 
	     }else {
	    	 
	    	 JOptionPane.showMessageDialog(null, " Conectado a Base de datos");
	    	 
	     }
		
	                       
		PreparedStatement stmt =  conn.prepareStatement("insert into pista(marca,caducidad,dureza,color,tipo,adherencia,temperatura)values(?,?,?,?,?,?,?)");
		stmt.setString(1,pista1.getMarca());
		stmt.setString(2,pista1.getCaducidad());
		stmt.setInt(3, pista1.getDureza());
		stmt.setString(4,pista1.getColor());
		stmt.setString(5,pista1.getTipo());
		stmt.setInt(6,pista1.getAdherencia());
		double temp  = pista1.getTemperatura();
		stmt.setDouble(7, temp);
		
		int count = stmt.executeUpdate();
		
		
		
	     conn.close();
	     
	     if (conn.isClosed())
	     {
	    	 JOptionPane.showMessageDialog(null, "Conexion Cerrada a base de datos");
	    	 
	     }else {
	    	 
	    	 JOptionPane.showMessageDialog(null, "Error La conexion no se ha cerrado");
	    	 
	     }
		
	
	
		
	}
		
	
	


	
	public Pista crearneumatico(JTextPane marca,JTextPane caducidad, JTextPane dureza,
			JTextPane color,JComboBox tipo,JTextPane adherencia,JTextPane temperatura) {
		
		String marca1= marca.getText();
		String caducidad1 =caducidad.getText();
		int dureza1 = Integer.parseInt(dureza.getText());
		String color1 = color.getText();
		String tipo1 = tipo.getSelectedItem().toString();
		int adherencia1 = Integer.parseInt(adherencia.getText());
		float temperatura1 = Float.parseFloat(temperatura.getText());
		
		Pista pista1  = new Pista(marca1,caducidad1,dureza1,color1,tipo1,adherencia1,temperatura1);
		

		return pista1;
		
	}

	

	
	
	public boolean  VerificarTexPane(JTextPane marca,JTextPane caducidad, JTextPane dureza,
			JTextPane color,JComboBox tipo,JTextPane adherencia,JTextPane temperatura) {
		
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
		 if( adherencia.getText().length()>0) {
			 
				double num ;
				try {
				num = Double.parseDouble(adherencia.getText());
				if (num<0 ||num>10) {
					JOptionPane.showMessageDialog(null,"Introduzca un valor para Adherencia entre 1 y 10");
				
				}else {
				contador ++;
				}
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Introduzca un valor correcto para adherencia");
				}
				
	
		 }
		 if (temperatura.getText().length()>0)
		 {
			 
			 try {
			 double num = Double.parseDouble(temperatura.getText());
			 contador ++;
			 
			 }catch(Exception ex) {
				 
				 JOptionPane.showMessageDialog(null,"Introduzca un valor correcto para Temperatura");
				 
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

	

	

	
            
	public int getAdherencia() {
		return adherencia;
	}

	public void setAdherencia(int adherencia) {
		this.adherencia = adherencia;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	
	
	}

	
}
