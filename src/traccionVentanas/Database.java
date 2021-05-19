package traccionVentanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Database {
	
	
	
	
	 
	 
	 public Database() {
		
		 
		 
	 }
	 
	 
	 public static Connection abrirConexion() throws ClassNotFoundException, SQLException {
		 
		 
		 String driver = "com.mysql.cj.jdbc.Driver";
		 String database = "neumaticospista";
		 String hostname = "localhost";
		 String port = "3306";
		 String url = "jdbc:mysql://"+hostname+":"+ port +"/"+database+"?useSSL= false";
		 String root = "root";
		 String password ="8009";
		 
		 
			Class.forName(driver);
		
			Connection conn = DriverManager.getConnection(url,root,password);
			JOptionPane.showMessageDialog(null,"Conexion Realizada a la Base de Datos");
		
				
				
			
			
			return conn ;
					
			
			

            
	 }public static void cerrarConexion(Connection conn) throws SQLException {
		 
		 
		 conn.close();
		 
	 }
	
	
	
	
	 

//	    private static Database instancia;
//	    private Connection conn;
//	    private String url = "jdbc:postgresql://localhost:5432/jdbc";
//	    private String username = "root";
//	    private String password = "localhost";
//
//	    private Database() throws SQLException {
//	        try {
//	            Class.forName("org.postgresql.Driver");
//	            this.conn = DriverManager.getConnection(url, username, password);
//	        } catch (ClassNotFoundException ex) {
//	            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
//	        }
//	    }
//
//	    public Connection getConn() {
//	        return conn;
//	    }
//
//	    public static  Database getInstance() throws SQLException {
//	        if (instancia == null) {
//	            instancia = new Database();
//	        } else if (instancia.getConn().isClosed()) {
//	            instancia = new Database();
//	        }
//
//	        return instancia;
//	    }
//     }
//
//
//	class MyProgram {
//
//	    public static void main(String args[]){
//
//
//	        Connection myConnection = Database.getInstance().getConn();
//	       
//	    }
//	
	
	
	
	
	
	
	
 
	
	
		
		
		
		
		
		
	}
