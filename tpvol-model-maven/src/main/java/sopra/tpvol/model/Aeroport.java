package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Aeroport {
	@Id
	@GeneratedValue
	private Long id;
	private int Version;
	@Column(nullable = false, length = 100)
	private String nom;
	@OneToMany(mappedBy = "aeroport")
	private List<Depart> departs = new ArrayList<Depart>();
	@OneToMany(mappedBy = "aeroport")
	private List<Arrivee> arrivees = new ArrayList<Arrivee>();
	@ManyToMany
	@JoinColumn(name = "ville_id")
	private List<Ville> villes = new ArrayList<Ville>();

	public Aeroport() {
		super();
	}

	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}

	public Aeroport(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Depart> getDeparts() {
		return departs;
	}

	public void setDeparts(List<Depart> departs) {
		this.departs = departs;
	}

	public void addDepart(Depart departs) {
		this.departs.add(departs);

	}

	public List<Arrivee> getArrivees() {
		return arrivees;
	}

	public void setArrivees(List<Arrivee> arrivees) {
		this.arrivees = arrivees;
	}

	public void addArrivee(Arrivee arrivees) {
		this.arrivees.add(arrivees);
	}

	public List<Ville> getVilles() {
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
