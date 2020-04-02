package TpVolEntrainement;

import java.util.ArrayList;

public class Vol {
	private String numeroDeVol;
	private Boolean ouvert;
	private Compagnie compagnie;
	private Avion avion;
	private Depart depart;
	private Arrivee arrivee;
	private ArrayList<Trajet> trajets = new ArrayList<Trajet>();

	public Vol() {
		super();
	}

	public String getNumeroDeVol() {
		return numeroDeVol;
	}

	public void setNumeroDeVol(String numeroDeVol) {
		this.numeroDeVol = numeroDeVol;
	}

	public Boolean getOuvert() {
		return ouvert;
	}

	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Depart getDepart() {
		return depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	public Arrivee getArrivee() {
		return arrivee;
	}

	public void setArrivee(Arrivee arrivee) {
		this.arrivee = arrivee;
	}

	public ArrayList<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(ArrayList<Trajet> trajets) {
		this.trajets = trajets;
	}

	public void addTrajet(Trajet trajets) {
		this.trajets.add(trajets);
	}

	@Override
	public String toString() {
		return "Vol [numeroDeVol=" + numeroDeVol + ", ouvert=" + ouvert + ", compagnie=" + compagnie + ", avion="
				+ avion + ", depart=" + depart + ", arrivee=" + arrivee + "]";
	}

}
