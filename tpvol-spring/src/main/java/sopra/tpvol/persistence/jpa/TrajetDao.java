package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Trajet;
import sopra.tpvol.persistence.ITrajetDao;

@Repository
@Transactional
public class TrajetDao implements ITrajetDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional(readOnly = true)
	public List<Trajet> findAll() {


			TypedQuery<Trajet> query = em.createQuery("from Trajet", Trajet.class);


		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Trajet find(Long id) {

		return em.find(Trajet.class, id);
	}

	@Override
	public Trajet save(Trajet obj) {

		return em.merge(obj);
	}
	
	@Override
	public void delete(Trajet obj) {
	
			em.remove(em.merge(obj));
		
	}

}
