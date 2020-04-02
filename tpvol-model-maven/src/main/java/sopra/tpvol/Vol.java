package sopra.tpvol;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vol {
	@Id
	@GeneratedValue
	private Long id;
	private int Version;
	@Column(nullable = false, length = 100)
	private String numeroDeVol;
	@Column(nullable = false)
	private Boolean ouvert;
	@ManyToOne
	@JoinColumn(name = "compagnie_id")
	private Compagnie compagnie;
	@ManyToOne
	@JoinColumn(name = "avion_id")
	private Avion avion;
	@OneToOne
	@JoinColumn(name = "depart_id")
	private Depart depart;
	@OneToOne
	@JoinColumn(name = "arrivee_id")
	private Arrivee arrivee;
	@ManyToMany
	@JoinColumn(name = "trajet_id")
	private List<Trajet> trajets = new ArrayList<Trajet>();

	public Vol() {
		super();
	}

	public Vol(String numeroDeVol, Boolean ouvert) {
		super();
		this.numeroDeVol = numeroDeVol;
		this.ouvert = ouvert;
	}

	public Vol(Long id, String numeroDeVol, Boolean ouvert) {
		super();
		this.id = id;
		this.numeroDeVol = numeroDeVol;
		this.ouvert = ouvert;
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

	public List<Trajet> getTrajets() {
		return trajets;
	}

	public void setTrajets(List<Trajet> trajets) {
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
