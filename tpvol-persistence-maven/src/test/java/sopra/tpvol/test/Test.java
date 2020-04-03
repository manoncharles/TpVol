package sopra.tpvol.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import sopra.tpvol.Application;
import sopra.tpvol.model.Paiement;
import sopra.tpvol.model.TypePaiement;

public class Test {

	public static void main(String[] args) {
		
		
		Paiement p2 = new Paiement();
		p2.setMontant(699.99f);
		p2.setTypePaiement(TypePaiement.VIREMENT);
		
		p2 = Application.getInstance().getPaiementDao().save(p2); // managed
	}
}
