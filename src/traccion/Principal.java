package traccion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
		
		
		
		
		
	    DataBase data1 = new DataBase();// objeto Database para conectar con la clase
		String opcion = "0"; // guarda la eleccion del usuario 
		Scanner sc = new Scanner(System.in);// recoge datos
		while(opcion.contains("5")== false) {
			// ciclo para mantener el menu activo mientras no se selccione 5
			
			System.out.println("*******************************************");
			System.out.println("*      MENU NEUMATICOS ESCUDERIA HRT      *");
			System.out.println("*******************************************");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("1]  Dar de alta  Neumatico ");
			System.out.println("2]  Marca y caducidad del Neumatico");
			System.out.println("3]  Informacion del Neumatico");
			System.out.println("4]  Dureza del Neumatico");
			System.out.println("5]  SALIR ");
			
			System.out.print(" INTRODUZCA UNA OPCION : ");
			
			
			// se introduce la opcion y se guarda en opcion con scanner
			
				opcion = sc.nextLine();
			

         // ciclo Switch para manejar las opciones
			
			switch (opcion){
				
			case "1" :{
				
				// conecta con el metodo alta neumaticos
				data1.altaneumaticos();
					
				

				
				break;
			}
			case "2" :{
				// conecta con el metodo  caducidadMarca
				
				data1.caducidadMarca();
				break;
			}
			case "3":{
				// conecta con el metodo infoneumatico
				data1.infoneumatico();
				break;
			}
			
			case "4":{
				// conecta con el metodo durezaneumatico
				data1.durezaneumatico();
				break;
			}
			case "5":{
				
				// se sale del programa
				System.out.println(" Hasta Pronto");
				
				;
				break;
				
				
			}default:{
				// recoge cualquier opcion no valida
				System.out.println("Eleccion erronea");
				break;
				
			}
				
				
				
				
				
			}
			
	
			
			
			
		}
		
		
		
	
         sc.close();// cierre de Scanner
	}

}
