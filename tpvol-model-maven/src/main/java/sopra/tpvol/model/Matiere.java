package sopra.formation.model;

import java.util.ArrayList;

public class Matiere {
	private Long id;
	private String nom;
	private Integer duree;
	private ArrayList<UE> ues = new ArrayList<UE>();
	private ArrayList<Formateur> formateurs = new ArrayList<Formateur>();

	public Matiere() {
		super();
	}

	public Matiere(Long id, String nom, Integer duree) {
		super();
		this.id = id;
		this.nom = nom;
		this.duree = duree;
	}

	public Matiere(String nom, Integer duree) {
		super();
		this.nom = nom;
		this.duree = duree;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public ArrayList<UE> getUes() {
		return ues;
	}

	public void setUes(ArrayList<UE> ues) {
		this.ues = ues;
	}

	public void addUe(UE ue) {
		this.ues.add(ue);
	}

	public ArrayList<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(ArrayList<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

	public void addFormateur(Formateur formateur) {
		this.formateurs.add(formateur);
	}

	@Override
	public String toString() {
		return "Matiere [id=" + id + ", nom=" + nom + ", duree=" + duree + "]";
	}

}
