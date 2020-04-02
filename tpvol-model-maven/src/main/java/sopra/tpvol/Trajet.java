package sopra.tpvol;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity // obligatoire
@Table 
public class Trajet {
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	//@OneToOne(mappedBy = "trajet")
	private Reservation reservation;
	//@ManyToMany(mappedBy = "trajets")
	private ArrayList<Vol> vols = new ArrayList<Vol>();
	@Version
	private int version;

	public Trajet() {
		super();
	}

	public Trajet(Reservation reservation) {
		super();
		this.reservation = reservation;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public ArrayList<Vol> getVols() {
		return vols;
	}

	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}

	public void addVol(Vol vols) {
		this.vols.add(vols);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Trajet [reservation=" + reservation + ", vols=" + vols + "]";
	}

}
