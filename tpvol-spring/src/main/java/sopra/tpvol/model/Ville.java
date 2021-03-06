package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ville {
	@Id
	@GeneratedValue
	private Long id;
	private int Version;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String pays;
	@ManyToMany(mappedBy = "villes")
	private List<Aeroport> aeroports = new ArrayList<Aeroport>();

	public Ville() {
		super();
	}

	public Ville(String nom, String pays) {
		super();
		this.nom = nom;
		this.pays = pays;
	}

	public Ville(Long id, String nom, String pays) {
		super();
		this.id = id;
		this.nom = nom;
		this.pays = pays;
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

	public Ville(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}

	public void addAeroport(Aeroport aeroports) {
		this.aeroports.add(aeroports);

	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", pays=" + pays + "]";
	}

}
