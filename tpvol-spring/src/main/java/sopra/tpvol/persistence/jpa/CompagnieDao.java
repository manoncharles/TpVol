package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Compagnie;
import sopra.tpvol.persistence.ICompagnieDao;

@Repository
@Transactional
public class CompagnieDao implements ICompagnieDao{

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional(readOnly = true)
	public List<Compagnie> findAll() {


			TypedQuery<Compagnie> query = em.createQuery("from Compagnie", Compagnie.class);

		
		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Compagnie find(Long id) {
	
		return em.find(Compagnie.class, id);
	}

	@Override
	public Compagnie save(Compagnie obj) {
	
		return  em.merge(obj);
	}
	
	@Override
	public void delete(Compagnie obj) {
		
			em.remove(em.merge(obj));
	
	}

}
