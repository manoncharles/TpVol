package sopra.tpvol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity // obligatoire
public class Utilisateur {
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	@Version
	private int version;
	@Column(nullable = false)
	private String identifiant;
	@Column(nullable = false)
	private String motDePasse;
	@OneToOne(mappedBy = "utilisateur")
	private Client client;

	public Utilisateur() {

		super();
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	
	

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Utilisateur [identifiant=" + identifiant + ", motDePasse=" + motDePasse + "]";
	}

	

}
