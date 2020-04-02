package TpVolEntrainement;

public class Particulier extends Client {
	private String prenom;

	public Particulier() {
		super();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Particulier [prenom=" + prenom + "]";
	}

}
