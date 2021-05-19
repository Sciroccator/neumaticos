package traccion;

public abstract class Neumaticos {
	// clase Abstracta Neumaticos de la cual van ha heredar los tipos de neumaticos
	
	
	//atributos 
	protected String marca;
	protected String caducidad;
	protected int dureza;
	protected String color;
	protected TiposNeumaticos tipo;
	
	
	
	
	
	public Neumaticos() {
		// constructor vacio
	
	}
	
	
	public Neumaticos(String marca, String caducidad, int dureza, String color,TiposNeumaticos tipo) {
	   // constructor con atributos a iniciarse
		this.marca = marca;
		this.caducidad = caducidad;
		this.dureza = dureza;
		this.color = color;
		this.tipo = tipo;
	}
	
	/* metodo abstracto para implementar en las clases hijas para crear 
	   guardar neumaticos en un array y controlar el numero de objetos creados*/
	public abstract int crearneumatico(Neumaticos[] array,int indice);
	
		
		
	
   // getter and setters

	public TiposNeumaticos getTipo() {
		return tipo;
	}


	public void setTipo(TiposNeumaticos tipo) {
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


