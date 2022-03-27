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

	//1- Atributo est�tico que armazena a �nica inst�ncia
		private static ConnectionManager manager;
		
		//Atributo que armazena as informa��es de um arquivo Properties
		private static Properties prop;
		
		//2- Construtor privado
		private ConnectionManager() {}
		
		//3- M�todo est�tico que retorna a �nica inst�ncia
		public static ConnectionManager getInstance() throws FileNotFoundException, IOException {
			if (manager == null) {
				manager = new ConnectionManager();
				//Ler o arquivo de propriedades
				prop = new Properties();
				prop.load(new FileInputStream("Global.properties"));
			}
			return manager;
		}
		
		//M�todo que retorna a conex�o
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection conexao =  DriverManager.getConnection(prop.getProperty("url"),
								prop.getProperty("usuario"), prop.getProperty("senha"));
			return conexao;
		}
}
