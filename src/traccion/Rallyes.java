package traccion;

import java.util.Scanner;


// la clase hereda de la clase Neumaticos he implementa la interface Metodos neumaticos
public class Rallyes extends Neumaticos implements MetodosNeumaticos {
	
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
	public Rallyes(float presion, int profundidadDibujo,String marca, String caducidad, int dureza, String color, TiposNeumaticos tipo) {
		super(marca, caducidad, dureza, color, tipo);
		this.presion = presion;
		this.profundidadDibujo = profundidadDibujo;
	}
		
	
	@Override
	// se sobreescribe los metodos de la interface
	public void marcayCaducidad(Neumaticos goma) {
		// en funcion del objeto que le damos con sus metodos get nos da la marca y caducidad
		System.out.println("");
		System.out.println("");

		System.out.println(" La Marca del neumatico de Rallye seleccionado es " + goma.getMarca());
		System.out.println(" La Caducidad del neumatico de Rallye seleccionado es " + goma.getCaducidad());
		System.out.println("");
		System.out.println("");

	}
	@Override
	
	public void durezaNeumatico(Neumaticos goma) {
		/* en funcion del el objeto que le pases te dice la dureza del neumatico 
		 * tambien filtra el grado de dureza en funcion al dato que obtenga con
		 * el metodo getDureza
		 */
		if (goma.getDureza() <= 10) {
			
			System.out.println("");

			System.out.println(" El neumatico de rallyes Seleccionado es Blando");
			System.out.println("");

		} else if (goma.getDureza() > 10 && goma.getDureza() < 50) {
			System.out.println("");

			System.out.println(" El neumatico de rallyes Seleccionado es Medio");
			System.out.println("");

		} else if (goma.getDureza() > 50) {
			System.out.println("");

			System.out.println(" El neumatico de rallyes Seleccionado es Duro");
			System.out.println("");
			

		}
		
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
	
	@Override
	public void informacion() {
		// en funcion del objeto que le damos con sus metodo get nos da la presion

		System.out.println("");
		System.out.println("La informacion de este neumatico de pista es");
		System.out.println("");
		System.out.println("");
		System.out.println(super.toString() + "Rallyes [presion=" + presion + ", profundidadDibujo=" + profundidadDibujo + "]");
		System.out.println("");
		System.out.println("");
		

	}
	
	
	
	@Override
	
	//Implementamos el metodo abstracto de la clase Padre para crear neumaticos
	
	public int crearneumatico(Neumaticos[] array, int indice) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Introduzca los siguientes datos del Neumatico de Rallye");

		System.out.println("");
		boolean excecpcion = true;// boolean para controlar la salida del ciclo

		while (excecpcion) {
    // ciclo para controlar que los datos recogidos son correctos 
			
			// recogida de datos de tipo String
			System.out.println("Introduzca la Marca de neumaticos");
			String marca = sc.nextLine();
			System.out.println("Introduzca la caducidad");
			String caducidad = sc.nextLine();
			System.out.println("Introduzca el color ");
			String color = sc.nextLine();
			
			/* recogida de el dato dureza que al ser de tipo int ha de ser controlado
			que lo que recoge scanner es un entero*/
			
			int dureza = 0;
			while (dureza == 0)
			{
				System.out.println("");

				System.out.println("Introduzca la dureza del 1 al 50");
				try {
					dureza = sc.nextInt();
				} catch (Exception ex) {
					/* se recoge la excepcion por introducir algo distinto a un entero
					y se inicia de nuevo el ciclo al no cambiar el valor de dureza */

					System.out.println("Error ");
					System.out.println(" ");
					
					System.out.println(" dato erroneo ");
					System.out.println(" ");
					sc.nextLine();

				}

				if (dureza < 1 || dureza > 50) {
					 // se controla que el valor esta entre 1 y 50
					System.out.println("");

					System.out.println(" solo valores entre 1 y 50 ");
					System.out.println(" ");
					dureza = 0;
				}

			}
			
			
			// se recoge el valor entero de profundidad
			int profundidad = 0;
			boolean prof= true;
			while (prof) {
				// se hace un ciclo hasta que el valor sea correcto
				sc.nextLine();
				System.out.println("");

				System.out.println("introduzca la profundidad del dibujo del neumatico");
				
				
				try {
					 // se controla que lo que se introduce es un entero 	
				profundidad = sc.nextInt();
				prof = false;
				}catch(Exception ex) {
					System.out.println("Error");
                    System.out.println(" ");
					
					System.out.println(" dato erroneo ");
					System.out.println(" ");
					
					prof = true;	
					
				}
				

			}
			
			// se recoge el valor entero de presion

			float presion= 0;
			boolean pres = true;
			while(pres) {
				// se hace un ciclo hasta que el valor sea correcto

				sc.nextLine();
				System.out.println("");

			System.out.println("Introduzca la presion del neumatico");
			
			try {
			 presion = sc.nextFloat();
			 pres= false;
			}catch(Exception ex) {
				 // se controla que lo que se introduce es un float	

				System.out.println(" Error ");
				System.out.println(" ");
					
			   System.out.println(" dato erroneo");
			   System.out.println(" ");
				pres= true;
				
			}
			
			}
			
			
			
			
			
			sc.nextLine();
			boolean bandera = false; // boolean para controlar la salida del ciclo
			while (bandera == false)
				// se controla con el ciclo que los datos introducidos son correctos

			{
				System.out.println("");

				System.out.println("Introduzca el tipo de neumatico MOJADO ,SECO,INTERMEDIO elija (M / S / I)");
                // se elige el tipo de neumatico en funcion de la seleccion

				System.out.println("");

				String tipoNeumatico = sc.nextLine();
				if (tipoNeumatico.equals("s") || tipoNeumatico.equals("S")) {

					array[indice] = new Rallyes(presion,profundidad,marca,caducidad,dureza,color,TiposNeumaticos.SECO);
					// se crea el neumatico y se guarda en el array de la clase Database

					excecpcion = false;
					// se cambia el boolean para salir del ciclo que controla el metodo
					
					indice++;// se aumenta el indice para controlar la cantidad de objetos creados
					bandera = true;// se cambia el boolean para salir del ciclo que controla la recogida de este dato
					
				} else if (tipoNeumatico.equals("m") || tipoNeumatico.equals("M")) {
					 // igual que el anterior if
					array[indice] = new Rallyes(presion,profundidad,marca,caducidad,dureza,color,TiposNeumaticos.MOJADO);
					excecpcion = false;
					indice++;
					bandera = true;

				} else if (tipoNeumatico.equals("i") || tipoNeumatico.equals("I")) {
					 // igual que el anterior if
					array[indice] =new Rallyes(presion,profundidad,marca,caducidad,dureza,color,TiposNeumaticos.INTERMEDIO);
					excecpcion = false;
					indice++;
					bandera = true;

				} else {
					// si la seleccion es incorrecta lo avisa e inizia de nuevo el ciclo

					System.out.println("");

					System.out.println("Datos Incorrectos Introduzca (S / M / I)");
					System.out.println("");

					bandera = false;
				}
			}

		}
		return indice;// retorna el indice para controlar el numero de objetos creados

	}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	

}
