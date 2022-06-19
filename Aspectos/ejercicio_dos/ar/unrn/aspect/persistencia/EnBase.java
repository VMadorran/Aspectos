package ar.unrn.aspect.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.aspect.modelo.Persistencia;

public class EnBase implements Persistencia {
	private int idPersona;
	private String DRIVER = "com.mysql.jdbc.Driver";
	private static String URL_DB = "jdbc:mysql://localhost:3306/";
	protected static String DB = "aspectos";
	protected static String user = "root";
	protected static String pass = "";
	protected static Connection conn;

	public Connection connect() {

		try {
			conn = DriverManager.getConnection(URL_DB + DB + "?useSSL=false", user, pass);
		} catch (SQLException sqlEx) {
			System.out.println("No se ha podido conectar a " + URL_DB + DB + ". " + sqlEx.getMessage());
			System.out.println("Error al cargar el driver");
		}
		return conn;
	}

	private void disconnect() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void registrar(String dato) {
		// TODO Auto-generated method stub

		this.connect();
		try {
			PreparedStatement statement = conn.prepareStatement("INSERT INTO persona(datos) " + "VALUES (?)");
			statement.setString(1, dato);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.disconnect();

		}

	}

}
