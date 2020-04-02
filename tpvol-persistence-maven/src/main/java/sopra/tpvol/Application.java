package sopra.tpvol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import sopra.formation.persistence.IEvaluationDao;
import sopra.formation.persistence.IFiliereDao;
import sopra.formation.persistence.IFormateurDao;
import sopra.formation.persistence.IMatiereDao;
import sopra.formation.persistence.ISalleDao;
import sopra.formation.persistence.IStagiaireDao;
import sopra.formation.persistence.IUEDao;
import sopra.formation.persistence.sql.EvaluationDaoSql;
import sopra.formation.persistence.sql.FiliereDaoSql;
import sopra.formation.persistence.sql.FormateurDaoSql;
import sopra.formation.persistence.sql.MatiereDaoSql;
import sopra.formation.persistence.sql.SalleDaoSql;
import sopra.formation.persistence.sql.StagiaireDaoSql;
import sopra.formation.persistence.sql.UEDaoSql;

public class Application {
	private static Application instance = null;

	private final IEvaluationDao evaluationDao = new EvaluationDaoSql();
	private final IFiliereDao filiereDao = new FiliereDaoSql();
	private final IFormateurDao formateurDao = new FormateurDaoSql();
	private final IMatiereDao matiereDao = new MatiereDaoSql();
	private final ISalleDao salleDao = new SalleDaoSql();
	private final IStagiaireDao stagiaireDao = new StagiaireDaoSql();
	private final IUEDao ueDao = new UEDaoSql();

	private Application() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:postgresql://localhost/formation", "postgres", "manager");
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
	}

	public IUEDao getUeDao() {
		return ueDao;
	}

}
