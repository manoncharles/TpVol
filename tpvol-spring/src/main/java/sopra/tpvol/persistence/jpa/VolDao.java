package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Vol;
import sopra.tpvol.persistence.IVolDao;

@Repository
@Transactional
public class VolDao implements IVolDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional(readOnly = true)
	public List<Vol> findAll() {

			TypedQuery<Vol> query = em.createQuery("from Vol", Vol.class);

		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Vol find(Long id) {
	
		return em.find(Vol.class, id);
	}

	@Override
	public Vol save(Vol obj) {

		return em.merge(obj);
	}

	@Override
	public void delete(Vol obj) {

			em.remove(em.merge(obj));

	}
}
