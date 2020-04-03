package sopra.formation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

<<<<<<< Updated upstream
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
=======
import sopra.tpvol.persistence.IVolDao;
import sopra.tpvol.persistence.jpa.VolDao;
>>>>>>> Stashed changes

import sopra.tpvol.Application;
import sopra.tpvol.persistence.IClientDao;
import sopra.tpvol.persistence.jpa.ClientDao;

<<<<<<< Updated upstream
=======
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("sopra-formation");
	private final IVolDao volDao = new VolDao();
	private final IFiliereDao filiereDao = new FiliereDaoJpa();
	private final IFormateurDao formateurDao = new FormateurDaoJpa();
	private final IMatiereDao matiereDao = new MatiereDaoJpa();
	private final ISalleDao salleDao = new SalleDaoJpa();
	private final IStagiaireDao stagiaireDao = new StagiaireDaoJpa();
	private final IUEDao ueDao = new UEDaoJpa();

	private Application() {
	}
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
=======
	}

	public IEvaluationDao getEvaluationDao() {
		return evaluationDao;
	}

	public IFiliereDao getFiliereDao() {
		return filiereDao;
	}

	public IFormateurDao getFormateurDao() {
		return formateurDao;
	}

	public IMatiereDao getMatiereDao() {
		return matiereDao;
	}

	public ISalleDao getSalleDao() {
		return salleDao;
	}

	public IStagiaireDao getStagiaireDao() {
		return stagiaireDao;
>>>>>>> Stashed changes
	}

	public IClientDao getClientDao() {
		return clientDao;
	}
	
	

}