package sopra.tpvol;

import java.util.Date;

public class Depart {
	private Date dateDepart;
	private Aeroport Aeroport;

	public Depart() {
		super();
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Aeroport getAeroport() {
		return Aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		Aeroport = aeroport;
	}

	@Override
	public String toString() {
		return "Depart [dateDepart=" + dateDepart + ", Aeroport=" + Aeroport + "]";
	}

}
