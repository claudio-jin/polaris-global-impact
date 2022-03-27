package br.com.fiap.tds.singleton;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author claudio jin
 *
 */

public class ConnectionManager {

	//1- Atributo estático que armazena a única instância
		private static ConnectionManager manager;
		
		//Atributo que armazena as informações de um arquivo Properties
		private static Properties prop;
		
		//2- Construtor privado
		private ConnectionManager() {}
		
		//3- Método estático que retorna a única instância
		public static ConnectionManager getInstance() throws FileNotFoundException, IOException {
			if (manager == null) {
				manager = new ConnectionManager();
				//Ler o arquivo de propriedades
				prop = new Properties();
				prop.load(new FileInputStream("Global.properties"));
			}
			return manager;
		}
		
		//Método que retorna a conexão
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection conexao =  DriverManager.getConnection(prop.getProperty("url"),
								prop.getProperty("usuario"), prop.getProperty("senha"));
			return conexao;
		}
}
