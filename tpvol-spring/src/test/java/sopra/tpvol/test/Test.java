package sopra.tpvol.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import sopra.tpvol.Application;
import sopra.tpvol.model.Adresse;
import sopra.tpvol.model.Aeroport;
import sopra.tpvol.model.Avion;
import sopra.tpvol.model.Civilite;
import sopra.tpvol.model.Compagnie;
import sopra.tpvol.model.Paiement;
import sopra.tpvol.model.Particulier;
import sopra.tpvol.model.Passager;
import sopra.tpvol.model.Reservation;
import sopra.tpvol.model.Societe;
import sopra.tpvol.model.Trajet;
import sopra.tpvol.model.TypeID;
import sopra.tpvol.model.TypePaiement;
import sopra.tpvol.model.Utilisateur;
import sopra.tpvol.model.Ville;
import sopra.tpvol.model.Vol;
import sopra.tpvol.persistence.IAeroportDao;
import sopra.tpvol.persistence.IArriveeDao;
import sopra.tpvol.persistence.IAvionDao;
import sopra.tpvol.persistence.ICompagnieDao;
import sopra.tpvol.persistence.IDepartDao;
import sopra.tpvol.persistence.IPaiementDao;
import sopra.tpvol.persistence.IParticulierDao;
import sopra.tpvol.persistence.IPassagerDao;
import sopra.tpvol.persistence.IReservationDao;
import sopra.tpvol.persistence.ISocieteDao;
import sopra.tpvol.persistence.ITrajetDao;
import sopra.tpvol.persistence.IUtilisateurDao;
import sopra.tpvol.persistence.IVilleDao;
import sopra.tpvol.persistence.IVolDao;

public class Test {

