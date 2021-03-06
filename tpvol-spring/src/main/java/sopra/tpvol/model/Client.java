package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity // obligatoire
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "disc")
public class Client {
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	@Version
	private int version;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String type;
	@Column(nullable = false)
	private String mail;
	private String telephone;
	@Embedded
	private Adresse adresse;
	@OneToOne
	@JoinColumn(name="utilisateur_id")
	private Utilisateur utilisateur;
	@OneToMany(mappedBy = "client")
	private List<Reservation> reservations = new ArrayList<Reservation>();
	@OneToMany(mappedBy = "client")
	private List<Passager> passagers = new ArrayList<Passager>();

	public Client() {
		super();
	}

	public Client(String nom) {
		super();
		this.nom = nom;
	}

	public Client(String nom, String mail, String telephone) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.telephone = telephone;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void addReservation(Reservation reservations) {
		this.reservations.add(reservations);
	}

	public List<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(List<Passager> passagers) {
		this.passagers = passagers;
	}

	public void addPassager(Passager passagers) {
		this.passagers.add(passagers);
	}

	@Override
	public String toString() {
		return "Client [version=" + version + ", nom=" + nom + ", type=" + type + ", mail=" + mail + ", telephone="
				+ telephone + ", adresse=" + adresse + ", utilisateur=" + utilisateur + "]";
	}

}
