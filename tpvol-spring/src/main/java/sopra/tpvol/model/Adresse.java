package sopra.tpvol.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	private String rue;
	private String complement;
	private String codePostal;
	private String ville;
	private String pays;

	public Adresse() {
		super();
	}



	public Adresse(String rue, String complement, String codePostal, String ville, String pays) {
		super();
		this.rue = rue;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}



	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	
	
	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", complement=" + complement + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", pays=" + pays + "]";
	}



	
}
