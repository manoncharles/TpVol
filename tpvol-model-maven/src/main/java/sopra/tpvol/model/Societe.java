package sopra.tpvol.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
@DiscriminatorValue("societe")
public class Societe extends Client {
	@NotEmpty
	private String siret;
	private String numeroDeTva;

	public Societe() {
		super();
	}

	
	
	public Societe(String siret) {
		super();
		this.siret = siret;
	}



	public Societe(String nom, String mail, String telephone, String Siret) {
		super(nom, mail, telephone);
		this.siret = siret;
	}



	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNumeroDeTva() {
		return numeroDeTva;
	}

	public void setNumeroDeTva(String numeroDeTva) {
		this.numeroDeTva = numeroDeTva;
	}



	@Override
	public String toString() {
		return "Societe [siret=" + siret + ", numeroDeTva=" + numeroDeTva + ", toString()=" + super.toString() + "]";
	}



}
