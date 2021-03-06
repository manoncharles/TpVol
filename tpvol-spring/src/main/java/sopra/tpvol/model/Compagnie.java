package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Compagnie {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int Version;
	@Column(nullable = false)
	private String nom;
	@OneToMany(mappedBy = "compagnie")
	private List<Vol> vols = new ArrayList<Vol>();

	public Compagnie() {
		super();
	}

	public Compagnie(String nom) {
		super();
		this.nom = nom;
	}

	public Compagnie(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
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

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
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



	@Override
	public String toString() {
		return "Compagnie [nom=" + nom + "]";
	}

}
