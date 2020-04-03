package sopra.tpvol.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("particulier")
public class Particulier extends Client {
	
	private String prenom;

	public Particulier() {
		super();
	}
	
	
	
	
	public Particulier(String nom, String mail, String telephone, String prenom) {
		super(nom, mail, telephone);
		this.prenom = prenom;
	}




	public Particulier(String prenom) {
		super();
		this.prenom = prenom;
	}



	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	@Override
	public String toString() {
		return "Particulier [prenom=" + prenom + ", toString()=" + super.toString() + "]";
	}



}
