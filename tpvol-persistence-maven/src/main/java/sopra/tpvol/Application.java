package sopra.tpvol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.tpvol.persistence.IAeroportDao;
import sopra.tpvol.persistence.IArriveeDao;
import sopra.tpvol.persistence.IAvionDao;
import sopra.tpvol.persistence.IClientDao;
import sopra.tpvol.persistence.ICompagnieDao;
import sopra.tpvol.persistence.IDepartDao;
import sopra.tpvol.persistence.IPaiementDao;
import sopra.tpvol.persistence.IPassagerDao;
import sopra.tpvol.persistence.IReservationDao;
import sopra.tpvol.persistence.ITrajetDao;
import sopra.tpvol.persistence.IVolDao;
import sopra.tpvol.persistence.jpa.AeroportDao;
import sopra.tpvol.persistence.jpa.ArriveeDao;
import sopra.tpvol.persistence.jpa.AvionDao;
import sopra.tpvol.persistence.jpa.ClientDao;
import sopra.tpvol.persistence.jpa.CompagnieDao;
import sopra.tpvol.persistence.jpa.DepartDao;
import sopra.tpvol.persistence.jpa.PaiementDao;
import sopra.tpvol.persistence.jpa.PassagerDao;
import sopra.tpvol.persistence.jpa.ReservationDao;
import sopra.tpvol.persistence.jpa.TrajetDao;
import sopra.tpvol.persistence.jpa.VolDao;

public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpvol");

	private final IArriveeDao arriveeDao = new ArriveeDao();
	private final IDepartDao departDao = new DepartDao();
	private final IPaiementDao paiementDao = new PaiementDao();
	private final IAeroportDao aeroportDao = new AeroportDao();
	private final IClientDao clientDao = new ClientDao();
	private final ICompagnieDao compagnieDao = new CompagnieDao();
	private final IVolDao volDao = new VolDao();
	private final ITrajetDao trajetDao = new TrajetDao();
	private final IAvionDao avionDao = new AvionDao();
	private final IReservationDao reservationDao = new ReservationDao();
	private final IPassagerDao passagerDao = new PassagerDao();
//	private final IParticulierDao particulierDao = new ParticulierDao();
//	private final ISocieteDao societeDao = new SocieteDao();
//	private final IUtilisateurDao utilisateurDao = new UtilisateurDao();
//	private final IVilleDao villeDao = new VilleDao();

	private Application() {
//		try {
//			Class.forName("org.postgresql.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}
		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IArriveeDao getArriveeDao() {
		return arriveeDao;
	}

	public IDepartDao getDepartDao() {
		return departDao;
	}

	public IPaiementDao getPaiementDao() {
		return paiementDao;
	}

}
