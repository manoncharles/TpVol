package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Aeroport;
import sopra.tpvol.persistence.IAeroportDao;

@Repository
@Transactional
public class AeroportDao implements IAeroportDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly = true)
	public List<Aeroport> findAll() {

		TypedQuery<Aeroport> query = em.createQuery("from Aeroport", Aeroport.class);

		List<Aeroport> aeroports = query.getResultList();

		return aeroports;
	}

	@Override
	@Transactional(readOnly = true)
	public Aeroport find(Long id) {

		Aeroport aeroport = em.find(Aeroport.class, id);

		return aeroport;
	}

	@Override
	public Aeroport save(Aeroport obj) {

		Aeroport aeroport = em.merge(obj);

		return aeroport;
	}

	@Override
	public void delete(Aeroport obj) {

		em.remove(em.merge(obj));
	}
}
