package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Arrivee;
import sopra.tpvol.persistence.IArriveeDao;

@Repository
@Transactional
public class ArriveeDao implements IArriveeDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional(readOnly = true)
	public List<Arrivee> findAll() {

		TypedQuery<Arrivee> query = em.createQuery("from Arrivee", Arrivee.class);

		List<Arrivee> arrivees = query.getResultList();

		return arrivees;
	}

	@Override
	@Transactional(readOnly = true)
	public Arrivee find(Long id) {

		Arrivee arrivee = em.find(Arrivee.class, id);

		return arrivee;
	}

	@Override
	public Arrivee save(Arrivee obj) {

		Arrivee arrivee = em.merge(obj);

		return arrivee;
	}

	@Override
	public void delete(Arrivee obj) {

		em.remove(em.merge(obj));

	}
}
