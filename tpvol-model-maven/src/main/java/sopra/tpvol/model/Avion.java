package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Avion {
	@Id
	@GeneratedValue
	private Long id;
	private int Version;
	@Column(length = 100)
	private String modele;
	@OneToMany(mappedBy = "avion")
	private List<Vol> vols = new ArrayList<Vol>();

	public Avion() {
		super();
	}

	public Avion(String modele) {
		super();
		this.modele = modele;
	}

	public Avion(Long id, String modele) {
		super();
		this.id = id;
		this.modele = modele;
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

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getAvion() {
		return modele;
	}

	public void setAvion(String avion) {
		this.modele = avion;
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

	@Override
	public String toString() {
		return "Avion [modele=" + modele + ", vols=" + vols + "]";
	}

}
