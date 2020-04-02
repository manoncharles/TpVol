package sopra.tpvol;

import java.util.ArrayList;

public class Aeroport {
	private String nom;
	private ArrayList<Depart> departs = new ArrayList<Depart>();
	private ArrayList<Arrivee> arrivees = new ArrayList<Arrivee>();
	private ArrayList<Ville> villes = new ArrayList<Ville>();

	public Aeroport() {
		super();
	}

	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Depart> getDeparts() {
		return departs;
	}

	public void setDeparts(ArrayList<Depart> departs) {
		this.departs = departs;
	}

	public void addDepart(Depart departs) {
		this.departs.add(departs);

	}

	public ArrayList<Arrivee> getArrivees() {
		return arrivees;
	}

	public void setArrivees(ArrayList<Arrivee> arrivees) {
		this.arrivees = arrivees;
	}

	public void addArrivee(Arrivee arrivees) {
		this.arrivees.add(arrivees);
	}

	public ArrayList<Ville> getVilles() {
		return villes;
	}

	public void setVilles(ArrayList<Ville> villes) {
		this.villes = villes;
	}

	public void addVille(Ville villes) {
		this.villes.add(villes);
	}

	@Override
	public String toString() {
		return "Aeroport [nom=" + nom + ", villes=" + villes + "]";
	}

	

}
