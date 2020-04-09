package sopra.tpvol.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Arrivee {
	@Id
	@GeneratedValue
	private Long id;
	private int Version;
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateArrivee;
	@ManyToOne
	@JoinColumn(name = "aeroport_id")
	private Aeroport aeroport;

	public Arrivee() {
		super();
	}

	public Arrivee(Date dateArrivee) {
		super();
		this.dateArrivee = dateArrivee;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	@Override
	public String toString() {
		return "Arrivee [dateArrivee=" + dateArrivee + ", aeroport=" + aeroport + "]";
	}

}
