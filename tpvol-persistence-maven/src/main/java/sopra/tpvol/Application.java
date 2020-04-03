package sopra.tpvol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.tpvol.Application;
import sopra.tpvol.persistence.IClientDao;
import sopra.tpvol.persistence.jpa.ClientDao;


public class Application {
	
	private static Application instance = null; 
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpvol");
	
	private final IClientDao clientDao = new ClientDao();
	
	
	
	
	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IClientDao getClientDao() {
		return clientDao;
	}
	
	

}
