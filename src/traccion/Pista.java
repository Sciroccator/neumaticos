package traccion;

import java.util.Scanner;

public class Pista extends Neumaticos implements MetodosNeumaticos {
	// heredamos de la clase Neumaticos e implementamos la Interface Metodos neumaticos

	private int adherencia;  // atributos de adherencia y temperatura
	private float temperatura;
	
	public Pista() {// constructor vacio
		super();
	}

	public Pista(int adherencia, float temperatura) { // constructor atributos
		super();
		this.adherencia = adherencia;
		this.temperatura = temperatura;
	}
// constructor atributos y inicia los atributos de la clase padre
	public Pista(String marca, String caducidad, int dureza, String color, TiposNeumaticos tipo, int adherencia,
			float temperatura) {
		super(marca, caducidad, dureza, color, tipo);
		this.adherencia = adherencia;
		this.temperatura = temperatura;
	}

	
	// sobreescritura del metodo crear neumaticos abstracto en la clase padre
	@Override
	public int crearneumatico(Neumaticos[] array, int indice) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los siguientes datos del Neumatico de Pista");

		System.out.println("");
		boolean excecpcion = true;

		while (excecpcion) {/* while para hacer el cuestionario ciclico hasta que se 
			conteste todo correctamente*/

			// recogida de datos con Scanner de tipo String
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
				
				System.out.println("Introduzca la dureza del 1 al 50");
				try {
					
					dureza = sc.nextInt();
					/* se recoge la excepcion por introducir algo distinto a un entero
					y se inicia de nuevo el ciclo al no cambiar el valor de dureza */
				} catch (Exception ex) {

					System.out.println("Error ");
					System.out.println(" ");
					
					System.out.println(" dato erroneo");
					System.out.println(" ");
					sc.nextLine();

				}
            // se controla que el valor esta entre 1 y 50
				if (dureza < 1 || dureza > 50) {
					System.out.println(" solo valores entre 1 y 50 ");
					System.out.println(" ");
					dureza = 0;
				}

			}
			
			// se recoge el valor entero de adherencia 
			int adherencia = 0;
			// se hace un ciclo hasta que el valor sea correcto
			while (adherencia == 0) {
				sc.nextLine();
				System.out.println("introduzca la adherencia del 1 al 10");
				
				try {
		   // se controla que lo que se introduce es un entero 		
				adherencia = sc.nextInt();
				}catch(Exception ex) {
					System.out.println("Error");
                    System.out.println(" ");
					
					System.out.println(" dato erroneo");
					System.out.println(" ");
					
						
					
				}
				// se controla que el entero esta entre 1 y 10
				if (adherencia < 1 || adherencia > 10) {

					System.out.println(" introduzca un valor entre 1 y 10 ");
					System.out.println(" ");
					adherencia = 0;

				}

			}
			// se secoger el valor temperatura
			float temperatura= 0;
			boolean temp = true; // boolean para salir del while cuando el dato sea correcto
			while(temp) {
				sc.nextLine();
			System.out.println("Introduzca la temperatura");
			
			try {
				// controla que el dato introducido sea  un Float
			 temperatura = sc.nextFloat();
			 temp= false; // si el dato es correcto camba temp a false y sale del boolean
			}catch(Exception ex) {
				
				System.out.println(" Error ");
				System.out.println(" ");
					
			   System.out.println(" dato erroneo ");
			   System.out.println(" ");
				temp= true;
				
			}
			
			}
			sc.nextLine();
			boolean bandera = false; // boolean para controlar la salida del ciclo

			while (bandera == false)
			// se controla con el ciclo que los datos introducidos son correctos

			{
				System.out.println("Introduzca el tipo de neumatico MOJADO ,SECO,INTERMEDIO elija (M / S / I)");
                  // se elige el tipo de neumatico en funcion de la seleccion
				String tipoNeumatico = sc.nextLine();
				if (tipoNeumatico.equals("s") || tipoNeumatico.equals("S")) {

					array[indice] = new Pista(marca, caducidad, dureza, color, TiposNeumaticos.SECO, adherencia,
							temperatura);
					// se crea el neumatico y se guarda en el array de la clase Database
					excecpcion = false;// se cambia el boolean para salir del ciclo que controla el metodo
					indice++;// se aumenta el indice para controlar la cantidad de objetos creados
					bandera = true;// se cambia el boolean para salir del ciclo que controla la recogida de este dato
				} else if (tipoNeumatico.equals("m") || tipoNeumatico.equals("M")) {
                   // igual que el anterior if
					array[indice] = new Pista(marca, caducidad, dureza, color, TiposNeumaticos.MOJADO, adherencia,
							temperatura);
					excecpcion = false;
					indice++;
					bandera = true;

				} else if (tipoNeumatico.equals("i") || tipoNeumatico.equals("I")) {
                  // igual que el anterior if
					array[indice] = new Pista(marca, caducidad, dureza, color, TiposNeumaticos.INTERMEDIO, adherencia,
							temperatura);
					excecpcion = false;
					indice++;
					bandera = true;

				} else {
					// si la seleccion es incorrecta lo avisa e inizia de nuevo el ciclo
					System.out.println("Datos Incorrectos Introduzca (S / M / I)");
					bandera = false;
				}
			}

		}
		
	
		return indice;// retorna el indice para controlar el numero de objetos creados

	}

	@Override
	public void marcayCaducidad(Neumaticos goma) {
		/* en funcion de el objeto que le envies te da su marca y acaducidad con sus 
		metodos get*/
		
		
		System.out.println("");
		System.out.println("");

		System.out.println(" La Marca del neumatico de Pista seleccionado es " + goma.getMarca());
		System.out.println(" La Caducidad del neumatico de Pista seleccionado es " + goma.getCaducidad());
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

			System.out.println(" El neumatico de pista Seleccionado es Blando");
			System.out.println("");

		} else if (goma.getDureza() > 10 && goma.getDureza() < 50) {
			System.out.println("");

			System.out.println(" El neumatico de pista Seleccionado es Medio");
			System.out.println("");

		} else if (goma.getDureza() > 50) {
			System.out.println("");

			System.out.println(" El neumatico de pista Seleccionado es Duro");
			System.out.println("");
			

		}

	}
	@Override
	public void informacion() {
		/* te da la informacion del objeto por el que sea invocado este metodo*/
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("La informacion de este neumatico de Pista es:  ");
		System.out.println("");
		System.out.println(super.toString() + "Pista [adherencia=" + adherencia + ", temperatura=" + temperatura + "]");
		System.out.println("");
		System.out.println("");
	

	}
            // getter ann setters de los Atributos
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
