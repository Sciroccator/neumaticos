package traccion;

import java.util.Scanner;

public class DataBase {
	
	/* clase creada para guardar los datos de el programa y para interactuar entre
	el usuario final y los metodos de cada clase */
	
	// atributos para la clase pista
	Pista[]pista = new Pista[3];// array para guardar los objetos pista
	int indicepista= 0; // cuenta los objetos pista y sirve de indice al array
	Pista pista1 = new Pista(); 
	// atributos para la clase rallye
	Rallyes[]rallyes = new Rallyes[3];// array para guardar los objetos Rallye
	int indicerallyes= 0;// cuenta los objetos pista y sirve de indice al array
	Rallyes rallye1 = new Rallyes();// objeto Rallye para conectar con la clase
	// atributos para la clase Karts
	Karts[]karts = new Karts[3];// array para guardar los objetos Karts
	int indicekarts= 0;// cuenta los objetos pista y sirve de indice al array
	Karts karts1 = new Karts();// objeto Karts para conectar con la clase
	
	
	public DataBase() {
		// Constructor vacio , no necesita iniciar ningun atributo 
		
	}
			
	public void altaneumaticos(){
		
		// metodo para conectar con el metodo crearneumatico y darle el objeto he indice correctos
		Scanner sc = new Scanner(System.in);

			String respuesta= "";
			System.out.println("que tipo de neumatico quiere dar de alta Pista ,Rallyes o Karts ");
		// selecciona que tipo de neumatico damos de alta
			System.out.println("Escriba (P / R  / K)");
			respuesta = sc.nextLine();
        // en funcion de la seleccion le damos unos atributos u otros
			if (respuesta.equals("p") || respuesta.equals("P"))
			{
				if (indicepista<3) { // comprovamos que no se ha excedido de 3 objetos almacenados
				
				indicepista = pista1.crearneumatico(pista, indicepista);
				
				/* llamamos al metodo Crear neumatico desde el indice que le corresponde
				para guardar el retorno del indice de dicho metodo, se proporcionamos el array
				co rrecto y el indice a tratar que posteriormente nos devolvera ya modificado*/
				
				
				}else {
					// si ya se ha llegado a 3 en el array nos avisa y no no deja dar mas altas
					
					System.out.println("");

					System.out.println("ha Superado el numero de neumaticos grabados");
					System.out.println("");
					System.out.println("");

					
				}
				
			}else if (respuesta.equals("r")|| respuesta.equals("R"))
				
				// igual al anterior if
			{
				if (indicerallyes<3) {
				indicerallyes = rallye1.crearneumatico(rallyes, indicerallyes);
				}else {
					System.out.println("");

					System.out.println("Ha superado el numero de neumaticos grabados");
					System.out.println("");
					System.out.println("");

				}
				
			}else if (respuesta.equals("k")|| respuesta.equals("K"))
				// igual al anterior if
			{
				if(indicekarts<3) {
				indicekarts = karts1.crearneumatico(karts, indicekarts);
				}else {
					
					System.out.println("");

					System.out.println("Ha superado el numero de neumaticos grabados");
					System.out.println("");
					System.out.println("");

					
				}
			} else {
				// si la seleccion es erronea no avisa y nos saca del metodo
				System.out.println(" eleccion Erronea , Vuelva a intentarlo");
			}
		
        
				
	}
		
		
		public void caducidadMarca(){
			/* metodo para conectar con el metodo marcayCaducidad y darle el objeto 
			e indice correctos */

			Scanner sc = new Scanner(System.in);

			String respuesta= "";
			System.out.println("que tipo de neumatico quiere saber la caducidad y Marca.(Pista ,Rallyes o Karts ");
			// selecciona que tipo de neumatico a consultar


			System.out.println("Escriba (P / R  / K)");
	        // en funcion de la seleccion le damos unos objeto u otro

			respuesta = sc.nextLine();
			int eleccion= 0; // ciclo para comprobar que la respuesta es correcta
			if (respuesta.equals("p") || respuesta.equals("P"))
			{
				while (eleccion == 0) { // ciclo para comprobar que la respuesta es correcta
				System.out.println("Elija que neumatico de Pista quiere comprobar de los 3 almacenados ");
				System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
				try {
				eleccion = sc.nextInt();
				}catch(Exception e) {
					System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
					eleccion = 0;
				}
				
				
				if (pista[eleccion-1]!= null) {// se comprueba que el neumatico seleccionado existe
					
					// si existe se llama al metodo marcayCaducidad y se le proporciona el objeto seleccionado
				pista1.marcayCaducidad(pista[eleccion-1]);
				}else {
					// si no existe se avisa y se sale del metodo
					
					System.out.println("");
					System.out.println(" El neumatico no ha sido creado");
					System.out.println("");

				}
				
				
				
				}
				
			}else if (respuesta.equals("r")|| respuesta.equals("R"))
				
				// igual al anterior if
			{
				while (eleccion == 0) {
					System.out.println("Elija que neumatico de Rallyes quiere comprobar de los 3 almacenados ");
					System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
					try {
					eleccion = sc.nextInt();
					}catch(Exception e) {
						System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
						eleccion = 0;
					}
					if (rallyes[eleccion-1]!= null) {
					rallye1.marcayCaducidad(rallyes[eleccion-1]);
					}
					else {
						System.out.println("");
						System.out.println(" El neumatico no ha sido creado");
						System.out.println("");
						
						
					}
					
					}
				
				
			}else if (respuesta.equals("k")|| respuesta.equals("K"))
				
				// igual al anterior if
			{
				while (eleccion == 0) {
					System.out.println("Elija que neumatico de karts quiere comprobar de los 3 almacenados ");
					System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
					try {
					eleccion = sc.nextInt();
					}catch(Exception e) {
						System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
						eleccion = 0;
					}
					if(karts[eleccion-1]!= null) {
					karts1.marcayCaducidad(karts[eleccion-1]);
					}else
					{
						System.out.println("");
						System.out.println(" El neumatico no ha sido creado");
						System.out.println("");
						
					}
					}
				
				
				
			} else {
				// si la eleccion de neumatico no es correcta nos avisa
				System.out.println(" eleccion Erronea , Vuelva a intentarlo");
			}
			
		
		}
			
		
		
