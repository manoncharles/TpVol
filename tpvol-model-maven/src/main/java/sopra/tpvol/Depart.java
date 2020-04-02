package sopra.tpvol;

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
public class Depart {
	@Id
	@GeneratedValue
	private Long id;
	private int Version;
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDepart;
	@ManyToOne
	@JoinColumn(name = "aeroport_id")
	private Aeroport Aeroport;

	public Depart() {
		super();
	}

	public Depart(Date dateDepart) {
		super();
		this.dateDepart = dateDepart;
	}

	public Depart(Long id, Date dateDepart) {
		super();
		this.id = id;
		this.dateDepart = dateDepart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
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
