package sopra.tpvol.model;

public enum Civilite {

	M("Monsieur"), MME("Madame"), AUTRE("Autre genre");

	private final String label;

	private Civilite(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