		public void infoneumatico(){
			/* conecta con el metodo informacion para darle el objeto 
			e indice correctos */
			Scanner sc = new Scanner(System.in);

			String respuesta= "";
			System.out.println("que tipo de neumatico quiere la Informacion .(Pista ,Rallyes o Karts ");
			// selecciona que tipo de neumatico a consultar

			System.out.println("Escriba (P / R  / K)");
			// en funcion de la seleccion le damos unos objeto u otro
			
			respuesta = sc.nextLine();
			int eleccion= 0;
			// ciclo para comprobar que la respuesta es correcta
			if (respuesta.equals("p") || respuesta.equals("P"))
			{
				while (eleccion == 0) {// ciclo para comprobar que la respuesta es correcta
				System.out.println("Elija que neumatico de Pista del que quiera Informacion de los 3 almacenados ");
				System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
				try {
				eleccion = sc.nextInt();
				}catch(Exception e) {
					System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
					eleccion = 0;
				}
				if (pista[eleccion-1]!= null)
					// se comprueba que el neumatico seleccionado existe
				{
					
					// si existe se llama al metodo informacion y se le proporciona el objeto seleccionado

				pista[eleccion-1].informacion();
				}else {
					// si no existe se avisa y se sale del metodo

					System.out.println("");
					System.out.println(" El neumatico no ha sido creado");
					System.out.println("");
				}
				}
				
			}else if (respuesta.equals("r")|| respuesta.equals("R"))
				// igual al if anterior
			{
				while (eleccion == 0) {
					System.out.println("Elija que neumatico de Rallyes del que quiera informacion de los 3 almacenados ");
					System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
					try {
					eleccion = sc.nextInt();
					}catch(Exception e) {
						System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
						eleccion = 0;
					}
					
					if (rallyes[eleccion-1]!= null) {
					rallyes[eleccion-1].informacion();
					}else {
						
						
						System.out.println("");
						System.out.println(" El neumatico no ha sido creado");
						System.out.println("");
						
					}
					
					}
				
				
			}else if (respuesta.equals("k")|| respuesta.equals("K"))
				
				// igual al if anterior

			{
				while (eleccion == 0) {
					System.out.println("Elija que neumatico de karts del que quiera informacion de los 3 almacenados ");
					System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
					try {
					eleccion = sc.nextInt();
					}catch(Exception e) {
						System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
						eleccion = 0;
					}
					
					if (karts[eleccion-1]!= null)
					{
					karts[eleccion-1].informacion();
					}else {
						
						System.out.println("");
						System.out.println(" El neumatico no ha sido creado");
						System.out.println("");
					}
					
					}
				
				
				
			} else {
				
				// nos avisa si la seleccion del neumatico en erronea
				
				System.out.println(" eleccion Erronea , Vuelva a intentarlo");
			}
			
		

		
		
		}
		
