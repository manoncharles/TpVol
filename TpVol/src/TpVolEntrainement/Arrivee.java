package TpVolEntrainement;

import java.util.Date;

public class Arrivee {
	private Date dateArrivee;
	private Aeroport Aeroport;

	public Arrivee() {
		super();
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Aeroport getAeroport() {
		return Aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		Aeroport = aeroport;
	}

	@Override
	public String toString() {
		return "Arrivee [dateArrivee=" + dateArrivee + ", Aeroport=" + Aeroport + "]";
	}

}
