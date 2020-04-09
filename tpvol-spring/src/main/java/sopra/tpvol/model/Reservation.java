package sopra.tpvol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity // obligatoire
@Table
public class Reservation {
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	private Boolean annulee;
	private Boolean confirmee;
	private Boolean ouverte;
	private String numeroDeReservation;
	@OneToOne
	@JoinColumn(name = "paiement_id")
	private Paiement paiement;
	@OneToOne
	@JoinColumn(name = "trajet_id")
	private Trajet trajet;
	@ManyToOne
	@JoinColumn(name = "passenger_id")
	private Passager passager;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	@Version
	private int version;

	public Reservation(Boolean annulee, Boolean confirmee, Boolean ouverte, String numeroDeReservation) {
		super();
		this.annulee = annulee;
		this.confirmee = confirmee;
		this.ouverte = ouverte;
		this.numeroDeReservation = numeroDeReservation;
	}

	public Reservation() {
		super();
	}

	public Boolean getAnnulee() {
		return annulee;
	}

	public void setAnnulee(Boolean annulee) {
		this.annulee = annulee;
	}

	public Boolean getConfirmee() {
		return confirmee;
	}

	public void setConfirmee(Boolean confirmee) {
		this.confirmee = confirmee;
	}

	public Boolean getOuverte() {
		return ouverte;
	}

	public void setOuverte(Boolean ouverte) {
		this.ouverte = ouverte;
	}

	public String getNumeroDeReservation() {
		return numeroDeReservation;
	}

	public void setNumeroDeReservation(String numeroDeReservation) {
		this.numeroDeReservation = numeroDeReservation;
	}

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Reservation [annulee=" + annulee + ", confirmee=" + confirmee + ", ouverte=" + ouverte
				+ ", numeroDeReservation=" + numeroDeReservation + ", paiement=" + paiement + ", passager=" + passager
				+ ", client=" + client + "]";
	}

}
