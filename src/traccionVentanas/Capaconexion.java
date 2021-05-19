package traccionVentanas;



public class Capaconexion {
	
	
	
	
	public Capaconexion() {
		
		
	}
			
	     public void altaneumaticos(){
	    	 VentanaAltaNeumatico alta = new VentanaAltaNeumatico();
	    	 alta.setVisible(true);
		
	}
		
		public void caducidadMarca(){
			VentanaMarcaCaducidad cadu = new VentanaMarcaCaducidad();
			cadu.setVisible(true);
		}
			
		
		
		public void infoneumatico(){
			VentanaInformacion info = new VentanaInformacion();
			info.setVisible(true);
			info.setResizable(true);
			info.setLocationRelativeTo(null);
		
		
		}
		
		public void durezaneumatico(){
		 VentanaDureza ventdureza = new VentanaDureza();
		 ventdureza.setVisible(true);
		 
		
			
            
		
	}
	
	
	


	
	
	
	

}
