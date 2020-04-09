package sopra.tpvol.persistence.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sopra.tpvol.model.Particulier;
import sopra.tpvol.persistence.IParticulierDao;

@Repository
@Transactional
public class ParticulierDao implements IParticulierDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional(readOnly = true)
	public List<Particulier> findAll() {


			TypedQuery<Particulier> query = em.createQuery("from Client where disc = 'Particulier'", Particulier.class);


		return query.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Particulier find(Long id) {

		return em.find(Particulier.class, id);
	}

	@Override
	public Particulier save(Particulier obj) {

		return em.merge(obj);
	}

	@Override
	public void delete(Particulier obj) {

			em.remove(em.merge(obj));

	}

}
