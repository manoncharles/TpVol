package sopra.tpvol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.NotEmpty;

@Entity // obligatoire
@Table
public class Passager {
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	@NotEmpty
	private String nom;
	private String prenom;
	@NotEmpty
	private Date dateDeNaissance;
	@NotEmpty
	private String nationalite;
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private Civilite civilite;
	@NotEmpty
	private String numeroID;
	@NotEmpty
	@Temporal(TemporalType.DATE)
	private Date dateValiditeID;
	@NotEmpty
	@Enumerated(EnumType.STRING)
	private TypeID typeID;
	@NotEmpty
	private Boolean handicap;
//	@ManyToOne
//	@JoinColumn(name= "client_id")
	@Transient
	private Client client;
	// @OneToMany(mappedBy = "passager")
	private List<Reservation> reservations = new ArrayList<Reservation>();
	@Version
	private int version;

	public Passager() {
		super();
	}

	public Passager(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(String numeroID) {
		this.numeroID = numeroID;
	}

	public Date getDateValiditeID() {
		return dateValiditeID;
	}

	public void setDateValiditeID(Date dateValiditeID) {
		this.dateValiditeID = dateValiditeID;
	}

	public TypeID getTypeID() {
		return typeID;
	}

	public void setTypeID(TypeID typeID) {
		this.typeID = typeID;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Boolean getHandicap() {
		return handicap;
	}

	public void setHandicap(Boolean handicap) {
		this.handicap = handicap;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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

	@Override
	public String toString() {
		return "Passager [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
				+ ", nationalite=" + nationalite + ", civilite=" + civilite + ", numeroID=" + numeroID
				+ ", dateValiditeID=" + dateValiditeID + ", typeID=" + typeID + ", handicap=" + handicap + "]";
	}

}
