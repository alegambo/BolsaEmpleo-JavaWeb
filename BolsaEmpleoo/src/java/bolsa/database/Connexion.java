package bolsa.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
	private static Connection con = null;
	public static Connection getConnection(){
		if(con != null){
			return con;
		}
		else {
			try {
                            String classname = "com.mysql.jdbc.Driver";
			   Class.forName(classname);
                           String hostname = "localhost";
                           String port = "3306";
                           String database = "mydb";
		    	    //String dbURL = "jdbc:sqlite::resource:res/communUrbaine1.sqlite";
		            String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
                            String username = "root";
                            String password = "root";
                            
		            

                    con = DriverManager.getConnection(url,username,password);
		            System.out.println("Connexion effective !");
				
			} catch (ClassNotFoundException cne) {
				System.out.println("***Driver***");
				cne.printStackTrace();
			} catch (SQLException e) {
				System.out.println("***SQLException***");
				System.out.println(e);
			}
			return con;
		}
	}
     
      
}

/*private String username = "root";
    private String password = "root";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "mydb";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
    private Connection con;

    public Conexion() {
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(SQLException esql){
             System.err.println(esql.getMessage());
        }
    }
    
    public Connection getConnection(){
        return con;
    }*/
