package TpVolEntrainement;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
// Partie réservation et clients

		Utilisateur uti1 = new Utilisateur();
		uti1.setIdentifiant("identifiant1");
		uti1.setMotDePasse("mdp1");

		Utilisateur uti2 = new Utilisateur();
		uti2.setIdentifiant("identifiant2");
		uti2.setMotDePasse("mdp2");

		Particulier part1 = new Particulier();
		part1.setPrenom("Nicolas");

		Societe soc1 = new Societe();
		soc1.setSiret("80502074000173");
		soc1.setNumeroDeTva("FR 01234567891");

		Client client1 = new Client("CHARLES");
		client1.setType("Particulier");
		client1.setMail("mailparticulier@gmail.com");
		client1.setTelephone("00.11.22.33.44");
		client1.setNumeroAdresse(21);
		client1.setRue("avenue col Pierre Bourgoin");
		client1.setComplementAdresse("résidence M.C");
		client1.setCodePostal(33127);
		client1.setVille("Martignas");
		client1.setPays("France");
		client1.setUtilisateur(uti1);

		Client client2 = new Client("SOPRA STERIA");
		client2.setType("Société");
		client2.setMail("mailsociété@gmail.com");
		client2.setTelephone("00.11.22.33.44");
		client2.setNumeroAdresse(20);
		client2.setRue("avenue Pythagore");
		client2.setComplementAdresse(null);
		client2.setCodePostal(33700);
		client2.setVille("Mérignac");
		client2.setPays("France");
		client2.setUtilisateur(uti2);

		Passager pass1 = new Passager("CHARLES");
		pass1.setPrenom("Manon");
		pass1.setDateDeNaissance(new Date());
		pass1.setNationalite("Française");
		pass1.setSexe("Femme");
		pass1.setNumeroPasseport("AZ1234567");
		pass1.setDateValiditePasseport(new Date());
		pass1.setTypePieceIdentite("Carte d'identité");
		pass1.setHandicap(false);
		pass1.setClient(client1);

		Passager pass2 = new Passager("SULTAN");
		pass2.setPrenom("Eric");
		pass2.setDateDeNaissance(new Date());
		pass2.setNationalite("Française");
		pass2.setSexe("Homme");
		pass2.setNumeroPasseport("AZ2345678");
		pass2.setDateValiditePasseport(new Date());
		pass2.setTypePieceIdentite("Passeport");
		pass2.setHandicap(false);
		pass2.setClient(client2);

		Paiement p1 = new Paiement();
		p1.setMontant(249.99f);
		p1.setType("CB");

		Reservation resa1 = new Reservation();
		resa1.setNumeroDeReservation("AZ123");
		resa1.setOuverte(true);
		resa1.setConfirmee(true);
		resa1.setAnnulee(false);
		resa1.setPassager(pass1);
		resa1.setPaiement(p1);
		resa1.setClient(client1);

		System.out.println(resa1);

		Paiement p2 = new Paiement();
		p2.setMontant(699.99f);
		p2.setType("Virement");

		Reservation resa2 = new Reservation();
		resa2.setNumeroDeReservation("AZ456");
		resa2.setOuverte(true);
		resa2.setConfirmee(true);
		resa2.setAnnulee(false);
		resa2.setPassager(pass2);
		resa2.setPaiement(p2);
		resa2.setClient(client2);

		System.out.println(resa2);

// Partie Vol et trajet
		Compagnie comp1 = new Compagnie("Air France");
		Compagnie comp2 = new Compagnie("Air Austral");

		Avion a380 = new Avion("Airbus 380");
		Avion b747 = new Avion("Boeing 747");

		Ville paris = new Ville("Paris");
		paris.setPays("France");
		Ville saintDenis = new Ville("Saint-Denis");
		saintDenis.setPays("Réunion");
		Ville mamoudzou = new Ville("Mamoudzou");
		mamoudzou.setPays("Mayotte");

		Aeroport roissy = new Aeroport("Roissy Charles de Gaulle");
		paris.addAeroport(roissy);
		roissy.addVille(paris);

		Aeroport roland = new Aeroport("Roland Garros");
		saintDenis.addAeroport(roland);
		roland.addVille(saintDenis);

		Aeroport dzaoudzi = new Aeroport("Mamoudzou-Pamandzi");
		mamoudzou.addAeroport(dzaoudzi);
		dzaoudzi.addVille(mamoudzou);

// Paris-Mayotte en vol direct 		
		Trajet direct = new Trajet();

		Vol parisMamoudzou = new Vol();
		parisMamoudzou.setNumeroDeVol("AZ 123");
		parisMamoudzou.setCompagnie(comp1);
		parisMamoudzou.setOuvert(true);
		parisMamoudzou.setAvion(a380);
		
		Depart dep1 = new Depart();
		dep1.setDateDepart(new Date());
		dep1.setAeroport(roissy);
		roissy.addDepart(dep1);
		parisMamoudzou.setDepart(dep1);

		Arrivee arr1 = new Arrivee();
		arr1.setDateArrivee(new Date());
		arr1.setAeroport(dzaoudzi);
		dzaoudzi.addArrivee(arr1);
		parisMamoudzou.setArrivee(arr1);

		parisMamoudzou.addTrajet(direct);
		direct.addVol(parisMamoudzou);

		direct.setReservation(resa1);

		System.out.println(direct);

// Paris-Mayotte avec escale	
		Trajet escale = new Trajet();

		Vol parisSaintDenis = new Vol();
		parisSaintDenis.setNumeroDeVol("BB 456");
		parisSaintDenis.setCompagnie(comp1);
		parisSaintDenis.setOuvert(true);
		parisSaintDenis.setAvion(b747);

		dep1.setDateDepart(new Date());
		dep1.setAeroport(roissy);
		roissy.addDepart(dep1);
		parisSaintDenis.setDepart(dep1);

		arr1.setDateArrivee(new Date());
		arr1.setAeroport(roland);
		roland.addArrivee(arr1);
		parisSaintDenis.setArrivee(arr1);

		Vol saintDenisMamoudzou = new Vol();
		saintDenisMamoudzou.setNumeroDeVol("CC 789");
		saintDenisMamoudzou.setCompagnie(comp2);
		saintDenisMamoudzou.setOuvert(true);
		saintDenisMamoudzou.setAvion(a380);

		Depart dep2 = new Depart();
		dep2.setDateDepart(new Date());
		dep2.setAeroport(roland);
		roland.addDepart(dep2);
		saintDenisMamoudzou.setDepart(dep2);

		Arrivee arr2 = new Arrivee();
		arr2.setDateArrivee(new Date());
		arr2.setAeroport(dzaoudzi);
		dzaoudzi.addArrivee(arr2);
		saintDenisMamoudzou.setArrivee(arr2);

		parisSaintDenis.addTrajet(escale);
		escale.addVol(parisSaintDenis);
		saintDenisMamoudzou.addTrajet(escale);
		escale.addVol(saintDenisMamoudzou);

		escale.setReservation(resa2);

		System.out.println(escale);

	}

}
