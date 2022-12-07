/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointerfaces;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author JorgeDiazDelgado
 */
public class Conexion {
    
    	public static Connection getConexion() throws ClassNotFoundException, SQLException {
		
		
		String db_= "Agenda";
		String url_ = "jdbc:sqlserver://localhost:1433;database=Agenda;encrypt=false;user=sa;password=12345Ab##;";
		Connection connection_ = null;

		try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connection_ = (Connection) DriverManager.getConnection(url_);
		System.out.println("Conectado a la " + db_ );
		//connection_.close();

		}catch(SQLException e) {
		e.printStackTrace();
		}catch(ClassNotFoundException e) {
		e.printStackTrace();
		}catch(Exception e) {
		e.printStackTrace();
		}
		
		return connection_;
	}
    
    
    
    
}