		public void durezaneumatico(){
			/* conecta con el metodo /* conecta con el metodo durezaNeumatico para darle el objeto 
			e indice correctos */ 
			
			Scanner sc = new Scanner(System.in);

			String respuesta= "";
			System.out.println("que tipo de neumatico quiere saber la Dureza (Pista ,Rallyes o Karts ");
			

			System.out.println("Escriba (P / R  / K)");
			// selecciona que tipo de neumatico a consultar
			// en funcion de la seleccion le damos unos objeto u otro

			respuesta = sc.nextLine();
			int eleccion= 0;
			if (respuesta.equals("p") || respuesta.equals("P"))
				// ciclo para comprobar que la respuesta es correcta

			{
				while (eleccion == 0) {			// ciclo para comprobar que la respuesta es correcta

				System.out.println("Elija que neumatico de Pista quiere comprobar su dureza  los 3 almacenados ");
				System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
				try {
				eleccion = sc.nextInt();
				}catch(Exception e) {
					System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
					eleccion = 0;
				}
				
				if(pista [eleccion-1]!= null) {
					// se comprueba que el neumatico seleccionado existe
					// si existe se llama al metodo durezaNeumatico y se le proporciona el objeto seleccionado

				pista1.durezaNeumatico(pista[eleccion-1]);
				}else {
					// si no existe se avisa y se sale del metodo

					System.out.println("");
					System.out.println(" El neumatico no ha sido creado");
					System.out.println("");
					
				}
				}
				
			}else if (respuesta.equals("r")|| respuesta.equals("R"))
				// igual al if anterior
			{
				while (eleccion == 0) {
					System.out.println("Elija que neumatico de Rallyes quiere comprobar su Dureza de los 3 almacenados ");
					System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
					try {
					eleccion = sc.nextInt();
					}catch(Exception e) {
						System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
						eleccion = 0;
					}
					if (rallyes[eleccion-1]!= null)
					{
					rallye1.durezaNeumatico(rallyes[eleccion-1]);
					}else {
						
						System.out.println("");
						System.out.println(" El neumatico no ha sido creado");
						System.out.println("");
					}
					
					}
				
				
			}else if (respuesta.equals("k")|| respuesta.equals("K"))
				// igual al if anterior

			{
				while (eleccion == 0) {
					System.out.println("Elija que neumatico de karts quiere comprobar su dureza  de los 3 almacenados ");
					System.out.println("Neumatico 1º 2º o 3º ,marque  (1 / 2 / 3)");
					try {
					eleccion = sc.nextInt();
					}catch(Exception e) {
						System.out.println("Error el dato introducido no es correcto, intentelo de nuevo");
						eleccion = 0;
					}
					if(karts[eleccion-1]!= null) {
					karts1.durezaNeumatico(karts[eleccion-1]);
					}else {
						System.out.println("");
						System.out.println(" El neumatico no ha sido creado");
						System.out.println("");
					}
					}
				
				
				
			} else {
				
				// nos avisa si la seleccion de neumatico es erronea
				
				System.out.println(" eleccion Erronea , Vuelva a intentarlo");
			}
	
			
            
		
	}
	
	
	


	
	
	
	

}
