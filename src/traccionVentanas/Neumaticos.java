package traccionVentanas;

import java.sql.SQLException;

public abstract class Neumaticos {
	// clase Abstracta Neumaticos de la cual van ha heredar los tipos de neumaticos
	
	
	//atributos 
	protected String marca;
	protected String caducidad;
	protected int dureza;
	protected String color;
	protected String tipo;
	
	
	
	
	
	public Neumaticos() {
		// constructor vacio
	
	}
	
	
	public Neumaticos(String marca, String caducidad, int dureza, String color,String tipo) {
	   // constructor con atributos a iniciarse
		this.marca = marca;
		this.caducidad = caducidad;
		this.dureza = dureza;
		this.color = color;
		this.tipo = tipo;
	}
	
    public abstract void informacion() ;
		

    public void durezaNeumatico(Neumaticos goma) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
		
		
		
	}
	
    public void marcayCaducidad(Neumaticos goma) {
    	
    	
    	
		
	}
	
		
		
	
   // getter and setters

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}


	public int getDureza() {
		return dureza;
	}


	public void setDureza(int dureza) {
		this.dureza = dureza;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

     // metodo to String
	@Override
	public String toString() {
		return "Neumaticos [marca=" + marca + ", caducidad=" + caducidad + ", dureza=" + dureza + ", color=" + color
				+ ", tipo=" + tipo + "]";
	}


	
	
	
	
	

}