	public static void main(String[] args) {

		IAeroportDao aeroportDao = Application.getInstance().getAeroportDao();

		IArriveeDao arriveeDao = Application.getInstance().getArriveeDao();

		IAvionDao avionDao = Application.getInstance().getAvionDao();

		ICompagnieDao compagnieDao = Application.getInstance().getCompagnieDao();

		IDepartDao departDao = Application.getInstance().getDepartDao();

		IPaiementDao paiementDao = Application.getInstance().getPaiementDao();

		IParticulierDao particulierDao = Application.getInstance().getParticulierDao();

		IPassagerDao passagerDao = Application.getInstance().getPassagerDao();

		IReservationDao reservationDao = Application.getInstance().getReservationDao();

		ISocieteDao societeDao = Application.getInstance().getSocieteDao();

		ITrajetDao trajetDao = Application.getInstance().getTrajetDao();

		IUtilisateurDao utilisateurDao = Application.getInstance().getUtilisateurDao();

		IVilleDao villeDao = Application.getInstance().getVilleDao();

		IVolDao volDao = Application.getInstance().getVolDao();

//		System.out.println("___");
//		Paiement p2 = new Paiement();
//		p2.setMontant(699.99f);
//		p2.setTypePaiement(TypePaiement.VIREMENT);
//
//		p2 = Application.getInstance().getPaiementDao().save(p2); // managed
//		
//		System.out.println("___");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Utilisateur uti1 = new Utilisateur();
		uti1.setIdentifiant("id Manon");
		uti1.setMotDePasse("mdpmanon");

		uti1 = utilisateurDao.save(uti1);

		Particulier particulier1 = new Particulier("Manon");
		particulier1.setType("particulier");
		particulier1.setNom("Charles");
		particulier1.setMail("charles.manon@yahoo.com");
		particulier1.setTelephone("00.11.22.33.44");
		
		System.out.println(particulier1);
		
		Adresse adrP1 = new Adresse("21 avenue col Pierre Bourgoin", "résidence M.C", "33127", "Martignas", "France");

		particulier1.setAdresse(adrP1);
		
		particulier1 = particulierDao.save(particulier1);
		

		particulier1.setUtilisateur(uti1);

		particulier1 = particulierDao.save(particulier1);

		System.out.println(particulier1);

		Utilisateur uti2 = new Utilisateur();
		uti2.setIdentifiant("id Sopra");
		uti2.setMotDePasse("mdp Sopra");

		uti2 = utilisateurDao.save(uti2);

		Societe societe1 = new Societe("SIRET123");
		societe1.setType("société");
		societe1.setNom("SOPRA STERIA");
		societe1.setMail("mail@sopra-steria.com");
		societe1.setTelephone("00.44.33.22.11");
		societe1.setNumeroDeTva("SS123456TVA");

		Adresse adrS1 = new Adresse("20 avenue Pythagore", " ", "33700", "Mérignac", "France");

		societe1.setAdresse(adrS1);
		
		societe1 = societeDao.save(societe1);

		societe1.setUtilisateur(uti2);

		societe1 = societeDao.save(societe1);

		System.out.println(societe1);

		uti2.setClient(societe1);

		uti2 = utilisateurDao.save(uti2);

		System.out.println(uti2);

		Passager pass1 = new Passager("CHARLES");
		pass1.setPrenom("Manon");
		pass1.setDateDeNaissance(new Date());
		pass1.setNationalite("Française");
		pass1.setCivilite(Civilite.MME);
		pass1.setNumeroID("AZ1234567");
		pass1.setDateValiditeID(new Date());
		pass1.setTypeID(TypeID.PASSEPORT);
		pass1.setHandicap(false);
		pass1.setClient(particulier1);

		pass1 = passagerDao.save(pass1);
		System.out.println(pass1);

		Passager pass2 = new Passager("SULTAN");
		pass2.setPrenom("Eric");
		pass2.setDateDeNaissance(new Date());
		pass2.setNationalite("Française");
		pass2.setCivilite(Civilite.M);
		pass2.setNumeroID("AZ2345678");
		pass2.setDateValiditeID(new Date());
		pass2.setTypeID(TypeID.PASSEPORT);
		pass2.setHandicap(false);
		pass2.setClient(societe1);

		pass2 = passagerDao.save(pass2);
		System.out.println(pass2);

		Paiement p1 = new Paiement();
		p1.setMontant(249.99f);
		p1.setTypePaiement(TypePaiement.CB);

		p1 = paiementDao.save(p1);
		System.out.println(p1);

		Reservation resa1 = new Reservation();
		resa1.setNumeroDeReservation("AZ123");
		resa1.setOuverte(true);
		resa1.setConfirmee(true);
		resa1.setAnnulee(false);
		resa1.setPassager(pass1);
		resa1.setPaiement(p1);
		resa1.setClient(particulier1);

		resa1 = reservationDao.save(resa1);
		System.out.println(resa1);

		Paiement p2 = new Paiement();
		p2.setMontant(699.99f);
		p2.setTypePaiement(TypePaiement.VIREMENT);

		p2 = paiementDao.save(p2);
		System.out.println(p2);

		Reservation resa2 = new Reservation();
		resa2.setNumeroDeReservation("AZ456");
		resa2.setOuverte(true);
		resa2.setConfirmee(true);
		resa2.setAnnulee(false);
		resa2.setPassager(pass2);
		resa2.setPaiement(p2);
		resa2.setClient(societe1);

		resa2 = reservationDao.save(resa2);
		System.out.println(resa2);

// Partie Vol et trajet
		Compagnie comp1 = new Compagnie("Air France");
		comp1 = compagnieDao.save(comp1); 
		System.out.println(comp1);

		Compagnie comp2 = new Compagnie("Air Austral");
		comp2 = compagnieDao.save(comp2); 
		System.out.println(comp2);

		Avion a380 = new Avion("Airbus 380");
		a380 = avionDao.save(a380); 
		System.out.println(comp1);

		Avion b747 = new Avion("Boeing 747");
		b747 = avionDao.save(b747); 
		System.out.println(comp1);

		Ville paris = new Ville("Paris");
		paris.setPays("France");
		paris = villeDao.save(paris); 
		System.out.println(paris);
		
		Ville saintDenis = new Ville("Saint-Denis");
		saintDenis.setPays("Réunion");
		saintDenis = villeDao.save(saintDenis); 
		System.out.println(paris);
		
		Ville mamoudzou = new Ville("Mamoudzou");
		mamoudzou.setPays("Mayotte");
		mamoudzou = villeDao.save(mamoudzou); 
		System.out.println(mamoudzou);

		Aeroport roissy = new Aeroport("Roissy Charles de Gaulle");
		paris.addAeroport(roissy);
		roissy = aeroportDao.save(roissy);
		
		roissy.addVille(paris);
		roissy = aeroportDao.save(roissy); 
		System.out.println(paris);
		

		Aeroport roland = new Aeroport("Roland Garros");
		saintDenis.addAeroport(roland);
		roland = aeroportDao.save(roland);
		
		roland.addVille(saintDenis);
		roland = aeroportDao.save(roland);
		System.out.println(roland);

		Aeroport dzaoudzi = new Aeroport("Mamoudzou-Pamandzi");
		mamoudzou.addAeroport(dzaoudzi);
		dzaoudzi = aeroportDao.save(dzaoudzi);
		
		dzaoudzi.addVille(mamoudzou);
		dzaoudzi = aeroportDao.save(dzaoudzi);

// Paris-Mayotte en vol direct 		
		Trajet direct = new Trajet();

		Vol parisMamoudzou = new Vol();
		parisMamoudzou.setNumeroDeVol("AZ 123");
		parisMamoudzou.setCompagnie(comp1);
		parisMamoudzou.setOuvert(true);
		parisMamoudzou.setAvion(a380);
		
		parisMamoudzou = volDao.save(parisMamoudzou);

	}

}
