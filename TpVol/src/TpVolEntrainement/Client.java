package TpVolEntrainement;

import java.util.ArrayList;

public class Client {
	private String nom;
	private String type;
	private String mail;
	private String telephone;
	private int numeroAdresse;
	private String rue;
	private String complementAdresse;
	private int codePostal;
	private String ville;
	private String pays;
	private Utilisateur utilisateur;
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	private ArrayList<Passager> passagers = new ArrayList<Passager>();

	public Client() {
		super();
	}

	public Client(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getNumeroAdresse() {
		return numeroAdresse;
	}

	public void setNumeroAdresse(int numeroAdresse) {
		this.numeroAdresse = numeroAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getComplementAdresse() {
		return complementAdresse;
	}

	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void addReservation(Reservation reservations) {
		this.reservations.add(reservations);
	}

	public ArrayList<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(ArrayList<Passager> passagers) {
		this.passagers = passagers;
	}

	public void addPassager(Passager passagers) {
		this.passagers.add(passagers);
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", type=" + type + ", mail=" + mail + ", telephone=" + telephone
				+ ", numeroAdresse=" + numeroAdresse + ", rue=" + rue + ", complementAdresse=" + complementAdresse
				+ ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays + ", utilisateur=" + utilisateur
				+ "]";
	}

}
